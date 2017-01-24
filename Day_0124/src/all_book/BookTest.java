package all_book;

import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		BookDao dao = BookDao.getInstance();
		
		Scanner scan = new Scanner(System.in);

		// connection을 사용..
		Book book = new Book();
		boolean run = true;
		while (run) {
			System.out.println("1.책 생성 | 2.책 수정| 3.책 삭제 | 4.전체 책 조회 | 5.책 검색 | 6.종료");
			int num = scan.nextInt();
			if (num == 1) {
				dao.insertBook(book);
			} else if (num == 2) {
				dao.updateBook(book);
			} else if (num == 3) {
				dao.deleteBook(book);
			} else if (num == 4) {
				dao.selectAll();
			} else if (num == 5) {
				dao.selectOne(book);
			} else if (num == 6) {
				run = false;
				dao.close();
			}

		}

	
	}
}
