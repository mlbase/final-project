package mul.com.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mul.com.a.dao.BookDao;
import mul.com.a.dto.BookDto;
import mul.com.a.dto.OrderDto;

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
		
		dto.setCard_num(encoder.encode(dto.getCard_num()));
		
		return dao.postorder(dto)>0?true:false;
	}
}
