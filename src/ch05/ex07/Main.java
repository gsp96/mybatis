package ch05.ex07;

import java.util.List;

import ch05.domain.ex06.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		List<User> users = mapper.selectUsers(new int[] {1, 2});
		
		System.out.println(users);
	}
}