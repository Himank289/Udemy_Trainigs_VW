package vw.him.jdbc.jdbcdemo.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import vw.him.jdbc.jdbcdemo.entity.Person;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonjdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    class PersonRowMapper implements RowMapper{

        @Override
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person p=new Person();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setLocation(rs.getString("location"));
            p.setBirthDate(rs.getTimestamp("birth_date"));
            return p;
        }
    }

//    public List<Person> findAll(){
//       return jdbcTemplate.query("select * from person",new BeanPropertyRowMapper<Person>(Person.class));
//    }

    public List<Person> findAll(){
       return jdbcTemplate.query("select * from person",new PersonRowMapper());
    }
    public Person findById(int id){
       return (Person) jdbcTemplate.queryForObject("select * from person where id=?",new Object[]{id},new BeanPropertyRowMapper<Person>(Person.class));
    }
    public int deleteById(int id){
       return  jdbcTemplate.update("delete from person where id=?",new Object[]{id});
    }

    public int insert(Person p){
        return  jdbcTemplate.update("insert into person (id,name,location,birth_date )"+"values(?,?,?,?)",new Object[]{p.getId(),p.getName(),p.getLocation(),new Timestamp(p.getBirthDate().getTime())});
    }

    public int update(Person p){
        return  jdbcTemplate.update("update person set name=?,location=?,birth_date=?"+"where id=?",new Object[]{p.getName(),p.getLocation(),new Timestamp(p.getBirthDate().getTime()),p.getId()});
    }
}
