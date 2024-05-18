package com.telusko.SpringRefresher2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.SpringRefresher2.Appconfig.Appconfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
    	Desktop desk= context.getBean(Desktop.class);
    	desk.compile();
    	Alien obj = (Alien)context.getBean(Alien.class);
    	int x = obj.getAge();
    	System.out.println(x);
    	obj.code();
//        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml") ;
//		
//		Alien obj = (Alien)context.getBean("alien1");
//		//Type casting the object here because context.get bean gives the type of the object 
//          int x =		obj.getAge();
//         System.out.println(x);
//		obj.code();
//		Alien obj2 = (Alien)context.getBean("alien1"); 
//		
//		obj2.code();
    }
}
