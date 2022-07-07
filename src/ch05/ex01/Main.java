package ch05.ex01;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		User user = mapper.selectUsers(new Search("john", null));
		//과제] 아래 문장에서, NullPointerException 을 해결하라
		user = mapper.selectUsers(new Search("john", new Post("정의", "")));
		
		user = mapper.selectUsers(new Search ("john", new Post(null, "고리")));
		System.out.println(user);
	}
}