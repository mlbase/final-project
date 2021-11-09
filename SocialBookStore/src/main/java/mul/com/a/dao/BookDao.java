package mul.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import mul.com.a.dto.BookDto;
import mul.com.a.dto.OrderDto;

@Mapper
@Repository
public interface BookDao {

	int postbook(BookDto dto);
	
	int postorder(OrderDto dto);
	
	List<BookDto> booklist();
	
	List<OrderDto> orderlist();
	
	int bookcheck(String title);
}
