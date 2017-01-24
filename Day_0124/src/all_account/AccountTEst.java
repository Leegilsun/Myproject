package all_account;

import java.util.Scanner;

public class AccountTEst {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AccountDao acc = AccountDao.getInstance();

		boolean run = true;
		while (run) {
			System.out.println("===============================");
			System.out.println("1.계좌추가 2.계좌수정 3.계좌삭제 4.조회 5.종료 6.입금 7.출금 8.이체");
			System.out.println("===============================");
			System.out.print("선택> ");
			int select = scan.nextInt();

			if (select == 1) {
				System.out.print("계좌번호 ");
				String ano = scan.next();
				System.out.print("계좌주 ");
				String owner = scan.next();
				System.out.print("금액 ");
				int balance = scan.nextInt();
				acc.insert(ano, owner, balance);
			} else if (select == 2) {

				System.out.print("금액 ");
				int balance = scan.nextInt();
				System.out.print("계좌번호 ");
				String ano = scan.next();
				acc.update(ano, acc.selectOne(ano).getOwner(), balance);
			} else if (select == 3) {
				System.out.print("계좌번호 ");
				String ano = scan.next();
				acc.delete(ano);
			} else if (select == 4) {
				// for(int i=0; i<acc.selectAll().size(); i++)
				// System.out.println(acc.selectAll().get(i));
				acc.selectAll();
			} else if (select == 5) {
				System.out.println("종료합니다");
				run = false;
			} else if (select == 6) {
				System.out.print("금액 ");
				int balance = scan.nextInt();
				System.out.print("계좌번호 ");
				String ano = scan.next();
				acc.update(ano, acc.selectOne(ano).getOwner(), acc.selectOne(ano).getBalance() + balance);
			} else if (select == 7) {
				System.out.print("금액 ");
				int balance = scan.nextInt();
				System.out.print("계좌번호 ");
				String ano = scan.next();
				if (acc.selectOne(ano).getBalance() - balance > 0)
					acc.update(ano, acc.selectOne(ano).getOwner(), acc.selectOne(ano).getBalance() - balance);
				else
					System.out.println("잔액부족");
			} else if (select == 8) {
				System.out.print("금액 ");
				int balance = scan.nextInt();
				System.out.print("계좌번호 ");
				String ano = scan.next();
				System.out.print("계좌번호 ");
				String ano2 = scan.next();
				if (acc.selectOne(ano).getBalance() - balance > 0) {
					acc.update(ano, acc.selectOne(ano).getOwner(), acc.selectOne(ano).getBalance() - balance);
					acc.update(ano2, acc.selectOne(ano2).getOwner(), acc.selectOne(ano2).getBalance() + balance);
				} else
					System.out.println("잔액부족");
			}

		}

	}

}
