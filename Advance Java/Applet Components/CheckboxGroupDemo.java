import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="CheckboxGroupDemo.class" height=400 width=400></applet>
public class CheckboxGroupDemo extends Applet implements ItemListener
{
	CheckboxGroup cbg;
	Checkbox cbMale,cbFemale;
	Label lGender;
	String str;

	public void init()
	{
		cbg=new CheckboxGroup();
		cbMale=new Checkbox("Male",cbg);
		cbFemale=new Checkbox("Female",cbg,true);
		lGender=new Label("Gender  :");

		add(lGender);
		add(cbMale);
		add(cbFemale);

		cbMale.addItemListener(this);
		cbFemale.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
		
	public void paint(Graphics g)
	{
		str="U Clicked on: "+cbg.getSelectedCheckbox().getLabel();
		g.drawString(str,100,50);
	}
}
	
	
