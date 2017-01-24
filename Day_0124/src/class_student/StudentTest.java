package class_student;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentDao dao = StudentDao.getInstance();
		
		boolean run = true;
		while(run){
			System.out.println("1.학생생성 | 2.학생수정 | 3.학생삭제 | 4.종료");
			int num  = scan.nextInt();
			if(num ==1) {
				System.out.print("이름 입력");
				String name = scan.next();
				System.out.print("나이 입력");
				int age = scan.nextInt();
				System.out.print("점수 입력");
				int score = scan.nextInt();
				
				dao.insertStudent(name, age, score);
				
				
			} else if(num==2) {
				System.out.print("학번 입력");
				int id = scan.nextInt();
				System.out.print("이름 입력");
				String name = scan.next();
				System.out.print("나이 입력");
				int age = scan.nextInt();
				System.out.print("점수 입력");
				int score = scan.nextInt();
				
				dao.updateStudent(id, name, age, score);
				
			} else if(num==3){
				System.out.print("학번 입력");
				int id = scan.nextInt();
				
				dao.deleteStudent(id);
				
			}else if(num==4)
				run = false;
		}
		dao.close();
	}
}
