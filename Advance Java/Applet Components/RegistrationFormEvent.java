import java.awt.*;
import java.applet.*;
import java.awt.event.*;


//<applet code="RegistrationFormEvent.class" height=400 width=400></applet>
public class RegistrationFormEvent extends Applet implements ActionListener,MouseListener,ItemListener
{
		TextField tName,tMail;
		Label lName,lMail,lCity,lState,lAddr,lGender,lSubject;
		List city;
		Choice cState;
		Checkbox cbJP,cbJSP,cbAndroid;
		CheckboxGroup cbg;
		TextArea tAddr;
		Button bSubmit;
		String str;


	public void init()
	{
		

		lName=new Label("Name:");
		lMail=new Label("Mail:");
		lCity=new Label("City:");
		lState=new Label("State:");
		lAddr=new Label("Address");
		lGender=new Label("Gender:");
		lSubject=new Label("Subject");

		tName=new TextField(10);
		tMail=new TextField(10);
		
		tAddr=new TextArea(3,13);
		cState=new Choice();
		city=new List(3);
		
		
		cbJP=new Checkbox("Java Programming");
		cbJSP=new Checkbox("JSP");
		cbAndroid=new Checkbox("Android");

		bSubmit=new Button("SUBMIT");

		add(lName);
		add(tName);
		add(lMail);
		add(tMail);
		add(lAddr);
		add(tAddr);
		add(lCity);
		
		city.add("Mumbai");
		city.add("Pune");
		city.add("Surat");
		city.add("Banglore");
		city.add("Kolkatta");

		add(city);

		add(lState);
		
		cState.add("Maharashtra");
		cState.add("Goa");
		cState.add("Gujrat");
		cState.add("Karntaka");
		cState.add("Keral");

		add(cState);

		add(lSubject);
		add(cbJP);
		add(cbJSP);
		add(cbAndroid);

		add(bSubmit);

		bSubmit.addActionListener(this);
		cbJP.addMouseListener(this);
		cState.addItemListener(this);
		
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bSubmit);
		{
			 str="Submitted Successfully";
		}
	}
	public void mouseClicked(MouseEvent me)
	{
		repaint();
		str=" JP has been Selected";
	}
	public void mouseEntered(MouseEvent me){}
	
	public void mouseExited(MouseEvent me){}
	
	public void mousePressed(MouseEvent me){}

	public void mouseReleased(MouseEvent me){}
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
		str=" State is  Selected";
	}
	
	public void paint(Graphics g)
	{
		g.drawString(str,100,200);
	}
}
		
		