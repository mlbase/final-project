package mul.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import mul.com.a.dto.LikeDto;
import mul.com.a.dto.MessageDto;

@Mapper
@Repository
public interface SocialDao {

	int feedlikecount(int feedSeq);
	
	int commentlikecount(int commentSeq);
	
	int postmessage(MessageDto dto);
	
	List<MessageDto> messagelist(@Param("id") String id,@Param("myid") String myid);
	
	int postlike(LikeDto dto);
	
	int feedlikeinspect(LikeDto dto);
	
	int commentlikeinspect(LikeDto dto);
	
	int commentCount(int feedSeq);
	
	List<MessageDto> messageIsent(@Param("id")String id,@Param("opponentid") String opponentid);
	
	List<MessageDto> whoSentlist(String id);
}
