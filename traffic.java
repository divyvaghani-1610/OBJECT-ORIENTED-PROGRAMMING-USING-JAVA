import java.awt.*;
import java.awt.event.*;
class traffic extends Frame implements ItemListener
{
	Checkbox c1,c2,c3;
	traffic()
	{
		setSize(600,600);
		setVisible(true);
		setLayout(new FlowLayout());
		CheckboxGroup c = new CheckboxGroup();
		c1 = new Checkbox("RED",c,true);
		c2 = new Checkbox("YELLOW",c,true);
		c3 = new Checkbox("GREEN",c,true);
		add(c1);
		add(c2);
		add(c3);
		c1.ItemListener(this);
		c2.ItemListener(this);
		c3.ItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics h)
	{
		h.setBackground(Color.black);
		h.fillRect(300,300,20,100);
		h.fillRect(280,150,60,150);
	}
	public static void main(String args[])
	{
		traffic t1 = new traffic();
	}
}