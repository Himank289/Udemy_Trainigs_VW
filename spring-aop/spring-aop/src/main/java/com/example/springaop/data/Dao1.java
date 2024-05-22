package com.example.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
  public String retrieveSomething(){
      return "returning something from dao1";
  }

}
