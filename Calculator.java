import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
	private Frame f;
	private TextField tf1;
	private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	private String b1s="",b2s="",b4s="",b3s="",b5s="",b6s="",b7s="",b8s="",b9s="",b10s="",b11s="",b12s="",b13s="",b14s="",b15s="",b16s="";
	private String s="",s1="",s2="",s3="",s4="",s5="";
	Calculator()
	{
		f=new Frame("GUI7");
		f.setSize(200,300);
		f.setLocation(300,300);

		Font fnt=new Font("Arial",Font.PLAIN,24);
		
		BorderLayout bl1=new BorderLayout();
		f.setLayout(bl1);

		Panel p=new Panel();
		
		GridLayout gl1=new GridLayout(4,4);
		p.setLayout(gl1);

		tf1=new TextField();
		tf1.setFont(fnt);

		WindowCloser wc=new WindowCloser();

		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("+");
		b5=new Button("4");
		b6=new Button("5");
		b7=new Button("6");
		b8=new Button("-");
		b9=new Button("7");
		b10=new Button("8");
		b11=new Button("9");
		b12=new Button("*");
		b13=new Button("C");
		b14=new Button("0");
		b15=new Button("=");
		b16=new Button("/");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
	

		p.setFont(fnt);		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);

		f.add(tf1,BorderLayout.NORTH);
		f.add(p,BorderLayout.CENTER);
		f.setResizable(false);
		f.addWindowListener(wc);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o=e.getSource();
		if(o==b1)
		{
			s+=b1.getLabel();
			tf1.setText(s);
		}
		else if(o==b2)
		{
			s+=b2.getLabel();
			tf1.setText(s);
		}
		else if(o==b3)
		{
			s+=b3.getLabel();
			tf1.setText(s);
		}
		else if(o==b4)
		{
			//String temp;
			//int i=0;
			s+=b4.getLabel();
			tf1.setText(s);
			s1=tf1.getText();
			int i=s1.indexOf('+');
			s1=s1.substring(0,i);
				
		}
		else if(o==b5)
		{
			s+=b5.getLabel();
			tf1.setText(s);
		}
		else if(o==b6)
		{
			s+=b6.getLabel();
			tf1.setText(s);
		}
		else if(o==b7)
		{
			s+=b7.getLabel();
			tf1.setText(b7s);
		}
		else if(o==b8)
		{
			s+=b8.getLabel();
			tf1.setText(s);
			s2=tf1.getText();
			int i=s2.indexOf('-');
			s2=s2.substring(0,i);
		}
		else if(o==b9)
		{
			s+=b9.getLabel();
			tf1.setText(s);
		}
		else if(o==b10)
		{
			s+=b10.getLabel();
			tf1.setText(s);
		}
		else if(o==b11)
		{
			s+=b11.getLabel();
			tf1.setText(s);
		}
		else if(o==b12)
		{
			s+=b12.getLabel();
			tf1.setText(s);
			s3=tf1.getText();
			int i=s3.indexOf('*');
			s3=s3.substring(0,i);
		}
		else if(o==b13)
		{
			//s=b13.getLabel();
		}
		else if(o==b14)
		{
			s+=b14.getLabel();
			tf1.setText(s);
		}
		else if(o==b15)
		{
			s4=tf1.getText();
			if(s1!="")
			{
				s4=s4.substring(s4.indexOf('+'));
				int i=Integer.parseInt(s1)+Integer.parseInt(s4);
				s=Integer.toString(i);
				tf1.setText(s);
			}
			else if(s2!="")
			{
				s4=s4.substring(s4.indexOf('-'));
				int i=Integer.parseInt(s2)+Integer.parseInt(s4);
				s=Integer.toString(i);
				tf1.setText(s);
			}
			else if(s3!="")
			{
				s4=s4.substring(s4.indexOf('*'));
				int i=Integer.parseInt(s3)+Integer.parseInt(s4);
				s=Integer.toString(i);
				tf1.setText(s);
			}
			else if(s5!="")
			{
				s4=s4.substring(s4.indexOf('/'));
				int i=Integer.parseInt(s5)+Integer.parseInt(s4);
				s=Integer.toString(i);
				tf1.setText(s);
			}
		}
		else if(o==b16)
		{
			s+=b16.getLabel();
			tf1.setText(s);
			s5=tf1.getText();
			int i=s5.indexOf('*');
			s5=s5.substring(0,i-1);
		}
	}
	public static void main(String ar[])
	{
		Calculator c=new Calculator();
	}
}