import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="MouseEventDemo.class" height=400 width=400></applet>

public class MouseEventDemo extends Applet implements MouseListener,MouseMotionListener
{
	int x,y;
	String msg;

	public void init()
	{
		addMouseListener(this);
		
	}
	public void mouseClicked(MouseEvent me)
	{
		repaint();
		x=me.getX();
		y=me.getY();
		msg="Mouse Clicked: "+x+" "+y;
	}
	public void mouseReleased(MouseEvent me)
	{
		repaint();
		x=me.getX();
		y=me.getY();
		msg="Mouse Released: "+x+" "+y;
	}

	public void mousePressed(MouseEvent me)
	{
		repaint();
		x=me.getX();
		y=me.getY();
		msg="Mouse Pressed: "+x+" "+y;
	}

	public void mouseEntered(MouseEvent me)
	{
		repaint();
		x=me.getX();
		y=me.getY();
		msg="Mouse Entered: "+x+" "+y;
	}

	public void mouseExited(MouseEvent me)
	{
		repaint();
		x=me.getX();
		y=me.getY();
		msg="Mouse Exited: "+x+" "+y;
	}
	
	public void mouseDragged(MouseEvent me)
	{
		repaint();
		x=me.getX();
		y=me.getY();
		msg="Mouse Dragged: "+x+" "+y;
	}

	public void mouseMoved(MouseEvent me)
	{
		repaint();
		x=me.getX();
		y=me.getY();
		msg="Mouse Moved: "+x+" "+y;
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
	}
}