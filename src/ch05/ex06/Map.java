package ch05.ex06;

import java.util.List;

import ch05.domain.ex06.Search;
import ch05.domain.ex06.User;

public interface Map {
	List<User> selectUsers(Search search);
}