public class Stringer {
	static String upcase(String s) {return s.toUpperCase(); }
public static void main(String[] args) {
	String q = new String("howdy");
	System.out.println(q); // howdy
	String qq = upcase(q);
	System.out.println(qq); // HOWDY
	System.out.println(q); // howdy
	String s = "asdf"; 		
	String x = Stringer.upcase(s);
	String s2 = "abc" + "def" + Integer.toString(47);
	}
}
