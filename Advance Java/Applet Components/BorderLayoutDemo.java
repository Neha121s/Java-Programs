import java.awt.*;
import java.applet.*;
//<applet code="BorderLayoutDemo.java" height=400 width=400></applet>

public class BorderLayoutDemo extends Applet
{
	Button bEast,bWest,bSouth,bNorth;
	TextArea tCenter;

	public void init()
	{
		setLayout(new BorderLayout());
		 bEast=new Button("East");
		 bWest=new Button("West");
		 bSouth=new Button("South");
		 bNorth=new Button("North");	
		tCenter=new TextArea("welcome to GPP");

		add(bEast,BorderLayout.EAST);
		add(bWest,BorderLayout.WEST);
		add(bSouth,BorderLayout.SOUTH);
		add(bNorth,BorderLayout.NORTH);
		add(tCenter,BorderLayout.CENTER);
	}
}