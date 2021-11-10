package mul.com.a.service;

import java.util.List;

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
	
	public boolean postcomment(CommentDto dto) {
		return dao.postcomment(dto)>0?true:false;
	}
	
	public List<CommentDto> commentlist(int feedSeq){
		return dao.commentlist(feedSeq);
	}
}
