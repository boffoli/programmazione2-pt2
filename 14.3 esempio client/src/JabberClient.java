// client che manda e riceve linee dal server

import java.net.*;
import java.io.*;

public class JabberClient {
public static void main(String[] args) throws IOException {
		// indirizzo riservato al localhost 127.0.0.1
		InetAddress addr = InetAddress.getByName("127.0.0.1");
		System.out.println("addr = " + addr);
		Socket socket = new Socket(addr, JabberServer.PORT);
		// Pone tutto in un blocco try-finally per assicurarsi che
		// il socket sia chiuso:
		try {
			System.out.println("socket = " + socket);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// Flush automatico con PrintWriter:
			PrintWriter out =new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
			for(int i = 0; i < 10; i ++) {
				out.println("prova " + i);
				String str = in.readLine();
				System.out.println(str);
			}
			out.println("END");
		} finally {
			System.out.println("closing...");
			socket.close();
		}
	}
}

 
