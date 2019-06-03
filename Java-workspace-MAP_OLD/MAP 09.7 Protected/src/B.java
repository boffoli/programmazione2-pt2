import java.util.*;

class A {
	private int i;
	
	public A(int ii) { i = ii; }	//costruttore
	
	protected int read() { return i; }	//getter
	protected void set(int ii) { i = ii; }	//setter	
	
	public int value(int m) { return m*i; }
}

public class B extends A {//ereditarieta
	private int j;
	
	public B(int jj) { 		super(jj); 		j = jj;}	//costruttore	
	public void change(int x) {		set(x);}	//setter
}