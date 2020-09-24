import javax.swing.tree.*;
import javax.swing.*;
import java.awt.*;

//<applet code="TreeDemo.class" height=400 width=400></applet>

public class TreeDemo extends JApplet
{
	JTree tree;
	
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new BorderLayout());
	
		//Create Root Node.
		DefaultMutableTreeNode root =new DefaultMutableTreeNode("Third Year");

	
		//create SubDirectory.	
		DefaultMutableTreeNode odd18 =new DefaultMutableTreeNode("Odd18");
		root.add(odd18);


		//create Child Nodes.
		DefaultMutableTreeNode jp =new DefaultMutableTreeNode("JP");
		odd18.add(jp);

		DefaultMutableTreeNode js =new DefaultMutableTreeNode("JS");
		odd18.add(js);

		DefaultMutableTreeNode acn =new DefaultMutableTreeNode("ACN");
		odd18.add(acn);

	
		//create second sub Directory.		
		DefaultMutableTreeNode even18 =new DefaultMutableTreeNode("Even18");
		root.add(even18);


		//Child Nodes for second Directory.
		DefaultMutableTreeNode and =new DefaultMutableTreeNode("ANDROID");
		even18.add(and);

		DefaultMutableTreeNode jp2 =new DefaultMutableTreeNode("JP2");
		even18.add(jp2);

		DefaultMutableTreeNode jsp =new DefaultMutableTreeNode("JSP");
		even18.add(jsp);


		tree=new JTree(root);

		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

		JScrollPane sp=new JScrollPane(tree,v,h);

		cp.add(sp,BorderLayout.CENTER);
	}
}

	
