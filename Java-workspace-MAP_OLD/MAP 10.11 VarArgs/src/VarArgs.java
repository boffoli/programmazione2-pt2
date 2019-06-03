//LISTE IN JAVA IMPLEMENTAZOINE(numero variabile di  elementi)

class A { int i;}

public class VarArgs {
	static void f(Object[] x) {	//e' tipo void
		for(int i = 0; i < x.length; i++)
			System.out.println(x[i]);
	}
	
	public static void main(String[] args) {
		f(new Object[] {47, new VarArgs(),3.14,11.11 });	//liste di inizializzazione
		f(new Object[] {"one", "two", "three" });
		f(new Object[] {new A(), new A(), new A()});
	}
}
