import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TextComponent3
{
	TextComponent3()
	{
		JFrame f=new JFrame();
		f.setSize(200,200);
		f.setLocation(400,400);

		JPanel p=new JPanel();
		
		JPopupMenu jp=new JPopupMenu("Right Menu");
		JMenuItem ji1=new JMenuItem("Refresh");
		JMenuItem ji2=new JMenuItem("Cut");
		JMenuItem ji3=new JMenuItem("Copy");
		JMenuItem ji4=new JMenuItem("Paste");
		jp.add(ji1);
		jp.add(ji2);
		jp.add(ji3);
		jp.add(ji4);
		p.addMouseListener(new MouseListener()
					{
						public void mouseEntered(MouseEvent e)
						{
						}
						public void mouseExited(MouseEvent e)
						{
						}
						public void mouseClicked(MouseEvent e)
						{
						}
						public void mousePressed(MouseEvent e)
						{
							int x=e.getX();
							int y=e.getY();
							jp.show(p,x,y);
							jp.pack();
						}
						public void mouseReleased(MouseEvent e)
						{
							
						}
	
					});
		p.add(jp);
		
		f.add(p);

		f.setVisible(true);
	}
	public static void main(String ar[])
	{
		TextComponent3 c=new TextComponent3();
	}
}