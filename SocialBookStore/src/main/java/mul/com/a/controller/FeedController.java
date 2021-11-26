package mul.com.a.controller;

import java.io.BufferedOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import mul.com.a.dto.CommentDto;
import mul.com.a.dto.FeedDto;
import mul.com.a.service.FeedService;

@RestController
public class FeedController {

	@Autowired
	FeedService service;
	
	@RequestMapping(value = "/fileupload", method = RequestMethod.POST)
	public String fileupload(@RequestParam("uploadFile")
							MultipartFile uploadFile, HttpServletRequest req,
							String message) {
		System.out.println("FeedController fileupload");
		
		System.out.println("message: " + message);
	
		// 경로
		//server: 3000
		String uploadPath = req.getServletContext().getRealPath("/upload");
		//폴더
		//String uploadPath = "d://temp";
		String expansion[] = uploadFile.getOriginalFilename().split("\\.");
		
		
		String filename = Long.toString(new Date().getTime())+"."+expansion[1];
		 
		String filepath = uploadPath + File.separator + filename;
										// '/'
		System.out.println(filepath);
		
		
		try {
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
			os.write(uploadFile.getBytes());
			os.close();
			
			// db input
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "file upload fail";
		}
		
		return filename;
	}
	
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
