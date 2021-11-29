package mul.com.a.controller;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import mul.com.a.dto.UserDto;
import mul.com.a.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@PostMapping(value="/login")
	public UserDto login(String id, String pwd){
		
		String encodedpwd = service.getpw(id);
		
		boolean b = false;
		
		b = encoder.matches(pwd, encodedpwd);
		
		UserDto dto = new UserDto();
		
		if(b) {
			dto = service.login(id,encodedpwd);
			
			return dto;
		}
		

		return dto;
		
	}
	
	@PostMapping(value="/create")
	public String register(UserDto dto){
		String msg = "NO";
		
		//System.out.println(dto.toString());

		
		boolean b = false;
		b = service.register(dto);
		//System.out.println(b);
		if(b) {
			msg = "OK";
		}
		
		return msg;
	}
	
	@GetMapping("/change")
	public String passwordchange(String id, String pwd, String new_pwd){
		String msg = "비밀번호변경에 실패했습니다";
		
		boolean b = false;
		b = encoder.matches(pwd, service.getpw(id));
		//System.out.println(b);
		if(b) {
			b = service.pwdchange(id, new_pwd);
		}
				
		if(b) {
			msg = "비밀번호변경에 성공했습니다";
		}
		
		return msg;
	}
	
	@PostMapping(value="/id")
	public String idcheck(String id) {
		
		String msg = "NO";
		
		boolean b = false;
		
		b = service.idcheck(id);
		//System.out.println(b);
		if(b) {
			msg = "YES";
		}
		
		return msg; 
	}
	
	@GetMapping(value="/userlist")
	public List<UserDto> getUserlist(String nickname){
		List<UserDto> list = null;
		
		list = service.getUserlist(nickname);
		
		return list;
	}
	
	 @GetMapping(value="/updateIntro") 
	 public String updateIntro(String nickname, String introduce) { 
		System.out.println("UserController updateIntro()");
		System.out.println(nickname+introduce);
	 	boolean b = service.updateIntro(nickname,introduce);
	  
	 	if(!b) { 
	 		return "NG";
	 	} 
	 	
	 	return "OK";
	 }
	
	 @RequestMapping(value = "/profileload", method = RequestMethod.POST)
		public String profileupload(@RequestParam("uploadFile")
								MultipartFile uploadFile, HttpServletRequest req,
								String nickname) {
			System.out.println("UserController profileupload");
			
			System.out.println("nickname: " + nickname);
		
			// 경로
			//server: 3000
			String uploadPath = req.getServletContext().getRealPath("/profile");
			//폴더
			//String uploadPath = "d://temp";
			String expansion[] = uploadFile.getOriginalFilename().split("\\.");
			
			
			String filename = Long.toString(new Date().getTime())+"."+expansion[1];
			 
			String filepath = uploadPath + File.separator + filename;
											// '/'
			System.out.println(filepath);
			
			String msg = "file upload fail";
			
			try {
				BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
				os.write(uploadFile.getBytes());
				os.close();
				
				// db input
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				return msg;
			}
			boolean b = false;
			
			b = service.updatefilename(nickname, filename);
			
			if(b) {
				msg = "file upload success";
			}
			
			return msg;
		}
	 
}
