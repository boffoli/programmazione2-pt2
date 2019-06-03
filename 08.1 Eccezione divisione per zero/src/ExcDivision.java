import java.*;

class ExcDivision {
	public static void main(String args[]){
		int num1,num2;
		try { 
			num1=0;
			num2=17/num1;
			System.out.println("Non sarà mai visualizzato");
		}
		catch (ArithmeticException e){
			System.out.println("Divisione per zero");
		}
		System.out.println("Dopo il blocco catch");
	}
}