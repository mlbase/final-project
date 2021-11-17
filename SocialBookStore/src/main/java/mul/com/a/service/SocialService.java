package mul.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mul.com.a.dao.SocialDao;
import mul.com.a.dto.LikeDto;
import mul.com.a.dto.MessageDto;

@Transactional
@Service
public class SocialService {

	@Autowired
	SocialDao dao;
	
	public int commentlikecount(int commentSeq) {
		return dao.commentlikecount(commentSeq);
	}
	
	public int feedlikecount(int feedSeq) {
		return dao.feedlikecount(feedSeq);
	}
	
	public boolean postmessage(MessageDto dto) {
		return dao.postmessage(dto)>0?true:false;
	}
	
	public List<MessageDto> messagelist(String id) {
		return dao.messagelist(id);
	}
	
	public boolean postlike(LikeDto dto) {
		return dao.postlike(dto)>0?true:false;
	}
	
	public boolean feedlikeinspect(LikeDto dto) {
		
		return dao.feedlikeinspect(dto)>0?true:false;
	}
	
	public boolean commentlikeinspect(LikeDto dto) {
		
		return dao.commentlikeinspect(dto)>0?true:false;
	}
}
