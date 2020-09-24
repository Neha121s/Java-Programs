import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="CheckBoxDemo.class" height=400 width=400></applet>
public class CheckBoxDemo extends Applet implements ItemListener
{
	Checkbox cbJP,cbJSP,cbAnd,cbCS,cbST;
	String str;

	public void init()
	{
		cbJP=new Checkbox("Java Programming");
		cbJSP=new Checkbox("Java Script");
		cbCS=new Checkbox("Computer Security");
		cbST=new Checkbox("Software Testing");
		cbAnd=new Checkbox("Android");

		add(cbJP);
		add(cbJSP);
		add(cbCS);
		add(cbST);
		add(cbAnd);

		cbJP.addItemListener(this);
		cbJSP.addItemListener(this);
		cbCS.addItemListener(this);
		cbST.addItemListener(this);
		cbAnd.addItemListener(this);

	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}

	public void paint(Graphics g)
	{
		str="Current Status:  ";
		g.drawString(str,70,80);
		
		str="Java Programming: "+cbJP.getState();
		g.drawString(str,70,100);

		str="Java Script: "+cbJSP.getState();
		g.drawString(str,70,120);

		str="Computer Security: "+cbCS.getState();
		g.drawString(str,70,140);

		str="Software Testing: "+cbST.getState();
		g.drawString(str,70,160);

		str="Android: "+cbAnd.getState();
		g.drawString(str,70,180);
		
	}
}
	

	