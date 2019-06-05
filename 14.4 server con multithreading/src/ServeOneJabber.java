import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

class ServeOneJabber extends Thread {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	public ServeOneJabber(Socket s) throws IOException {
	socket = s;
	in = new BufferedReader( new InputStreamReader(
	socket.getInputStream()));
	
	out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
	// se una qualsiasi delle chiamate precedenti solleva una
	// eccezione, il processo chiamante � responsabile della 
	// chiusura del socket. Altrimenti lo chiuder� il thread 
	start(); // Chiama run()
	}
	public void run() {
		try {
		while (true) {
			String str = in.readLine();
			if (str.equals("END")) break;
			System.out.println("Echoing: " + str);
			out.println(str);
		}
			System.out.println("closing...");
		} catch(IOException e) {
			System.err.println("IO Exception");
		} finally {
			try {
				socket.close();
			} catch(IOException e) {
				System.err.println("Socket not closed");
			}
		}
	}
}
