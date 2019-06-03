class Prova{
	boolean flag() 	{return true;}
	float logBaseNaturale() 	{return 2.718f;}
	void non_fa_nulla() 	{return;}
	void non_fa_nulla2() 	{}
	
	public static void main(String[] args) {
		boolean flag=false;
		Prova objProva=new Prova();
		System.out.println(flag);
		flag=objProva.flag();
		System.out.println(flag);
		}
}