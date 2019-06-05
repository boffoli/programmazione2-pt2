import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
	public static void main(String[] args) {
	ArrayList<B> ls=new ArrayList<B>();
	GenericsAndCovariance.carica(ls);
	GenericsAndCovariance.stampa(ls);
	}
	public static void stampa(List<? extends B> lb) {
	lb.get(0).stampa();
	lb.get(1).stampa();
	lb.get(2).stampa();
	}
	public static void carica(List<? super B> lb) {
	lb.add(new B());
	lb.add(new C());
	lb.add(new D());
	// lb.add(new A()); //ERRORE
	}
}