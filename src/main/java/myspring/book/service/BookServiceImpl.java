package myspring.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.book.dao.BookDao;
import myspring.book.vo.BookVO;


@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookdao;

	public List<BookVO> getBookList() {
		return bookdao.readAll();
	}

	@Override
	public BookVO getBook(String id) {
		return bookdao.read(id);
	}

}
