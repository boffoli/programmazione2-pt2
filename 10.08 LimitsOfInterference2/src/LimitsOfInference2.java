import java.util.*;
//Soluzione: specificare il tipo al momento della invocazione del metodo

public class LimitsOfInference2 {
	static void f(List<String> list) {}
	public static void main(String[] args) {
		f(New.<String>list());
	}
}
