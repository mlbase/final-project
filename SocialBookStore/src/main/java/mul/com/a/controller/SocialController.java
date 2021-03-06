package mul.com.a.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import mul.com.a.dto.LikeDto;
import mul.com.a.dto.MessageDto;
import mul.com.a.service.SocialService;

@RestController
public class SocialController {

	@Autowired
	SocialService service;
	
	@GetMapping(value="/commentlike")
	public int commentlike(int seq) {
		return service.commentlikecount(seq);
	}
	
	@GetMapping(value="/feedlike")
	public int feedlike(int seq) {
		return service.feedlikecount(seq);
	}
	
	@PostMapping(value="/like")
	public String like(LikeDto dto) {
		String msg = "";
		
		boolean b = false;
		
		b = service.commentlikeinspect(dto);
		
		if(b) {
			return "already";
		}
		
		b= service.feedlikeinspect(dto);
		
		if(b) {
			return "already";
		}
		
		b = service.postlike(dto);
		if(b) {
			msg = "OK";
		}
		
		return msg;
	}
	
	@PostMapping(value="/message")
	public String message(MessageDto dto) {
		System.out.println(dto.toString());
		String msg="";
		
		boolean b = false;
		b=service.postmessage(dto);
		
		if(b) {
			msg="OK";
		}
		
		return msg;
	}
	
	@PostMapping(value="/following")
	public String following(String nickname1, String nickname2) {
		String msg ="";
		
		return msg;
	}
	
	@GetMapping(value="/message")
	public List<MessageDto> getmessage(@Param("id")String id, String myid){
		List<MessageDto> list = null;
		
		list = service.messagelist(id, myid);
		
		return list;
	}
	
	@GetMapping(value="/commentcount")
	public int commentcount(int seq) {
		return service.commentCount(seq);
	}
	
	
	
	@GetMapping(value="/sentmessage")
	public List<MessageDto> messageIsent(@Param("id")String id, String opponentid){
		List<MessageDto> list = null;
		
		list = service.messageIsent(id, opponentid);
		
		return list;
	}
	
	@GetMapping(value="/whoSent")
	public List<MessageDto> whoSentlist(String id){
		List<MessageDto> list = null;
		
		list = service.whoSentlist(id);
		
		return list;
	}
}
