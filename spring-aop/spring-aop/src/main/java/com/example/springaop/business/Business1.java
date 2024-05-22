package com.example.springaop.business;

//import org.springframework.stereotype.Repository;
import com.example.springaop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    Dao1 dao;
  public String calculateSomething(){
      return dao.retrieveSomething();
  }

}
