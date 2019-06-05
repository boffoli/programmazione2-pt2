// Un server che usa il multithreading 

import java.io.*;
import java.net.*;

public class MultiJabberServer {
	static final int PORT = 8080;
	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(PORT);
		System.out.println("Server Started");
		try {
			while(true) {
				// Si blocca finch� non si verifica una connessione:
				Socket socket = s.accept();
					try {
						new ServeOneJabber(socket);
					} catch(IOException e) {
						// Se fallisce chiude il socket,
						// altrimenti il thread la chiuder�:
						socket.close();
					}
			}
		} finally {
			s.close();
		}
	}
}