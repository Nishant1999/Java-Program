import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TextComponent4
{
	TextComponent4()
	{
		JFrame f=new JFrame();
		f.setSize(300,300);
		f.setLocation(400,400);

		JPanel p=new JPanel();

		JToolBar tb=new JToolBar();
		tb.add(new Button("Hello"));
		tb.addSeparator(new Dimension(200,200));
		tb.add(new Button("Deepanshu"));
		tb.setFloatable(true);
		tb.setMargin(new Insets(100,100,100,100));
		tb.setOrientation(JToolBar.VERTICAL);
		

		p.add(tb);
		f.add(p);
		f.setVisible(true);
	}
	public static void main(String ar[])
	{
		TextComponent4 c=new TextComponent4();
	}
}