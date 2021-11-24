package mul.com.a.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mul.com.a.dao.FeedDao;
import mul.com.a.dto.CommentDto;
import mul.com.a.dto.FeedDto;

@Transactional
@Repository
public class FeedService {

	@Autowired
	FeedDao dao;
	
	public boolean postfeed(FeedDto dto) {
		return dao.postfeed(dto)>0?true:false;
	}
	
	public List<FeedDto> feedlist(){
		return dao.feedlist();
	}
	
	public List<FeedDto> myfeed(String id){
		return dao.myfeed(id);
	}
	
	public List<FeedDto> myfeed2(Map<String, Object> map){
		return dao.myfeed2(map);
	}
	
	public boolean postcomment(CommentDto dto) {
		return dao.postcomment(dto)>0?true:false;
	}
	
	public List<CommentDto> commentlist(int feedSeq){
		return dao.commentlist(feedSeq);
	}
	public List<FeedDto> newsfeed(Map<String, Object> map){
		return dao.newsfeed(map);
	}

	public List<FeedDto> bestfeed(Map<String, Object> map){
		return dao.bestfeed(map);
	}
}
