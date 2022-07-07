package ch02.ex01;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);//class.class하면 class타입의 객체가 return 된다.
		
		for(User user: mapper.selectUsers())
			System.out.println(user);
	}
	//Class<ch02.ex01.Map>
}