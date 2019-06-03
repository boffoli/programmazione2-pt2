public class BitLog {
	//operatori bit a bit
	public static void main (String args[]){
		
		String binario[] ={"0000","0001","0010","0011","0100", "0101",
		"0110", "0111", "1000", "1001", "1010", "1011", "1100","1101","1110", "1110", "1111"};
		
		int varA=3; /* 0000 0011 */ 
		int varB=6; /* 0000 0110 */
		
		int varC= varA|varB; //or
		int varD= varA&varB; //and
		int varE= varA^varB; //xor
		int varF= (~varA & varB) | ( varA & ~varB);	//not
		
		System.out.println("varA=" + binario[varA]);
		System.out.println("varB=" + binario[varB]);
		System.out.println("A OR B=" + binario[varC]);
		System.out.println("A AND B=" + binario[varD]);
		System.out.println("A XOR B=" + binario[varE]);
		System.out.println("(NOT A AND B) OR (A AND NOT B)=" + binario[varF]);
	}
}