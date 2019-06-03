class Mutable{
	private int data;
	
	public	Mutable(int initVal) {	data = initVal;}
	public	Mutable add(int x) {		
		data += x;
		return this;	///<-------<-------<------- questa, non la nuova
	}
	public	Mutable multiply(int x) {
		data *= x;
		return this;
	}
	public	Immutable makeImmutable() {
		return new Immutable(data);
	}	
}