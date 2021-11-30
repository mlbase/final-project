package mul.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;

import mul.com.a.dto.LikeDto;
import mul.com.a.dto.MessageDto;

@Mapper
@Repository
public interface SocialDao {

	int feedlikecount(int feedSeq);
	
	int commentlikecount(int commentSeq);
	
	int postmessage(MessageDto dto);
	
	List<MessageDto> messagelist(String id);
	
	int postlike(LikeDto dto);
	
	int feedlikeinspect(LikeDto dto);
	
	int commentlikeinspect(LikeDto dto);
	
	int commentCount(int feedSeq);
}
