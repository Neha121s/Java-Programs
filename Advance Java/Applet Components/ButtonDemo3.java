import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="ButtonDemo3.class" height=400 width=400></applet>

public class ButtonDemo3 extends Applet implements ActionListener
{
	Button b[]=new Button[10];
	String str,msg;
	
	public void init()
	{
		for(int i=0;i<=9;i++)
		{
			b[i]=new Button(" "+i);
			add(b[i]);
			b[i].addActionListener(this);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		str=ae.getActionCommand();
		msg="You Clicked On :- "+str;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,100,70);
	}
}