// Server che controlla se il client si mette in attesa

import java.io.*;
import java.net.*;

public class JabberServer { //jabber = chiacchiera
	// Scegli una port al di fuori del range 1-1024:
	public static final int PORT = 8080;
	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(PORT);
		System.out.println("Started: " + s);
		try {
				// si blocca fino a quando non c�� una connessione
				Socket socket = s.accept();
				// connessione accettata
			try {
			System.out.println( "Connessione accettata: "+ socket);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// Flush automatico con PrintWriter:
			PrintWriter out =new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
			while (true) {
				String str = in.readLine();
				if (str.equals("END")) 
					break;
				System.out.println("Echoing: " + str);
				out.println(str);
			}
			// chiude sempre i due socket...
			} finally {
				System.out.println("closing...");
				socket.close();
			}
		} 
		finally {
			s.close();//ServerSocket
		}
	}
} 