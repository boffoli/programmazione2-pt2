class Rock2 {
	Rock2(int i) {System.out.println("Creating Rock number " + i);}
	Rock2(){System.out.println("Creating Rock");}
}

public class SimpleConstructor2 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++)
			new Rock2(i);
	}
}