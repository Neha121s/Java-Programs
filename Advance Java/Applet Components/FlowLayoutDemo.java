import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="FlowLayoutDemo.class" height=400 width=400></applet>

public class FlowLayoutDemo extends Applet implements ActionListener
{
	Button bsubmit,breg,blogin,bok,bcancel;
	String str,msg;

	public void init()
	{
		
		setLayout(new FlowLayout(FlowLayout.RIGHT));

		bsubmit=new Button("Submit");
		breg=new Button("Register");
		blogin=new Button("Log In");
		bok=new Button("Ok");
		bcancel=new Button("Cancel");

		add(bsubmit);
		add(breg);
		add(blogin);
		add(bok);
		add(bok);
		add(bcancel);

		bsubmit.addActionListener(this);
		breg.addActionListener(this);
		blogin.addActionListener(this);
		bok.addActionListener(this);
		bcancel.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		 str=ae.getActionCommand();
		msg="You Clicked on :- "+str;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,100,50);
	}
}