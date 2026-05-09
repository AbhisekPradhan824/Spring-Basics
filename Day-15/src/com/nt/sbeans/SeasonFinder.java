package com.nt.sbeans;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder{
	private LocalDate ldt;
	public SeasonFinder() {
		// TODO Auto-generated constructor stub
		System.out.println("SeasonFinder 0- Param constructor executed...");
	}

	@Autowired
	public void setLdt(LocalDate ldt) {
		System.out.println("SeasonFinder.setLdt()");
		this.ldt = ldt;
	}
	
	public String getSeason(String user) {
		int month = ldt.getMonthValue();
		
		if(month>=1 && month<4) {
			return "Hello "+user+" This is Spring Season..";
		}else if(month>=4 && month<6) {
			return "Hello "+user+" This is Summer Season..";
		}else if(month>=6 && month<9) {
			return "Hello "+user+" This is Rainy Season..";
		}else {
			return "Hello "+user+" This is Winter Season..";
			
		}
	}
	
	
}
