package mul.com.a.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import mul.com.a.dto.CommentDto;
import mul.com.a.dto.FeedDto;
import mul.com.a.service.FeedService;

@RestController
public class FeedController {

	@Autowired
	FeedService service;
	
	@PostMapping(value="/feed")
	public String postfeed(FeedDto dto) {
		String msg = "";
		
		boolean b = false;
		
		b = service.postfeed(dto);
		
		if(b) {
			msg="OK";
		}
		
		return msg;
	}
	
	@GetMapping(value="/feedlist")
	public List<FeedDto> feedlist() {
		List<FeedDto> list = null;
		
		list = service.feedlist();
		
		return list;
	}
	
	@GetMapping(value="/myfeed")
	public List<FeedDto> myfeed(String id) {
		List<FeedDto> list = null;
		
		list = service.myfeed(id);
		
		return list;
	}
	
	@PostMapping(value="/comment")
	public String postfeed(CommentDto dto) {
		String msg = "";
		
		boolean b = false;
		
		b = service.postcomment(dto);
		
		if(b) {
			msg="OK";
		}
		
		return msg;
	}
	
	@GetMapping(value="/comment")
	public List<CommentDto> comment(int feedSeq) {
		List<CommentDto> list = null;
		
		list = service.commentlist(feedSeq);
		
		return list;
	}
}
