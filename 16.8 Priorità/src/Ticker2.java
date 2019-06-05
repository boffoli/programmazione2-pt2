// uso delle priorità in un thread
// <applet code=Counter5 width=450 height=600>
// </applet>
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.prova.swing.*;

class Ticker2 extends Thread {
	private JButton
	b = new JButton("Toggle"),
	incPriority = new JButton("up"),
	decPriority = new JButton("down");
	private JTextField
	t = new JTextField(10),
	pr = new JTextField(3); // Display priority
	private int count = 0;
	private boolean runFlag = true;
	public Ticker2(Container c) {
	b.addActionListener(new ToggleL());
	incPriority.addActionListener(new UpL());
	decPriority.addActionListener(new DownL());
	JPanel p = new JPanel();
	p.add(t);
	p.add(pr);
	p.add(b);
	p.add(incPriority);
	p.add(decPriority);
	c.add(p);
	}
	class ToggleL implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	runFlag = !runFlag;
	}
	}
	class UpL implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	int newPriority = getPriority() + 1;
	if(newPriority > Thread.MAX_PRIORITY)
	newPriority = Thread.MAX_PRIORITY;
	setPriority(newPriority);
	}
	}
	class DownL implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	int newPriority = getPriority() - 1;
	if(newPriority < Thread.MIN_PRIORITY)
	newPriority = Thread.MIN_PRIORITY;
	setPriority(newPriority);
	}
	}
	public void run() {
	while (true) {
	if(runFlag) {
	t.setText(Integer.toString(count++));
	pr.setText(
	Integer.toString(getPriority()));
	}
	yield();
	}
	}
}
