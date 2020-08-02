import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TextComponent5
{
	TextComponent5()
	{
		JFrame f=new JFrame();
		f.setSize(300,300);
		f.setLocation(400,400);
		
		JPanel p=new JPanel();

		JComboBox jc=new JComboBox();
		jc.addItem(new MenuItem("India"));
		jc.addItem(new MenuItem("Australia"));
		jc.insertItemAt(new MenuItem("Pakistan"),0);
		jc.setSelectedItem(new MenuItem("America"));
		//System.out.println(jc.getSelectedItem());
		System.out.println(jc.getItemCount());
		jc.removeAllItems();
		
		/*Integer i[]={new Integer(5),new Integer(7)};
		JComboBox jc=new JComboBox(i);
		Object o=jc.getSelectedItem();
		System.out.println(o);*/
		
		
		p.add(jc);
		
		f.add(p);
		f.setVisible(true);
	}
	public static void main(String ar[])
	{
		TextComponent5 c=new TextComponent5();
	}
}