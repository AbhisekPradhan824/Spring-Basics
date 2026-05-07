package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	
	public static void main(String[] args) {
		//Creating the IOC Container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfg/applicationContext.xml");
		
		//Getting the target bean class object by using getBean() method
		Object obj =ctx.getBean("wmg");
		
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		//Invoke Wish Message Generator
		String result=generator.generateWishMessage("Hari");
		
		System.out.println("Result: "+result);
		ctx.close();
	}//Main end

}//Class End
