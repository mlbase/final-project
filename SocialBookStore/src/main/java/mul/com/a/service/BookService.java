package mul.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mul.com.a.dao.BookDao;
import mul.com.a.dto.BookDto;
import mul.com.a.dto.OrderDto;
import mul.com.a.dto.WishDto;

@Transactional
@Service
public class BookService {

	@Autowired
	BookDao dao;
	
	@Autowired
	PasswordEncoder encoder;
	
	public boolean postbook(BookDto dto) {

		return dao.postbook(dto)>0?true:false;
	}
	
	public boolean postorder(OrderDto dto) {
		
		dto.setCardNum(encoder.encode(dto.getCardNum()));
		
		return dao.postorder(dto)>0?true:false;
	}
	
	public List<BookDto> booklist(){
		return dao.booklist();
	}
	
	public List<OrderDto> orderlist(){
		return dao.orderlist();
	}
	
	public boolean titlecheck(String title) {
		return dao.bookcheck(title)>0?true:false;
	}
	
	public BookDto getbook(String title) {
		return dao.getbook(title);
	}
	
	public boolean postwish(WishDto dto) {
		return dao.postwish(dto)>0?true:false;
	}
	
	public List<WishDto> wishlist(String id){
		return dao.wishlist(id);
	}
}
