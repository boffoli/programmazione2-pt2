import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Counter5.DownMaxL;
import Counter5.StartL;
import Counter5.UpMaxL;

public class Counter5 extends JApplet {
	private JButton
	start = new JButton("Start"),
	upMax = new JButton("Inc Max Priority"),
	downMax = new JButton("Dec Max Priority");
	private boolean started = false;
	private static final int SIZE = 10;
	private Ticker2[] s = new Ticker2[SIZE];
	private JTextField mp = new JTextField(3);
	public void init() {
	Container cp = getContentPane();
	cp.setLayout(new FlowLayout());
	for(int i = 0; i < s.length; i++)
	s[i] = new Ticker2(cp);
	cp.add(new JLabel(
	"MAX_PRIORITY = " + Thread.MAX_PRIORITY));
	cp.add(new JLabel("MIN_PRIORITY = "
	+ Thread.MIN_PRIORITY));
	cp.add(new JLabel("Group Max Priority = "));
	cp.add(mp);
	cp.add(start);
	cp.add(upMax);
	cp.add(downMax);
	start.addActionListener(new StartL());
	upMax.addActionListener(new UpMaxL());
	downMax.addActionListener(new DownMaxL());
	showMaxPriority();
	// Recursively display parent thread groups:
	ThreadGroup parent =
	s[0].getThreadGroup().getParent();
	while(parent != null) {
	cp.add(new Label(
	"Parent threadgroup max priority = "
	+ parent.getMaxPriority()));
	parent = parent.getParent();
	}
	}
	public void showMaxPriority() {
	mp.setText(Integer.toString(
	s[0].getThreadGroup().getMaxPriority()));
	}
	class StartL implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	if(!started) {
	started = true;
	for(int i = 0; i < s.length; i++)
	s[i].start();
	}
	}
	}
	class UpMaxL implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	int maxp =
	s[0].getThreadGroup().getMaxPriority();
	if(++maxp > Thread.MAX_PRIORITY)
	maxp = Thread.MAX_PRIORITY;
	s[0].getThreadGroup().setMaxPriority(maxp);
	showMaxPriority();
	}
	}
	class DownMaxL implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	int maxp =
	s[0].getThreadGroup().getMaxPriority();
	if(--maxp < Thread.MIN_PRIORITY)
	maxp = Thread.MIN_PRIORITY;
	s[0].getThreadGroup().setMaxPriority(maxp);
	showMaxPriority();
	}
	}
	public static void main(String[] args) {
	Console.run(new Counter5(), 450, 600);
	}
}

