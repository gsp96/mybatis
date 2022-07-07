package ch02.ex03;			

import java.time.LocalDate;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		/*
		if(mapper.insertUser(new User(11, "abel", LocalDate.of(2021, 12, 16))) > 0)
			System.out.println("11 추가 성공");*/
		
		/*if(mapper.insertUser(new User(12,null,null)) > 0)//jdbcType을 추가해주지 않으면 null값이라서 mybatis에서 원하는 parameter값을 충족하지못해 오류가 난다. 
			System.out.println("12추가 성공");*/
		
		/*if(mapper.insertUser2(13, "kianu", LocalDate.of(2021, 12, 16)) > 0)
			System.out.println("13 추가 성공");*/
		if(mapper.insertUser3(14, "neo", LocalDate.of(2023, 12, 23)) > 0)
			System.out.println("14 추가 성공");
	}
}