package com.tedu.conf;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration	//表示该类是一个配置类(配置文件写在类中)
public class CalendarConf {
	
	@Bean
	public Calendar getCalendar(){
		System.out.println("我是一个多例对象");
		return Calendar.getInstance();
	}
}
