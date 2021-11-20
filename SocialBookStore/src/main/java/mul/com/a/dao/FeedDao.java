package mul.com.a.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import mul.com.a.dto.CommentDto;
import mul.com.a.dto.FeedDto;

@Mapper
@Repository
public interface FeedDao {

	int postfeed(FeedDto dto);
	
	List<FeedDto> feedlist();
	
	List<FeedDto> myfeed(String id);
	
	List<FeedDto> myfeed2(Map<String, Object> map);
	
	List<FeedDto> newsfeed(Map<String, Object> map);
	
	List<FeedDto> bestfeed(Map<String, Object> map);
	
	int postcomment(CommentDto dto);
	
	List<CommentDto> commentlist(int feedSeq);
}
