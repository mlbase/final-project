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
	
	@PostMapping(value="/book")
	public String createbook(BookDto dto) {
		String msg = "책정보 업로드에 실패했습니다.";
		
		boolean b = false;
		
		b = service.postbook(dto);
		
		if(b) {
			msg = "책정보 업로드에 성공했습니다.";
		}
		
		return msg;
	}
	
	@PostMapping(value="/order")
	public String createorder(OrderDto dto) {
		String msg = "주문에 실패했습니다.";
		
		boolean b = false;
		
		b = service.postorder(dto);
		
		if(b) {
			msg = "주문해주셔서 감사합니다!.";
		}
	
		return msg;
	}
	
	@GetMapping(value="/book")
	public List<BookDto> booklist() {
		List<BookDto> list = service.booklist();
		
		return list;
	}
	
	@GetMapping(value="/order")
	public List<OrderDto> orderlist(String id) {
		List<OrderDto> list = service.orderlist();
		
		return list;
	}
	
	
	
	
}
