import java.awt.*;
import java.awt.event.*;
class MouseDemo implements MouseListener,MouseMotionListener
{
	private Frame f;
	private TextField t1,t2,t3,t4,t5,t6;
	MouseDemo()
	{
		f=new Frame();
		f.setBounds(50,50,400,400);
		
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(2,3));
		
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		t4=new TextField(20);
		t5=new TextField(20);
		t6=new TextField(20);
		
		p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		p1.add(t4);
		p1.add(t5);
		p1.add(t6);

		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		f.add(p1,"South");
		f.setVisible(true);
	}
	public void mouseEntered(MouseEvent e)
	{
		t1.setText("MouseEntered");
	}
	public void mouseExited(MouseEvent e)
	{
		t1.setText("MouseExited");
	}
	public void mousePressed(MouseEvent e)
	{
	}
	public void mouseReleased(MouseEvent e)
	{
	}
	public void mouseClicked(MouseEvent e)
	{
		String msg=getLoc(e);
		t4.setText("Clicked at"+msg);
		int n=e.getClickCount();
		int b=e.getButton();
		t6.setText("No. of Clicks made"+n);
		if(b==MouseEvent.BUTTON1)
			t2.setText("Left Click");
		else
			t2.setText("Right Click");
	}
	public void mouseMoved(MouseEvent e)
	{
		String msg=getLoc(e);
		t3.setText("Moving at"+msg);
	}
	public void mouseDragged(MouseEvent e)
	{
		String msg=getLoc(e);
		t5.setText("Dragging at"+msg);
	}
	private String getLoc(MouseEvent e)
	{
		int x,y;
		x=e.getX();
		y=e.getY();
		return("X:"+x+"Y:"+y);
	}
	public static void main(String ar[])
	{
		MouseDemo m=new MouseDemo();
	}
}