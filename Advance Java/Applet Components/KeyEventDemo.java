import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="KeyEventDemo.class" height=400 width=400></applet>

public class KeyEventDemo extends Applet implements KeyListener
{
	
	String msg;

	public void init()
	{
		addKeyListener(this);
		requestFocus();
		
	}
	public void keyPressed(KeyEvent ke)
	{
		repaint();
		showStatus("Key Pressed");
		
	}
	public void keyReleased(KeyEvent ke)
	{
		repaint();
		showStatus("Key Released");
		
	}

	public void keyTyped(KeyEvent ke)
	{
		repaint();
		msg="Key Typed :"+ke.getKeyChar();
		
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
	}
}
