import java.awt.*;
import java.applet.*;
//<applet code="GridLayoutDemo.class" height=400 width=400></applet>

public class GridLayoutDemo extends Applet
{
	Label lFname,lPass;
	TextField tFname,tPass;
	Button bSubmit,bCancel;
	
	public void init()
	{
		setLayout(new GridLayout(3,2));
		
		lFname=new Label("Fisrt Name:");
		lPass=new Label("Password");
		tFname=new TextField(10);
		tPass=new TextField(10);
		bSubmit=new Button("SUBMIT");
		bCancel=new Button("CANCEL");

		add(lFname);
		add(tFname);
		add(lPass);
		add(tPass);
		add(bSubmit);
		add(bCancel);

	}
}