import java.lang.reflect.*;

public class ShowMethods {
	static final String usage = "usage: \n" +"ShowMethods qualified.class.name to show all methods in class or: \n" +"ShowMethods qualified.class.name word to search for methods involving 'word'";
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println(usage);
			System.exit(1);
		}
		try {
			Class c = Class.forName(args[0]);	//nome
			Method[] m = c.getMethods();		//nome metodi
			Constructor[] ctor = c.getConstructors();	//costruttori
			
			if(args.length == 1) {
				for (int i = 0; i < m.length; i++)	
					System.out.println(m[i]);
				for (int i = 0; i < ctor.length; i++)
					System.out.println(ctor[i]);
			} else {
				for (int i = 0; i < m.length; i++)
					if(m[i].toString().indexOf(args[1])!=-1)
						System.out.println(m[i]);
				for (int i = 0; i < ctor.length; i++)
					if(ctor[i].toString().indexOf(args[1])!= -1)
						System.out.println(ctor[i]);
			}
		} 
		catch(ClassNotFoundException e) {
			System.err.println("No such class: " + e);
		}
		for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
	}
}
