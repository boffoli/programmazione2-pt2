// Uso dell’interfaccia Runnable per trasformare
// la classe principale in un thread.
// <applet code=Counter3 width=300 height=100>
// </applet>

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Counter3 extends JApplet implements Runnable {
	private int count = 0;
	private boolean runFlag = true;
	private Thread selfThread = null;
	private JButton
	start = new JButton("Start"),
	onOff = new JButton("Toggle");
	private JTextField t = new JTextField(10);
	
	public void run() { 
		while (true) {
			try {
			selfThread.sleep(100);
			} catch(InterruptedException e) {
				System.err.println("Interrupted");
			}
			if(runFlag)
				t.setText(Integer.toString(count++));
		}
	}
	// Avvia il thread
	class StartL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(selfThread == null) {
				selfThread = new Thread(Counter3.this);
				selfThread.start();
			}
		}
	}
	// cambia il valore di runflag
	// notare che il thread avviato con start è sempre 
	// in esecuzione
	class OnOffL implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		runFlag = !runFlag;
	}
	}
	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(t);
		start.addActionListener(new StartL());
		cp.add(start);
		onOff.addActionListener(new OnOffL());
		cp.add(onOff);
	}
}
