import javax.swing.*;
import java.awt.*;
class InternalFrame1
{
	JFrame frame;
	JDesktopPane desktoppane;
	JInternalFrame internalframe;
	InternalFrame1()
	{
		frame=new JFrame("Multiple Document");
		frame.setBackground(Color.WHITE);
		desktoppane=new JDesktopPane();
		desktoppane.setBackground(Color.white);
		frame.add(desktoppane);
		frame.setSize(450,400);
		
		internalframe=new JInternalFrame("InternalFrame",true,true,true,true);
		internalframe.setBackground(Color.WHITE);
		internalframe.setLocation(250,250);
		internalframe.setSize(200,200);
		internalframe.setVisible(true);
		
		desktoppane.add(internalframe);
		internalframe.moveToFront();
		frame.setVisible(true);
	}
	public static void main(String ar[])
	{
		InternalFrame1 inf=new InternalFrame1();
	}
}