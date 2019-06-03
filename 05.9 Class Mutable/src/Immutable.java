public class Immutable {
	private int data;
	
	public	Immutable(int initVal) {data = initVal;}		
	public int read(){ return data; }
	public boolean nonzero(){ return data != 0; }
	
	public	Immutable add(int x){		return new Immutable(data + x);	}	//nuovo oggetto
	public Immutable multiply(int x) {		return new Immutable(data * x);	}
	
	public	Mutable makeMutable() {		return new Mutable(data);}	//nuovo oggetto mutabile
	
	public static Immutable modify1(Immutable y){
		Immutable val = y.add(12);
		val = val.multiply(3);
		val = val.add(11);
		val = val.multiply(2);
		return val;
	}
	
	public static Immutable modify2(Immutable y){			// Questa procedura restituisce gli stessi risultati
		Mutable m = y.makeMutable();
		m.add(12).multiply(3).add(11).multiply(2);
		return m.makeImmutable();
	}
	
	
	public static void main(String[] args) {
		Immutable i2 = new Immutable(47);
		Immutable r1 = modify1(i2);
		Immutable r2 = modify2(i2);
		System.out.println("i2 (new) = "+ i2.read());
		System.out.println("r1 (modify1) = "+ r1.read());
		System.out.println("r2 (modify2) = "+ r2.read());
	}
} 
