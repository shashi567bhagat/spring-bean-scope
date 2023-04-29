package com.spring.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/beanscope/config.xml");
		
		Emp em=context.getBean("employee",Emp.class);
		
        System.out.println(em.hashCode());
		
		Emp em1=context.getBean("employee",Emp.class);
		
		System.out.println(em1.hashCode());
		
    }
    
}
