// tenendo il thread in una classe distinta si possono avere quanti 
//thread si vogliono
// <applet code=Counter4 width=200 height=600>
// <param name=size value="12"></applet>

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter4 extends JApplet {
	private JButton start = new JButton("Start");
	private boolean started = false;
	private Ticker[] s;
	private int size = 12;
	
	class Ticker extends Thread {
		private JButton b = new JButton("Toggle");
		private JTextField t = new JTextField(10);
		private int count = 0;
		private boolean runFlag = true;
		
		public Ticker() {
			b.addActionListener(new ToggleL());
			JPanel p = new JPanel();
			p.add(t);
			p.add(b);
			// Chiama JApplet.getContentPane().add():
			getContentPane().add(p);
		}
		class ToggleL implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				runFlag = !runFlag;
				}
		}
		public void run() {
			while (true) {
				if (runFlag)
					t.setText(Integer.toString(count++));
				try {
				sleep(100);
				} catch(InterruptedException e) {
					System.err.println("Interrupted");
				}
			}
		}
	}
	
	class StartL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(!started) {
				started = true;
				for (int i = 0; i < s.length; i++)
				s[i].start();	
			}
		}
	}
	
	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		// Si fa dare il parametro ‘size’ dalla pagina Web:
		          String sz = getParameter("size");
		s = new Ticker[size];
		for (int i = 0; i < s.length; i++)
		s[i] = new Ticker();
		start.addActionListener(new StartL());
		cp.add(start);
	}
}

