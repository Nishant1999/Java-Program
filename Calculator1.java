import java.awt.*;
import java.awt.event.*;
class Calculator1 implements ActionListener
{
	private Frame f;
	private TextField tf1;
	private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	private String s1;
	Calculator1()
	{
		f=new Frame("Calculator1");
		f.setSize(200,200);
		f.setLocation(300,300);
		
		Font fnt=new Font("Arial",Font.PLAIN,24);
		
		BorderLayout bl1=new BorderLayout();
		f.setLayout(bl1);
		
		Panel p=new Panel();
		
		GridLayout gl1=new GridLayout(4,4);
		p.setLayout(gl1);
		
		tf1=new TextField(30);
		//tf1.setFont(fnt);

		WindowCloser wc=new WindowCloser();
		
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("10");
		b11=new Button("11");
		b12=new Button("12");
		b13=new Button("13");
		b14=new Button("14");
		b15=new Button("15");
		b16=new Button("16");

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
			tf1.setText(b1.getLabel());
		}
	}
	public static void main(String ar[])
	{
		Calculator1 c=new Calculator1();
	}
}