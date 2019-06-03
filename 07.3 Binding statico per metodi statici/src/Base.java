public class Base {
    public static String whoAmI() { return "classe base"; }
    
    public static void main(String[] argv) {
        Base prova = new Derived();
        System.out.println(prova.whoAmI());
     }
}

class Derived extends Base {
    public static String whoAmI() {	 return "classe derivata";}
    
}

