package mul.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mul.com.a.dao.BookDao;
import mul.com.a.dto.BookDto;
import mul.com.a.dto.Bookparam;
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
	
	public List<OrderDto> orderlist(String id){
		return dao.orderlist(id);
	}
	
	public boolean titlecheck(String title) {
		return dao.bookcheck(title)>0?true:false;
	}
	
	public BookDto getbook(int seq) {
		return dao.getbook(seq);
	}
	
	public boolean postwish(WishDto dto) {
		return dao.postwish(dto)>0?true:false;
	}
	
	public List<WishDto> wishlist(String id){
		return dao.wishlist(id);
	}
	
	public List<BookDto> booklistsort(Bookparam param){
		return dao.booklistsort(param);
	}
	
	public List<BookDto> booklistgenre(Bookparam param){
		/* System.out.println(param.toString()); */
		return dao.booklistgenre(param);
	}
	
	public int booksortcount(Bookparam param) {
		return dao.bookcountsort(param);
	}
	
	public int bookgenrecount(Bookparam param) {
		
		return dao.bookcountgenre(param);
	}
	
	public boolean wishdelete(int seq) {
		return dao.deletewish(seq)>0?true:false;
	}
	
	public boolean wishreset(String id) {
		return dao.resetwish(id)>0?true:false;
	}
}
