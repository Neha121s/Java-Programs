import javax.swing.*;
import java.awt.*;
import java.applet.*;
	
//<applet code="ComboBoxDemo.class" height=400 width=400></applet>

public class ComboBoxDemo extends JApplet
{
	public void init()
	{
		
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());


	
		JLabel lYear=new JLabel("Year");
		JComboBox jYear=new JComboBox();
		jYear.addItem("Even");
		jYear.addItem("Odd");

		cp.add(lYear);
		cp.add(jYear);
		
	}
}