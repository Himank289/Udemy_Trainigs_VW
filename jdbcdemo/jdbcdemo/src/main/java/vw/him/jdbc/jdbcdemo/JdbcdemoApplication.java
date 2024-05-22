package vw.him.jdbc.jdbcdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vw.him.jdbc.jdbcdemo.entity.Person;
import vw.him.jdbc.jdbcdemo.jdbc.PersonjdbcDao;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class JdbcdemoApplication  implements CommandLineRunner {


	@Autowired
	PersonjdbcDao dao;

	private Logger logger= LoggerFactory.getLogger(this.getClass());


	public static void main(String[] args) {
		SpringApplication.run(JdbcdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("user with id"+dao.findById(10001));
		logger.info("user deleted with id"+dao.deleteById(10002));
		logger.info("user inserted "+dao.insert(new Person(10004,"himank","hapur",new Date())));
		logger.info("user updated "+dao.update(new Person(10004,"himank","ghaizabad",new Date())));
		logger.info("all users"+dao.findAll());

	}
}
