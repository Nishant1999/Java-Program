import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Cont
{
	Cont()
	{
		JFrame f=new JFrame();
		//Container c=f.getContentPane();
		JPanel p=new JPanel();
		//p.setSize(200,200);
		p.setBackground(Color.RED);
		f.setContentPane(p);
		f.setVisible(true);
	}
	public static void main(String ar[])
	{
		Cont c=new Cont();
	}
}
		
		