package ch02.ex05;

import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		if(mapper.deleteUser(11) > 0) //삭제한 record의 개수를 리턴
			System.out.println("삭제 성공");
	}
}