package com.telusko.SpringRefresher2;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Laptop implements Computer 
{
  public Laptop()
  {
	  //System.out.println("Hey this is  Laptop object created");
  }
  public void compile()
  {
	  System.out.println("Compiling in laptop");
  }
}