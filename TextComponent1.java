import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
import java.io.*;
class TextComponent1
{
	TextComponent1()
	{
		JFrame f=new JFrame("TextComponent");
		f.setLocation(300,300);
		f.setSize(500,500);
		f.setLayout(new FlowLayout());
		
		JPanel p=new JPanel();

		//JLabel l=new JLabel("Username");
		//JLabel l1=new JLabel("Password");
	
		//JTextField tf=new JTextField(30);
		//tf.setText("deepanshu jain");
		//tf.setSelectedTextColor(Color.YELLOW);
		//tf.setDisabledTextColor(Color.YELLOW);
		//System.out.println(tf.getSelectedText());
		//tf.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		//tf.setMargin(new Insets(20,20,20,20));
		//tf.setHorizontalAlignment(JTextField.CENTER);

		//JPasswordField jpf=new JPasswordField("deepanshujain",30);
		//jpf.echoCharIsSet();
		//System.out.println(jpf.getPassword());

		//JTextArea jta=new JTextArea("Deepanshu jain",25,25);
		//jta.setLineWrap(false);

		JButton b1=new JButton("Save");

		b1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							JFileChooser jf=new JFileChooser(new File("F:/JavaProgram"));
							FileNameExtensionFilter filter=new FileNameExtensionFilter("Program file only","java","c","cpp","py");
							//File f1[];
							jf.setFileFilter(filter);
							int x;
							x=jf.showOpenDialog(f);
							//x=jf.showDialog(f,"play");
							jf.setMultiSelectionEnabled(true);
							jf.setApproveButtonText("Deepa");
							jf.setApproveButtonMnemonic(2);
							//f1=jf.getSelectedFiles();
							//System.out.println(f1);
							jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
							if(x==JFileChooser.APPROVE_OPTION)
							{
								System.out.println("hello");
							} 
						}
					});
		
		//p.add(l);
		//p.add(tf);
		//p.add(l1);
		//p.add(jpf);
		//p.add(b1);
		p.add(b1);
		f.add(p);
		//f.add(jfc);
		f.setVisible(true);
	}
	public static void main(String ar[])
	{
		TextComponent1 tc=new TextComponent1();
	}
}