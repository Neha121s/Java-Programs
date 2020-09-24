import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="CardLayoutDemo.class" height=400 width=400></applet>

public class CardLayoutDemo extends Applet implements ActionListener
{
	Panel osCards;
	CardLayout cardlo;
	Button bWin,bOther;
	Checkbox cbWinNT,cbWinXP,cbMac,cbLinux;
	

	public void init()
	{
		cardlo=new CardLayout();

		//create a Main Panel.
		
		osCards=new Panel();
		osCards.setLayout(cardlo);

		//Create buttons for Main Panel.

		bWin=new Button("Windows");
		bOther=new Button("Others");
		

		//Add buttons to Main Panel.

		add(bWin);
		add(bOther);

		//Create a Panel for Windows
		Panel panWin=new Panel();

		//Create buttons for Windows Panel.

		 cbWinNT=new Checkbox("Windows NT");
		cbWinXP=new Checkbox("Windows XP");

		//Add button to Windows Panel.

		panWin.add(cbWinNT);
		panWin.add(cbWinXP);


		//Create a Panel for Others
		Panel panOther=new Panel();

		//Create buttons for Other Panel.

		cbMac=new Checkbox("Mac");
		cbLinux=new Checkbox("Linux");

		//Add button to Others Panel.

		panOther.add(cbMac);
		panOther.add(cbLinux);

		//add Cards to Carddeck.
		osCards.add(panWin,"Windows");
		osCards.add(panOther,"Others");

		add(osCards);
	
		bWin.addActionListener(this);
		bOther.addActionListener(this);

		
	}
		public void actionPerformed(ActionEvent ae)
		{
			String str=ae.getActionCommand();
			if(str.equals("Windows"))
			{
				cardlo.show(osCards,"Windows");
			}
			else
			{
				cardlo.show(osCards,"Others");
			}
		}
	
}
