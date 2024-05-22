package com.example.springaop.business;

//import org.springframework.stereotype.Repository;
import com.example.springaop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class Business2 {
    @Autowired
    Dao2 da;
  public String calculateSomething(){
      return da.retrieveSomething();
  }

}
