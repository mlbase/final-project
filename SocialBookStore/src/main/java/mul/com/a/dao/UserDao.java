package mul.com.a.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import mul.com.a.dto.UserDto;

@Mapper
@Repository
public interface UserDao {

	UserDto login(String id, String pwd);
	
	int register(UserDto dto);
	
	int pwdchange(String id, String new_pwd);
	
	String getpwd(String id);
	
	int idcheck(String id);
}
