// Un comportamento “demoniaco”.

import java.io.*;

class Daemon extends Thread {
	private static final int SIZE = 10;
	private Thread[] t = new Thread[SIZE];
	
	public Daemon() {
		setDaemon(true);
		start();
	}
	
	public void run() {
		for(int i = 0; i < SIZE; i++)
			t[i] = new DaemonSpawn(i);
		for(int i = 0; i < SIZE; i++)
		System.out.println("t[" + i + "].isDaemon() = "+ t[i].isDaemon());
		while(true)
			yield();//<- per dare il controllo ad altri processi
	}
}

class DaemonSpawn extends Thread { //<-il thread è considerato demone 
	//							 perchè creato da un thread demone
	public DaemonSpawn(int i) {
		System.out.println("DaemonSpawn " + i + " started");
		start();
	}
	public void run() {
		while(true)
			yield();
		}
}


