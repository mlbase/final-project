package mul.com.a.dao;

import java.util.List;

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
	
	List<UserDto> getUserlist(String nickname);
	
	int updateIntro(String nickname, String introduce);
	
	int updatefilename(String nickname, String filename);
	
	int updateEmail(String id, String email); 
	
	int updateAddress(String id, String address); 
	
	
}
