package account_server;

import java.net.ServerSocket;
import java.net.Socket;

public class BankServerApplication {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(5000);
			Socket socket = serverSocket.accept();
			AccountServer accountServer = new AccountServer(socket);		//
			Thread t = new Thread(accountServer);
			t.start();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
