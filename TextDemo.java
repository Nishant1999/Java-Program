import java.awt.*;
import java.awt.event.*;
class TextDemo implements TextListener
{
	private Frame f;
	private TextField t1,t2;
	TextDemo()
	{
		f=new Frame();
		f.setBounds(50,50,200,200);
		//f.setLayout(new BorderLayout());

		t1=new TextField(20);
		t2=new TextField(20);
		
		t1.addTextListener(this);
		f.add(t1,"North");
		f.add(t2,"South");
		f.setVisible(true);
	}
	public void textValueChanged(TextEvent e)
	{
		Object o=e.getSource();
		if(o==t1)
		{
			String s=t1.getText();
			if(s!=null&&s.length()!=0)
			{
				s=s.toUpperCase();
				t2.setText(s);
			}
			else
			{
				t2.setText("");
			}
		}
	}
	public static void main(String ar[])
	{
		TextDemo t=new TextDemo();
	}
}
		