import javax.swing.*;
import java.awt.*;

//<applet code="ImageIconDemo.class" height=400 width=500></applet>

public class ImageIconDemo extends JApplet
{
	public void init()
	{
		Container cp=getContentPane();
		ImageIcon i1=new ImageIcon("img.jpg");
		JLabel j1=new JLabel("Image",i1,JLabel.CENTER);

		cp.add(j1);
	}
}