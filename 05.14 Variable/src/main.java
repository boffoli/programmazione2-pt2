import java.util.*;

public class main {	
	
	static int pRand(int mod) {
		Random rand = new Random();
		return Math.abs(rand.nextInt()) % mod + 1;
	}
	public static void main(String[] args) {
		int[][][] a3 = new int[pRand(7)][][];
		for(int i = 0; i < a3.length; i++) {
			a3[i] = new int[pRand(5)][];
			for(int j = 0; j < a3[i].length; j++)
				a3[i][j] = new int[pRand(5)];
		}
	}
}
