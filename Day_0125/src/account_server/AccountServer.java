package account_server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import protocol.Account;
import protocol.Message;

public class AccountServer implements Runnable {
	private AccountService service;
	private Socket socket;
	private ObjectOutputStream out = null;
	private ObjectInputStream in = null;

	public AccountServer(Socket socket) {
		// TODO Auto-generated constructor stub
		service = new AccountService();
		this.socket = socket;
		try {
			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 클라이언트의 메시지를 읽어서 코드에 따라 적당한 작업을 하고 결과를 통보
		try {
			while (true) {
				Message message = (Message) in.readObject();
				
				if (message.getCood() == 1001) {
					String ano =(String) message.getParams().get("ANO");
					String name = (String) message.getParams().get("NAME");
					int bal = (int) message.getParams().get("BALANCE");
					boolean result = service.createAccount(ano, name, bal);
					Message sendMsg = new Message();
					if(result) {
						sendMsg.setCood(1101);
					} else {
						sendMsg.setCood(1102);
					}
					out.writeObject(sendMsg);
					out.flush();
					out.reset();
				} else if(message.getCood()==2001) {
					List<Account> list = service.accountList();
					Message sendMsg = new Message();
					sendMsg.setCood(2101);
					Map<String, Object> params = new HashMap<>();
					params.put("LIST", list);
					sendMsg.setParams(params);
					out.writeObject(sendMsg);
					out.flush();
					out.reset();
					
				} else if(message.getCood()==3001) {
					String ano =(String) message.getParams().get("ANO");
					int bal = (int) message.getParams().get("BALANCE");
					int result = service.deposit(ano, bal);
					Message sendMsg = new Message();
					if(result==1) {
						sendMsg.setCood(3101);
					} else if (result==2) {
						sendMsg.setCood(3102);
					} else if(result==3) {
						sendMsg.setCood(3103);
					}
					out.writeObject(sendMsg);
					out.flush();
					out.reset();
				} else if(message.getCood()==3002) {
					String ano = (String)message.getParams().get("ANO");
					int bal = (int)message.getParams().get("BALANCE");
					int result = service.withdraw(ano, bal);
					Message sendMsg = new Message();
					if(result==1)
						sendMsg.setCood(3201);
					else if(result == 2)
						sendMsg.setCood(3202);
					else if(result ==3)
						sendMsg.setCood(3203);
					out.writeObject(sendMsg);
					out.flush();
					out.reset();
				} else if(message.getCood()==3003) {
					String ano1 = (String) message.getParams().get("ANO1");
					String ano2 = (String) message.getParams().get("ANO2");
					int bal = (int)message.getParams().get("BALANCE");
					int result = service.transit(ano1, ano2, bal);
					Message sendMsg = new Message();
					if(result==1)
						sendMsg.setCood(3301);
					else if(result==2)
						sendMsg.setCood(3302);
					else if(result==3)
						sendMsg.setCood(3303);
					else if(result==4)
						sendMsg.setCood(3304);
					out.writeObject(sendMsg);
					out.flush();
					out.reset();
				} else if(message.getCood()==4001) {
					String ano = (String)message.getParams().get("ANO");
					int result = service.delete(ano);
					Message sendMsg = new Message();
					if(result==1)
						sendMsg.setCood(4101);
					else
						sendMsg.setCood(4102);
					out.writeObject(sendMsg);
					out.flush();
					out.reset();
						
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
