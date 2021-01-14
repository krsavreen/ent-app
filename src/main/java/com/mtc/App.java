package com.mtc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mtc.business.domain.Tester;

/**
 * Hello world!
 *
 */
public class App 
{
	ApplicationContext context;
	
    public static void main( String[] args ){
    	
    	App app = new App();
    	
    	app.execute();   
    }
    
    public void execute() {
    	context = new ClassPathXmlApplicationContext("classpath:spring.xml");
    	
    	//Test to check that spring is wired up correctly
    	Tester tester = (Tester) context.getBean("tester");
    	tester.test();
    }
}
