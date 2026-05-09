package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class SeasonGetter {
	
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx =new FileSystemXmlApplicationContext("src/com/nt/cfg/applicationContext.xml");
		Object obj=ctx.getBean("sf");
		SeasonFinder sf=(SeasonFinder)obj;
		
		String res = sf.getSeason("Hari Krishna");
		System.out.println(res);
		ctx.close();
	}

}
