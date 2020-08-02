import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JavaSwings1
{
	JavaSwings1()
	{
		JFrame j=new JFrame();
		JMenuBar mb=new JMenuBar();
		JMenu file,sub;
		file=new JMenu("File");
		sub=new JMenu("Sub Menu");

		JMenuItem a,b,c,d;
		a=new JMenuItem("A");
		b=new JMenuItem("B");
		c=new JMenuItem("C");
		d=new JMenuItem("D");

		file.add(a);
		file.add(b);
		file.add(sub);

		sub.add(c);
		sub.add(d);
		
		mb.add(file);

		j.setJMenuBar(mb);
		
		j.setVisible(true);
	}
	public static void main(String ar[])
	{
		JavaSwings1 js=new JavaSwings1();
	}
}
		