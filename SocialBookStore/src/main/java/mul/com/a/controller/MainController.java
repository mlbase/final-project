package mul.com.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mul.com.a.dto.BookDto;
import mul.com.a.service.MainService;

@RestController
public class MainController {

	@Autowired
	MainService service;
	
	@GetMapping(value="/bestsellerimage")
	public List<BookDto> bestsellerimage() {
		List<BookDto> list = service.bestsellerimage();
		
		return list;
	}
}
