package ch07.ex01;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import ch07.domain.User;

public interface Map {
	@Select("select user_id userId, user_name userName, reg_date regDate " +
			"from users "+
			"order by user_id") //띄어쓰기 하는것을 주의할 것 띄어쓰기를 하지않으면 오류가 난다.
	List<User> selectUsers();
}
