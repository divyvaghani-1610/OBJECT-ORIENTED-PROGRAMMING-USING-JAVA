import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;
public class trafficsi extends Frame implements ItemListener
{
	Checkbox d1,d2,d3;
	boolean D1,D2,D3;
	trafficsi()
	{
		setSize(600,600);
		setVisible(true);
		setLayout(new FlowLayout());
		CheckboxGroup c = new CheckboxGroup();
		d1 = new Checkbox("RED",c,false);
		d2 = new Checkbox("YELLOW",c,false);
		d3 = new Checkbox("GREEN",c,false);
		add(d1);
		add(d2);
		add(d3);
		d1.addItemListener(this);
		d2.addItemListener(this);
		d3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(300,300,20,100);
		g.fillRect(280,150,60,150);
		while(D1)
		{
			g.setColor(Color.red);
		g.fillRect(300,300,20,100);
		g.fillRect(280,150,60,150);
		}
		while(D2)
		{
			g.setColor(Color.yellow);
		g.fillRect(300,300,20,100);g.fillRect(280,150,60,150);
		}
		while(D3)
		{
			g.setColor(Color.green);
		g.fillRect(300,300,20,100);g.fillRect(280,150,60,150);
		}
		
		}
	public static void main(String args[])
	{
		trafficsi t1 = new trafficsi();
	}
}