package account_server;

import java.util.List;

import protocol.Account;

public class AccountService {
	private AccountDao ad;
	
	public AccountService() {
		ad= AccountDao.getInstance();
	}
	
	public boolean createAccount(String ano, String name, int bal) {
		Account a = ad.SelectOne(ano);
		if (a != null) {
			return false;
		} else
			ad.InsertAccount(ano, name, bal);
		return true;
	}

	public List<Account> accountList() {

		List<Account> temp = ad.SelectAll();
		return temp;
	}

	public int deposit(String ano, int bal) {
		Account temp = ad.SelectOne(ano);
		if (temp == null) {
			// System.out.println("존재하는 계좌번호가 없습니다.");
			return 2;
		} else {
			if (bal > 0) {
				ad.UpdateAccount(temp.getAno(), temp.getName(), temp.getBal() + bal);
				// System.out.println("예금이 성공되었습니다.");
				return 1;
			} else
				// System.out.println("입력한 예금액이 음수입니다.");
				return 3;
		}
	}

	public int withdraw(String ano, int bal) {

		Account temp = ad.SelectOne(ano);
		if (temp == null) {
			// System.out.println("존재하는 계좌번호가 없습니다.");
			return 2;
		} else {
			if (bal > 0 && temp.getBal() > bal) {
				ad.UpdateAccount(temp.getAno(), temp.getName(), temp.getBal() - bal);
				// System.out.println("출금이 성공되었습니다.");
				return 1;
			} else
				// System.out.println("입력한 예금액이 음수이거나 예금액보다 높습니다");
				return 3;
		}
	}

	public int delete(String ano) {

		Account a = ad.SelectOne(ano);
		if (a != null) {
			ad.DeleteAccount(ano);
			// System.out.println("삭제성공");
			return 1;
		} else {
			// System.out.println("해당 계좌가 없습니다.");
			return 2;
		}
	}

	public int transit(String ano, String ano2, int bal) {

		Account temp = ad.SelectOne(ano);
		Account temp2 = ad.SelectOne(ano2);

		if (temp == null || temp2 == null) {
			// System.out.println("존재하는 계좌번호가 없습니다.");
			return 2;
		} else if (bal < 0) {
			return 3; // 음수일때
		} else if (temp.getBal() < bal) {
			return 4; // 잔액부족
		} else {
			ad.UpdateAccount(temp.getAno(), temp.getName(), temp.getBal() - bal);
			ad.UpdateAccount(temp2.getAno(), temp2.getName(), temp2.getBal() + bal);
			return 1;
		}
	}
}
