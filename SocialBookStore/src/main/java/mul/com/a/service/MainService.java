package mul.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mul.com.a.dao.MainDao;
import mul.com.a.dto.BookDto;

@Transactional
@Repository
public class MainService {

	@Autowired
	MainDao dao;
	
	public List<BookDto> bestsellerimage() {
		return dao.bestsellerimage();
	}
}
