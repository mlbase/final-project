package mul.com.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import mul.com.a.dto.BookDto;
import mul.com.a.dto.OrderDto;
import mul.com.a.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService service;
	
	@PostMapping(value="/title")
	public String titlecheck(String title) {
		String msg ="NO";
		
		boolean b = false;
		
		b = service.titlecheck(title);
		
		if(b) {
			msg = "YES";
		}
		
		return msg;
	}
	
	@PostMapping(value="/book")
	public String createbook(BookDto dto) {
		String msg = "";
		
		boolean b = false;
		
		b = service.postbook(dto);
		
		if(b) {
			msg = "OK";
		}
		
		return msg;
	}
	
	@PostMapping(value="/order")
	public String createorder(OrderDto dto) {
		String msg = "";
		
		boolean b = false;
		
		b = service.postorder(dto);
		
		if(b) {
			msg = "OK";
		}
	
		return msg;
	}
	
	@GetMapping(value="/booklist")
	public List<BookDto> booklist() {
		List<BookDto> list = service.booklist();
		for (BookDto dto : list) {
			System.out.println(dto.toString());
		}
		return list;
	}
	
	@GetMapping(value="/orderlist")
	public List<OrderDto> orderlist(String id) {
		List<OrderDto> list = service.orderlist();
		
		return list;
	}
	
	
	
	
}
