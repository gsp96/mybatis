package ch02.ex04;

import java.time.LocalDate;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		if(mapper.updateUser(new User(11, "king", LocalDate.of(2027, 7, 7))) > 0)
			System.out.println("업데이트가 성공했습니다.");
	}
}