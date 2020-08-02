import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Component1
{
	Component1()
	{
		JFrame jf=new JFrame("JLabel");
		jf.setSize(200,200);
		jf.setLocation(300,300);
		JScrollBar jsb=new JScrollBar(JScrollBar.HORIZONTAL,10,10,5,200);
		System.out.println(JScrollBar.VERTICAL);
		jsb.setValues(10,20,30,40);
		jsb.setBlockIncrement(20);
		System.out.println(jsb.getValue());
		jf.add(jsb,BorderLayout.NORTH);
		jf.setVisible(true);
	}
	public static void main(String ar[])
	{
		Component1 c1=new Component1();
	}
}		