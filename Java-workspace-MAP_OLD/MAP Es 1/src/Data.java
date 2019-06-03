// Le visibilità di classi , attributi e metodi devono essere decise dagli studenti	

class Data {
	Object data [][];
	int numberOfExamples;
	Attribute attributeSet[];
	
	Data(){
		data = new Object [14][5];
		// TO DO : memorizzare le transazioni secondo lo schema della tabella nelle specifiche		
		numberOfExamples=14;		 
		attributeSet = new Attribute[5];

		// TO DO : avvalorare ciascune elemento di attributeSet con un oggetto della classe DiscreteAttribute che modella il corrispondente attributo (e.g. outlook, temperature,etc)
		// nel seguito si fornisce l'esempio per outlook
		
		String outLookValues[]=new String[3];
		outLookValues[0]="overcast";
		outLookValues[1]="rain";
		outLookValues[2]="sunny";
		attributeSet[0] = new DiscreteAttribute("Outlook",0, outLookValues);
		
		// similmente per gli altri attributi
			
	}
	
	int getNumberOfExamples(){}	
	int getNumberOfAttributes(){}	
	Object getAttributeValue(int exampleIndex, int attributeIndex){}
	
	Attribute getAttribute(int index){}
	public String toString(){}

	public static void main(String args[]){
		Data trainingSet=new Data();
		System.out.println(trainingSet);	
	}

}
