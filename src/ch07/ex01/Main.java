package ch07.ex01;

import ch07.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		for(User user: mapper.selectUsers())
			System.out.println(user);
	}
}
