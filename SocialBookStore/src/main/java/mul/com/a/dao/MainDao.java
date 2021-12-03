package mul.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import mul.com.a.dto.BookDto;
@Mapper
@Repository
public interface MainDao {

	List<BookDto> bestsellerimage();
}
