import javax.swing.*;
import java.awt.*;
import java.applet.*;

//<applet code="TableDemo.class" height=400 width=400></applet>

public class TableDemo extends JApplet
{
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new BorderLayout());
		
		final String[] head={"Roll No", "Name", "City"};
		final Object[][] data={
				{"1","Neha","Pune"},
				{"2","Anuja","Mumbai"},
				{"3","Saloni","Banglore"}
			               };

		JTable jtb=new JTable(data,head);
		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

		JScrollPane jsp=new JScrollPane(jtb,v,h);
		cp.add(jsp,BorderLayout.CENTER);

	}
}