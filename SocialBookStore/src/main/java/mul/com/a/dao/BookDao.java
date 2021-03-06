package mul.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import mul.com.a.dto.BookDto;
import mul.com.a.dto.Bookparam;
import mul.com.a.dto.OrderDto;
import mul.com.a.dto.WishDto;

@Mapper
@Repository
public interface BookDao {

	int postbook(BookDto dto);
	
	int postorder(OrderDto dto);
	
	List<BookDto> booklist();
	
	List<OrderDto> orderlist(String id);
	
	int bookcheck(String title);
	
	BookDto getbook(int seq);
	
	int postwish(WishDto dto);
	
	List<WishDto> wishlist(String id);
	
	List<BookDto> booklistsort(Bookparam param);
	
	int bookcountsort(Bookparam param);
	
	int bookcountgenre(Bookparam param);
	
	List<BookDto> booklistgenre(Bookparam param);
	
	int deletewish(int seq);
	
	int resetwish(String id);
}
