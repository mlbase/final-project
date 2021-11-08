package mul.com.a.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import mul.com.a.dto.BookDto;
import mul.com.a.dto.OrderDto;

@Mapper
@Repository
public interface BookDao {

	int postbook(BookDto dto);
	
	int postorder(OrderDto dto);
}
