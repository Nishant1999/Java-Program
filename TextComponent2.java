import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TextComponent2
{
	TextComponent2()
	{
		JFrame f=new JFrame();
		f.setSize(300,300);
		f.setLocation(200,200);
		
		JPanel p=new JPanel();
		JColorChooser jc=new JColorChooser(Color.YELLOW);
		jc.setColor(Color.YELLOW);
		jc.showDialog(p,"hello",Color.RED);

		f.add(p);
		
		f.setVisible(true);
	}
	public static void main(String ar[])
	{
		TextComponent2 c=new TextComponent2();
	}
}