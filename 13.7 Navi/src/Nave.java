import java.io.*;
import java.util.*;

public class Nave implements Serializable{
	private static int nroNavi=1;
	private int nroNave;
	private String nomeNave;
	
	Nave(String nomeNave){
		nroNave=nroNavi++;
		this.nomeNave=nomeNave;
	}
	
	public String toString(int i){
		return nomeNave+ ":" + i;
	}
	
	public void salva() throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("info.dat"));
		out.writeObject(this);
		out.writeObject(nroNavi);
		out.close();
	}
	
	public static Nave carica() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("info.dat"));
		Nave n=(Nave)in.readObject();
		//Nave.nroNavi=in.readObject();
		in.close();
		return n;
	}
}
