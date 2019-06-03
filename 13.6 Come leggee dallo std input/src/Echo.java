import java.io.*;

public class Echo {// come leggere dallo standard input
	public static void main(String[] args)
	throws IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = in.readLine()).length() != 0)		// Una linea vuota termina il programma
			System.out.println(s);
		
	}
}
