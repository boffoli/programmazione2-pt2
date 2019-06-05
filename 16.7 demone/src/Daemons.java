import java.io.IOException;

public class Daemons {
	public static void main(String[] args) throws IOException {
		Thread d = new Daemon();
		System.out.println("d.isDaemon() = " + d.isDaemon());
		// permette ai thread demoni di finire 
		// i loro processi di startup:
		System.out.println("Press any key");
		System.in.read();
	}
}