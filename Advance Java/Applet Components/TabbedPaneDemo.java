import javax.swing.*;
import java.awt.*;
import java.applet.*;

//<applet code="TabbedPaneDemo.class" height=400 width=400></applet>

public class TabbedPaneDemo extends JApplet

{
	public void init()
	{
		
		Container cp=getContentPane();
		
		JTabbedPane jtp=new JTabbedPane();
		
		JPanel jpOdd=new Odd18();
		JPanel jpEven=new Even18();

		jtp.addTab("Odd-18",jpOdd);
		jtp.addTab("Even-18",jpEven);

		cp.add(jtp);
	}
}
class Odd18 extends JPanel
{
	
	public Odd18()
	{
		JRadioButton jrdACN,jrdJP,jrdJS;
		
		jrdACN=new JRadioButton("ACN");
		jrdJP=new JRadioButton("JP");
		jrdJS=new JRadioButton("JS");

		add(jrdACN);
		add(jrdJP);
		add(jrdJS);
	}
}

 class Even18 extends JPanel
{
	
	public Even18()
	{
		JRadioButton jrdJP2,jrdJSP,jrdAnd;
		
		jrdJP2=new JRadioButton("JP2");
		jrdJSP=new JRadioButton("JSP");
		jrdAnd=new JRadioButton("ANDROID");


		add(jrdJP2);
		add(jrdJSP);
		add(jrdAnd);
	}
}
		