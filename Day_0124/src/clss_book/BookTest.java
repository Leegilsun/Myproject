package clss_book;

public class BookTest {
	public static void main(String[] args) {
		BookDao dao = BookDao.getInstance();
		
		dao.insertBook("오버로드", "몰라", "2016", 10000);
		dao.updateBook(1, "오버로드2부", 10400);
		dao.deleteBook(5);
	}
}
