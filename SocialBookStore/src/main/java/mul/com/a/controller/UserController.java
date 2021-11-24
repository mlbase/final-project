package mul.com.a.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


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
	
	/*
	 * @GetMapping("/updateIntro") public String updateIntro(String id, String
	 * introduce, String new_intro) { String msg = "NO";
	 * 
	 * boolean b = false;
	 * 
	 * b = service.updateIntro(id, new_intro);
	 * 
	 * if(b) { msg = "YES"; } return msg; }
	 */
	
	
}
