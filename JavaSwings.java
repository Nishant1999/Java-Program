import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JavaSwings
{
	JavaSwings()
	{
		JFrame j=new JFrame();
		JPanel p=new JPanel(); 
		ImageIcon ii=new ImageIcon("G:/thumbs-up-smiley.png");
		Image i=ii.getImage();
		j.setIconImage(i);
		j.setSize(300,300);
		j.setLocation(200,200);
		p.setBackground(Color.RED);
		Font f=new Font("Arial",Font.BOLD,14);
		p.setFont(f);
		p.setLayout(new BorderLayout());
		JButton b=new JButton("Ok",ii);
		b.setBackground(Color.YELLOW);
		JButton b1=new JButton("Cancel");
		b1.setIcon(ii);
		JMenuBar jb=new JMenuBar();
		JMenu jm=new JMenu("File");
		JMenuItem ji=new JMenuItem("New File",KeyEvent.VK_N);
		JMenuItem ji1=new JMenuItem("Save");
		JCheckBoxMenuItem jcb=new JCheckBoxMenuItem("PDF",ii);
		JRadioButtonMenuItem jrb=new JRadioButtonMenuItem("Other");
		//ji.add(jcb);
		jm.add("Deepanshu");
		jm.add(ji);
		jm.insertSeparator(1);
		jm.add(ji1);
		JMenu jm1=new JMenu("Edit");
		jm1.add(jcb);
		jm1.add(jrb);
		jb.add(jm);
		jb.add(jm1);
		JCheckBox cb=new JCheckBox("Male",true);
		JCheckBox cb1=new JCheckBox("Female",false);
		//cb.setVerticalAlignmentText(SwingConstants.BOTTOM);
		cb.setVerticalAlignment(SwingConstants.TOP);
		JRadioButton rb=new JRadioButton("Female");
		JRadioButton rb1=new JRadioButton("Other");
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb);
		bg.add(rb1);
		System.out.println(b1.getIcon());
		b1.setIconTextGap(100);
		System.out.println(b1.getIconTextGap());
		b1.setHorizontalAlignment(SwingConstants.LEFT);
		//b1.setVerticalAlignment(SwingConstants.TOP);
		b1.setHorizontalTextPosition(SwingConstants.RIGHT);
		b1.setVerticalTextPosition(SwingConstants.BOTTOM);
		b1.setMargin(new Insets(50,50,50,50));
		b1.setMnemonic(KeyEvent.VK_C);
		b1.setDisplayedMnemonicIndex(3);
		System.out.println(b1.isEnabled());
		b1.addActionListener((e)->b1.setBackground(Color.BLUE));
		b1.addKeyListener(new KeyListener()
					{
						public void keyTyped(KeyEvent e)
						{
							System.out.println(e.getKeyChar());
						}
						public void keyPressed(KeyEvent e)
						{
							System.out.println(e.getKeyCode());
						}
						public void keyReleased(KeyEvent e)
						{
						}
					});
		p.add(b1,BorderLayout.EAST);
		p.add(b,BorderLayout.WEST);
		p.add(cb,BorderLayout.SOUTH);
		p.add(cb1);
		p.add(jb,BorderLayout.NORTH);
		j.add(p);
		//Container c=j.getContentPane();
		//System.out.println(c);
		//j.remove(b1);
		//c.setSize(1500,1500);
		//c.setLocation(200,200);
		//c.setContentPane(p);
		//j.setDefaultLookAndFeelDecorated(true);
		b1.setFocusable(false);
		j.setLocationRelativeTo(null);
		j.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		j.setVisible(true);
	}
	public static void main(String ar[])
	{
		JavaSwings js=new JavaSwings();
	}
}
		