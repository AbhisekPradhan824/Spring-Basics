package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	//HAS-A relation
	private LocalDateTime ldt;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator 0-Param constructor");
	}

	//Setter method for setter injection
	@Autowired
	public void setLdt(LocalDateTime ldt) {
		System.out.println("WishMessageGenerator.setLdt()");
		this.ldt = ldt;
	}
	
	//Business Method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		//Getting Hour value from the system time
		int hr = ldt.getHour();
		
		
		//Wish message Generator
		if(hr<12) {
			return "Good Morning "+user;
		}else if(hr>12 && hr<16) {
			return " Good Afternoon "+user;
		}else if(hr>16 && hr<20) {
			return " Good Evening "+user;
		}else {
			return "Good Night "+user;
		}
	}
	
	
	
	
}
