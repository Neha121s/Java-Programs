import java.awt.*;
import java.applet.*;
//<applet code="LabelDemo.class" height=400 width=400></applet>
public class LabelDemo extends Applet
{
	public void init()
	{
		Label lname,lage;

		lname=new Label("Name");
		lage=new Label("Age");
		
		add(lname);
		add(lage);

	}
}
		