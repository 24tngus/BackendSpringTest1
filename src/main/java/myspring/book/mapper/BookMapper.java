package myspring.book.mapper;

import java.util.List;
import myspring.book.vo.BookVO;

public interface BookMapper {
	BookVO selectBookById(String id);
	List<BookVO> selectBookList();
}
