package mul.com.a.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public List<FeedDto> myfeed(
		@RequestParam(value="nickname", defaultValue = "") String nickname,
		@RequestParam(value="currentPage", defaultValue = "1") int currentPage,
		@RequestParam(value="rowsperPage", defaultValue = "10") int rowsperPage
		) {
//		list = service.myfeed(id);
		
		
		if("".equals(nickname)) {
			return null;
		}
		Map<String,Object> map = new HashMap();
		map.put("currentPage", currentPage);
		map.put("rowsperPage", rowsperPage);
		map.put("nickname", nickname);
		List<FeedDto> list = null;
		list = service.myfeed2(map);
		
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
	
	@GetMapping(value="/bestfeed")
	public List<FeedDto> bestfeed(
			@RequestParam(value="currentPage", defaultValue = "1") int currentPage,
			@RequestParam(value="rowsperPage", defaultValue = "10") int rowsperPage
			) {
//			list = service.myfeed(id);
			
			
			
			Map<String,Object> map = new HashMap();
			map.put("currentPage", currentPage);
			map.put("rowsperPage", rowsperPage);
			List<FeedDto> list = null;
			list = service.bestfeed(map);
			
			return list;
	}
	
	@GetMapping(value="/newsfeed")
	public List<FeedDto> newsfeed(
			@RequestParam(value="currentPage", defaultValue = "1") int currentPage,
			@RequestParam(value="rowsperPage", defaultValue = "10") int rowsperPage
			) {
		
		
		Map<String,Object> map = new HashMap();
		map.put("currentPage", currentPage);
		map.put("rowsperPage", rowsperPage);
		List<FeedDto> list = null;
		list = service.newsfeed(map);
		
		return list;
	}
	
	@GetMapping(value="/comment")
	public List<CommentDto> comment(int feedSeq) {
		List<CommentDto> list = null;
		
		list = service.commentlist(feedSeq);
		
		return list;
	}
}
