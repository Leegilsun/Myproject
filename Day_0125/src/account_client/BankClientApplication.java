package account_client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import protocol.Account;
import protocol.Message;

public class BankClientApplication {
	public static void main(String[] args) {
		Socket socket = null;
		ObjectOutputStream out = null;
		ObjectInputStream in = null;

		try{
			socket = new Socket("127.0.0.1",5000);
			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());
			Scanner scan = new Scanner(System.in);
			boolean run = true;
			while(run) {
				System.out.println("1.계좌생성 | 2.계좌조회 | 3.예금 | 4.출금 | 5.이체 | 6.삭제 | 7.종료");
				System.out.print("선택 >");
				int num = scan.nextInt();
				if(num ==1) {
					
					System.out.println("--------------");
					System.out.println("계좌 생성");
					System.out.println("--------------");

					System.out.print("계좌번호 : ");
					String ano = scan.next();

					System.out.print("계좌주 : ");
					String name = scan.next();

					System.out.print("초기 입금액 : ");
					int bal = scan.nextInt();

					Message sendMsg = new Message();
					sendMsg.setCood(1001);
					Map<String, Object>params = new HashMap<>();
					params.put("ANO", ano);
					params.put("NAME",name);
					params.put("BALANCE",bal);
					sendMsg.setParams(params);
					
					out.writeObject(sendMsg);
					out.flush();
					out.reset();
					Message receivedMsg = (Message) in.readObject();
					if(receivedMsg.getCood()==1101)
						System.out.println("계좌생성 성공");
					else if(receivedMsg.getCood()==1102)
						System.out.println("이미 존재하는 계좌번호입니다.");
				}else if(num==2) {
					System.out.println("--------------");
					System.out.println("계좌목록");
					System.out.println("--------------");
					Message sendMsg = new Message();
					sendMsg.setCood(2001);
					out.writeObject(sendMsg);
					out.flush();
					out.reset();
					Message receiveMsg = (Message)in.readObject();
					List<Account> list = (List<Account>)receiveMsg.getParams().get("LIST");
					for(int i=0; i<list.size(); i++) {
						System.out.println(list.get(i).toString());
					}
					
				} else if(num==3) {
					System.out.println("--------------");
					System.out.println("예금");
					System.out.println("--------------");
					System.out.print("계좌번호 : ");
					String ano = scan.next();
					System.out.print("입금액 : ");
					int bal = scan.nextInt();
					
					Message sendMsg = new Message();
					sendMsg.setCood(3001);
					Map<String, Object>params = new HashMap<>();
					params.put("ANO", ano);
					params.put("BALANCE", bal);
					sendMsg.setParams(params);
					out.writeObject(sendMsg);
					out.flush();
					out.reset();
					
					Message receiveMsg = (Message)in.readObject();
					if(receiveMsg.getCood()==3101)
						System.out.println("입금 성공");
					else if(receiveMsg.getCood()==3102)
						System.out.println("계좌없음");
					else if(receiveMsg.getCood()==3103)
						System.out.println("입금액이 음수");
				}else if(num==4){
					System.out.println("--------------");
					System.out.println("출금");
					System.out.println("--------------");
					System.out.print("계좌번호 : ");
					String ano = scan.next();
					System.out.print("출금액 : ");
					int bal = scan.nextInt();
					
					Message sendMsg = new Message();
					sendMsg.setCood(3002);
					Map<String, Object>params = new HashMap<>();
					params.put("ANO", ano);
					params.put("BALANCE", bal);
					sendMsg.setParams(params);
					out.writeObject(sendMsg);
					out.flush();
					out.reset();
					
					Message receiveMsg = (Message)in.readObject();
					if(receiveMsg.getCood()==3201)
						System.out.println("출금 성공");
					else if (receiveMsg.getCood()==3202)
						System.out.println("계좌없음");
					else if(receiveMsg.getCood()==3203)
						System.out.println("출금액이 음수이거나 잔액부족");
				} else if(num==5) {
					System.out.println("--------------");
					System.out.println("이체");
					System.out.println("--------------");
					System.out.print("이체할 계좌 번호 : ");
					String ano = scan.next();
					System.out.print("이체받을 계좌 번호 : ");
					String ano2 = scan.next();
					System.out.print("이체금액 : ");
					int bal = scan.nextInt();
					
					Message sendMsg = new Message();
					sendMsg.setCood(3003);
					Map<String, Object>params = new HashMap<>();
					params.put("ANO1", ano);
					params.put("ANO2", ano2);
					params.put("BALANCE", bal);
					sendMsg.setParams(params);
					out.writeObject(sendMsg);
					out.flush();
					out.reset();
					
					Message receiveMsg = (Message) in.readObject();
					if(receiveMsg.getCood()==3301)
						System.out.println("이체성공");
					else if(receiveMsg.getCood()==3302)
						System.out.println("계좌없음");
					else if(receiveMsg.getCood()==3303)
						System.out.println("이체액이 음수");
					else if(receiveMsg.getCood()==3304)
						System.out.println("잔액부족");
				}else if(num==6){
					System.out.println("--------------");
					System.out.println("삭제");
					System.out.println("--------------");
					System.out.print("계좌번호 : ");
					String ano = scan.next();
					
					Message sendMsg = new Message();
					sendMsg.setCood(4001);
					Map<String, Object>params = new HashMap<>();
					params.put("ANO", ano);
					sendMsg.setParams(params);;
					out.writeObject(sendMsg);
					out.flush();
					out.reset();
					
					Message receiveMsg = (Message)in.readObject();
					if(receiveMsg.getCood()==4101)
						System.out.println("성공");
					else if(receiveMsg.getCood()==4102)
						System.out.println("실패");
				} else if(num==7)
					run =false;
					
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(out !=null)
					out.close();
				if(in!=null)
					in.close();
				if(socket !=null)
					socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
