//Crea pi� thread

class MyThread implements Runnable {
	String name;  //nome del thread
	Thread th;
		MyThread(String thread_name){
		  name=thread_name;
		  th=new Thread(this,name);
		  System.out.println("New thread: "+th);
		  th.start(); //fa partire il thread
		}
	// entry point
	public void run() {
		  try{
				for (int i=3; i>0; i--) {
				System.out.println(name +": "+i);
				Thread.sleep(1500);
	 			}
	 	} catch (InterruptedException e) {
	 			System.out.println(name + "Interruzione");}
		System.out.println(name + "uscita");
	
		} 
}

