import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.event.*;
import javax.swing.text.*;
import javax.swing.undo.*;
import java.util.*;
class InternalFrameNotepad extends WindowAdapter implements ActionListener
{
	JFrame frame;
	JInternalFrame internalframe;
	JDesktopPane desktoppane;
	JMenuBar menubar;
	JMenu menu1,menu2,menu3;
	JMenuItem menuitem1,menuitem2,menuitem3,menuitem4,menuitem5,menuitem6,menuitem7,menuitem8,menuitem9,menuitem10,menuitem11,menuitem12,menuitem13,menuitem14,menuitem15;
	JToolBar toolbar;
	JTextArea textarea;
	JPanel panel;
	ImageIcon imageicon1,imageicon2,imageicon3,imageicon4,imageicon5,imageicon6,imageicon7,imageicon8,imageicon9,imageicon10,imageicon11,imageicon12,imageicon13,imageicon14,imageicon15,imageicon16;
	JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11;
	JCheckBoxMenuItem checkbox1,checkbox2;
	JRadioButtonMenuItem radiobutton1,radiobutton2;
	ButtonGroup buttongroup;
	JScrollPane scrollpane;
	UndoManager um;
	int k=0;
	Document d;
	boolean textareachanges=false;
	boolean findreplace=true;
	boolean intialization=true;
	int start1=0;
	boolean replacebutton=false;
	File globalfile;
	int i=0;
	int k1=50;
	Vector v1;
	Iterator it;
	InternalFrameNotepad()
	{
		frame=new JFrame("Multiple Document");
		frame.setLocation(200,200);
		frame.setSize(400,400);
		frame.setBackground(Color.WHITE);
		
		desktoppane=new JDesktopPane();
		desktoppane.setBackground(Color.WHITE);
		frame.add(desktoppane,BorderLayout.CENTER);
		
		panel=new JPanel(new BorderLayout());
		
		um=new UndoManager();
		
			//textarea=new JTextArea();
			//scrollpane=new JScrollPane(textarea);
			//d=textarea.getDocument();
			//d.addUndoableEditListener(um);
		
		
		imageicon1=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-new-file-24.png");
		imageicon2=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-import-24.png");
		imageicon3=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-save-24.png");
		imageicon4=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-save-as-24.png");
		imageicon5=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-cut-24.png");
		imageicon6=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-copy-24.png");
		imageicon7=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-paste-as-text-24.png");
		imageicon8=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-undo-24.png");
		imageicon9=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-redo-24.png");
		imageicon10=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-close-window-24.png");
		imageicon11=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-printer-24.png");
		imageicon12=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-search-more-24.png");
		imageicon13=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-replace-24.png");
		imageicon14=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-bold-24 (1).png");
		imageicon15=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-italic-24.png");
		imageicon16=new ImageIcon("C:/Users/deepanshu jain/Downloads/icons8-circled-w-24.png");
		
		menu1=new JMenu("File");
		menu1.setMnemonic(KeyEvent.VK_F);
		menu2=new JMenu("Edit");
		menu2.setMnemonic(KeyEvent.VK_E);
		menu3=new JMenu("View");
		menu3.setMnemonic(KeyEvent.VK_W);
		
		menuitem1=new JMenuItem("New",KeyEvent.VK_N);
		menuitem1.setIcon(imageicon1);
		menuitem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		menuitem1.addActionListener(this);
		menuitem2=new JMenuItem("Open",KeyEvent.VK_O);
		menuitem2.setIcon(imageicon2);
		menuitem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
		menuitem2.addActionListener(this);
		menuitem3=new JMenuItem("Save",KeyEvent.VK_S);
		menuitem3.setIcon(imageicon3);
		menuitem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK));
		menuitem3.addActionListener(this);
		menuitem4=new JMenuItem("Save As",KeyEvent.VK_A);
		menuitem4.setIcon(imageicon4);
		menuitem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_DOWN_MASK));
		menuitem4.setDisplayedMnemonicIndex(5);
		menuitem4.addActionListener(this);
		menuitem5=new JMenuItem("Print",KeyEvent.VK_P);
		menuitem5.setIcon(imageicon11);
		menuitem5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.CTRL_DOWN_MASK));
		menuitem6=new JMenuItem("Exit",KeyEvent.VK_X);
		menuitem6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4,InputEvent.ALT_DOWN_MASK));
		menuitem6.addActionListener(this);
		
		menu1.add(menuitem1);
		menu1.add(menuitem2);
		menu1.addSeparator();
		menu1.add(menuitem3);
		menu1.add(menuitem4);
		menu1.addSeparator();
		menu1.add(menuitem5);
		menu1.add(menuitem6);
		
		menuitem7=new JMenuItem("Undo",KeyEvent.VK_U);
		menuitem7.setIcon(imageicon8);
		menuitem7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,InputEvent.CTRL_DOWN_MASK));
		menuitem7.addActionListener(this);
		menuitem8=new JMenuItem("Redo",KeyEvent.VK_R);
		menuitem8.setIcon(imageicon9);
		menuitem8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,InputEvent.CTRL_DOWN_MASK));
		menuitem8.addActionListener(this);
		menuitem9=new JMenuItem("Cut",KeyEvent.VK_T);
		menuitem9.setEnabled(false);
		menuitem9.addActionListener(this);
		menuitem9.setIcon(imageicon5);
		menuitem9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_DOWN_MASK));
		menuitem10=new JMenuItem("Copy",KeyEvent.VK_C);
		menuitem10.setEnabled(false);
		menuitem10.setIcon(imageicon6);
		menuitem10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_DOWN_MASK));
		menuitem10.addActionListener(this);
		menuitem11=new JMenuItem("Paste",KeyEvent.VK_P);
		menuitem11.setIcon(imageicon7);
		menuitem11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_DOWN_MASK));
		menuitem11.addActionListener(this);
		menuitem12=new JMenuItem("Delete",KeyEvent.VK_D);
		menuitem12.setIcon(imageicon10);
		menuitem12.setEnabled(false);
		menuitem12.addActionListener(this);
		menuitem13=new JMenuItem("Select All",KeyEvent.VK_L);
		menuitem13.setDisplayedMnemonicIndex(8);
		menuitem13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,InputEvent.CTRL_DOWN_MASK));
		menuitem13.addActionListener(this);
		menuitem14=new JMenuItem("Find",KeyEvent.VK_F);
		menuitem14.setIcon(imageicon12);
		menuitem14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,InputEvent.CTRL_DOWN_MASK));
		menuitem14.addActionListener(this);
		menuitem15=new JMenuItem("Repalce",KeyEvent.VK_R);
		menuitem15.setIcon(imageicon13);
		menuitem15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_DOWN_MASK));
		menuitem15.addActionListener(this);
		
		menu2.add(menuitem7);
		menu2.add(menuitem8);
		menu2.addSeparator();
		menu2.add(menuitem9);
		menu2.add(menuitem10);
		menu2.add(menuitem11);
		menu2.addSeparator();
		menu2.add(menuitem12);
		menu2.addSeparator();
		menu2.add(menuitem13);
		menu2.add(menuitem14);
		menu2.add(menuitem15);
		
		checkbox1=new JCheckBoxMenuItem("Bold",imageicon14);
		checkbox1.setMnemonic(0);
		checkbox1.addActionListener(this);
		checkbox2=new JCheckBoxMenuItem("Italic",imageicon15);
		checkbox2.setMnemonic(0);
		checkbox2.addActionListener(this);
		
		radiobutton1=new JRadioButtonMenuItem("Wrap",imageicon16);
		radiobutton1.setMnemonic(0);
		radiobutton1.addActionListener(this);
		radiobutton2=new JRadioButtonMenuItem("No Wrap",imageicon16);
		radiobutton2.setMnemonic(0);
		radiobutton2.addActionListener(this);
		
		buttongroup=new ButtonGroup();
		buttongroup.add(radiobutton1);
		buttongroup.add(radiobutton2);
		
		menu3.add(checkbox1);
		menu3.add(checkbox2);
		menu3.addSeparator();
		menu3.add(radiobutton1);
		menu3.add(radiobutton2);
		
		menubar=new JMenuBar();
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
		
		button1=new JButton();
		button1.setIcon(imageicon1);
		button1.setBorderPainted(false);
		button1.setContentAreaFilled(false);
		button1.setToolTipText("New File");
		button1.addActionListener(this);
		
		button2=new JButton();
		button2.setIcon(imageicon2);
		button2.setBorderPainted(false);
		button2.setContentAreaFilled(false);
		button2.setToolTipText("Open File");
		button2.addActionListener(this);
		
		button3=new JButton();
		button3.setIcon(imageicon3);
		button3.setBorderPainted(false);
		button3.setContentAreaFilled(false);
		button3.setToolTipText("Save");
		button3.addActionListener(this);
		
		button4=new JButton();
		button4.setIcon(imageicon4);
		button4.setBorderPainted(false);
		button4.setContentAreaFilled(false);
		button4.setToolTipText("Save As");
		button4.addActionListener(this);
		
		button5=new JButton();
		button5.setIcon(imageicon5);
		button5.setBorderPainted(false);
		button5.setContentAreaFilled(false);
		button5.setToolTipText("Cut");
		button5.setEnabled(false);
		button5.addActionListener(this);
		
		button6=new JButton();
		button6.setIcon(imageicon6);
		button6.setBorderPainted(false);
		button6.setContentAreaFilled(false);
		button6.setToolTipText("Copy");
		button6.setEnabled(false);
		button6.addActionListener(this);
		
		button7=new JButton();
		button7.setIcon(imageicon7);
		button7.setBorderPainted(false);
		button7.setContentAreaFilled(false);
		button7.setToolTipText("Paste");
		button7.addActionListener(this);
		
		button8=new JButton();
		button8.setIcon(imageicon8);
		button8.setBorderPainted(false);
		button8.setContentAreaFilled(false);
		button8.setToolTipText("Undo");
		button8.addActionListener(this);
		
		button9=new JButton();
		button9.setIcon(imageicon9);
		button9.setBorderPainted(false);
		button9.setContentAreaFilled(false);
		button9.setToolTipText("Redo");
		button9.addActionListener(this);
		
		button10=new JButton();
		button10.setIcon(imageicon10);
		button10.setBorderPainted(false);
		button10.setContentAreaFilled(false);
		button10.setToolTipText("Delete");
		button10.setEnabled(false);
		button10.addActionListener(this);
		
		button11=new JButton();
		button11.setIcon(imageicon11);
		button11.setBorderPainted(false);
		button11.setContentAreaFilled(false);
		button11.setToolTipText("Printer");
		
		if(textarea!=null)
		{
		textarea.addCaretListener(new CaretListener()
									{
										public void caretUpdate(CaretEvent e)
										{
											int x,y,z;
											x=textarea.getSelectionStart();
											y=textarea.getSelectionEnd();
											z=y-x;
											if(z>0)
											{
												menuitem7.setEnabled(true);
												menuitem8.setEnabled(true);
												menuitem9.setEnabled(true);
												menuitem10.setEnabled(true);
												menuitem12.setEnabled(true);
												button5.setEnabled(true);
												button6.setEnabled(true);
												button8.setEnabled(true);
												button9.setEnabled(true);
												button10.setEnabled(true);
												
											}
											else if(z==0)
											{
												menuitem9.setEnabled(false);
												menuitem10.setEnabled(false);
												menuitem12.setEnabled(false);
												button5.setEnabled(false);
												button6.setEnabled(false);
												button10.setEnabled(false);
											}
										}
									});
		textarea.getDocument().addDocumentListener(new DocumentListener()
									{
											public void insertUpdate(DocumentEvent e)
											{
												textareachanges=false;
											}
											public void removeUpdate(DocumentEvent e)
											{
												textareachanges=false;
											}
											public void changedUpdate(DocumentEvent e)
											{
												textareachanges=false;
											}
									});
		}
		
		toolbar=new JToolBar();
		toolbar.setMargin(new Insets(10,20,10,20));
		toolbar.add(button1);
		toolbar.add(button2);
		toolbar.add(button3);
		toolbar.add(button4);
		toolbar.add(button5);
		toolbar.add(button6);
		toolbar.add(button7);
		toolbar.add(button8);
		toolbar.add(button9);
		toolbar.add(button10);
		toolbar.add(button11);
		toolbar.setFloatable(false);
		
		panel.add(menubar,BorderLayout.NORTH);
		panel.add(toolbar,BorderLayout.CENTER);
		
		//frame.addWindowListener(this);
		frame.add(panel,BorderLayout.NORTH);
		frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object o=e.getSource();
		if(o==menuitem1 || o==button1)
		{
			InputS();
		}
		else if(o==menuitem2 || o==button2)
		{
			FileChooser();
		}
		else if(o==menuitem3 || o==button3)
		{
			SaveAS();
			
		}
		else if(o==menuitem4 || o==button4)
		{
			SaveAS();
		}
		else if(o==menuitem6)
		{
			String s=textarea.getText();
			if(s.length()!=0)
			{
				Dialog d=new Dialog(frame,"Notepad",true);
				d.setLayout(new GridBagLayout());
				d.setSize(410,100);
				d.setLocation(300,300);
				JButton b1,b2,b3;
				JLabel l=new JLabel("Do You Really Want To Save?");
				GridBagConstraints gbc=new GridBagConstraints();
				b1=new JButton("Save");
				b2=new JButton("Don't Save");
				b3=new JButton("Cancel");
			
				gbc.gridx=0;
				gbc.gridy=0;
				d.add(l,gbc);
		
				gbc.anchor=GridBagConstraints.EAST;
				gbc.gridx=0;
				gbc.gridy=1;
				d.add(b1,gbc);
			
				gbc.insets=new Insets(10,10,10,0);
				gbc.gridx=1;
				gbc.gridy=1;
				d.add(b2,gbc);
			
				gbc.anchor=GridBagConstraints.WEST;
				gbc.gridx=2;
				gbc.gridy=1;
				d.add(b3,gbc);
			
				b1.addActionListener((E)->{JFileChooser jf=new JFileChooser();
										int x=jf.showSaveDialog(d);
										if(x==JFileChooser.APPROVE_OPTION)
										{
											File f1=jf.getSelectedFile();
											FileOutputStream fos;
											try{
												String s0=textarea.getText();
												byte d1[]=s0.getBytes();
												fos=new FileOutputStream(f1);
												for(int h:d1)
													fos.write(h);
												fos.close();
											}
											catch(IOException K)
											{
												System.out.println(K.getMessage());
											}
											//textarea.replaceRange("",0,s.length());
											d.setVisible(false);
											frame.setVisible(false);
											System.exit(0);
										}
										else if(x==JFileChooser.CANCEL_OPTION)
										{
											d.setVisible(false);
										}
										});
				b2.addActionListener((E)->{textarea.replaceRange("",0,s.length()); 
										d.setVisible(false);
										frame.setVisible(false);
										System.exit(0);
										});
				b3.addActionListener((E)->{d.setVisible(false);});
				WindowCloser wc=new WindowCloser();
				d.addWindowListener(wc);
				d.setVisible(true);
			}
			else
			{
				frame.setVisible(false);
				System.exit(0);
			}
		}
		else if(o==menuitem9 || o==button5)
		{
			textarea.cut();
		}
		else if(o==menuitem10 || o==button6)
		{
			textarea.copy();
		}
		else if(o==menuitem11 || o==button7)
		{
			textarea.paste();
		}
		else if(o==menuitem12 || o==button10)
		{
			int a=textarea.getSelectionStart();
			int b=textarea.getSelectionEnd();
			textarea.replaceRange("",a,b);
		}
		else if(o==menuitem13)
		{
			textarea.selectAll();
		}
		else if(o==menuitem14 || o==menuitem15)
		{
			FindReplace();
		}
		else if(o==checkbox1)
		{
			if(checkbox1.getState()==true && checkbox2.getState()==false)
			{
				textarea.setFont(new Font("Arial",Font.BOLD,14));
			}
			else if(checkbox1.getState()==false && checkbox2.getState()==false)
			{
				textarea.setFont(new Font("Arial",Font.PLAIN,14));
			}
			else if(checkbox1.getState()==true && checkbox2.getState()==true)
			{
				textarea.setFont(new Font("Arial",Font.BOLD | Font.ITALIC,14));
			}
			else if(checkbox1.getState()==false && checkbox2.getState()==true)
			{
				textarea.setFont(new Font("Arial",Font.ITALIC,14));
			}
		}
		else if(o==checkbox2)
		{
			if(checkbox2.getState()==true && checkbox1.getState()==false)
			{
				textarea.setFont(new Font("Arial",Font.ITALIC,14));
			}
			else if(checkbox1.getState()==false && checkbox2.getState()==false)
			{
				textarea.setFont(new Font("Arial",Font.PLAIN,14));
			}
			else if(checkbox1.getState()==true && checkbox2.getState()==true)
			{
				textarea.setFont(new Font("Arial",Font.BOLD | Font.ITALIC,14));
			}
			else if(checkbox1.getState()==true && checkbox2.getState()==false)
			{
				textarea.setFont(new Font("Arial",Font.BOLD | Font.ITALIC,14));
			}
		}
		else if(o==radiobutton1)
		{
			textarea.setLineWrap(true);
		}
		else if(o==radiobutton2)
		{
			textarea.setLineWrap(false);
		}
		else if(o==menuitem7 || o==button8)
		{
			try
			{
				um.undo();
			}
			catch(CannotUndoException E)
			{
				menuitem7.setEnabled(false);
				button8.setEnabled(false);
			}
			
		}
		else if(o==menuitem8 || o==button9)
		{
			try
			{
				um.redo();
			}
			catch(CannotRedoException E)
			{
				menuitem8.setEnabled(false);
				button9.setEnabled(false);
			}
		}
	}
	public void SaveAS(){
			JFileChooser jfc=new JFileChooser();
			if(textareachanges==false)
			{
			int x=jfc.showDialog(frame,"Save");
			File f1=jfc.getSelectedFile();
			FileOutputStream fos;
			if(x==JFileChooser.APPROVE_OPTION)
			{
			boolean b=f1.exists();
			if(b==true)
			{
				JDialog d=new JDialog(frame,"Notepad",true);
				d.setLayout(new GridBagLayout());
				d.setSize(410,100);
				d.setLocation(300,300);
				JButton b1,b2,b3;
				JLabel l=new JLabel("Do You Really Want To Replace it?");
				GridBagConstraints gbc=new GridBagConstraints();
				b1=new JButton("Yes");
				b2=new JButton("No");
			
				gbc.gridx=0;
				gbc.gridy=0;
				d.add(l,gbc);
		
				gbc.anchor=GridBagConstraints.EAST;
				gbc.gridx=0;
				gbc.gridy=1;
				d.add(b1,gbc);
			
				gbc.insets=new Insets(10,10,10,0);
				gbc.gridx=1;
				gbc.gridy=1;
				d.add(b2,gbc);
			
				b1.addActionListener((E)->{
										try{
											FileOutputStream fos1;
											String s=textarea.getText();
											byte n[]=s.getBytes();
											fos1=new FileOutputStream(f1);
											for(int h:n)
												fos1.write(h);
											textarea.replaceRange("",0,s.length());
											textareachanges=true;
											fos1.close();
											}
											catch(IOException q)
											{
												System.out.println(q.getMessage());
											}d.setVisible(false);}
											);
				b2.addActionListener((E)->{d.setVisible(false);
												;});
				d.setVisible(true);
			}
			else
			{
				try{
				String s=textarea.getText();
				byte d[]=s.getBytes();
				fos=new FileOutputStream(f1);
				for(int h:d)
					fos.write(h);
				textareachanges=true;
				fos.close();
				}
				catch(IOException y)
				{
					System.out.println(y.getMessage());
				}
			}
			}
			}
			}
		public void windowClosing(WindowEvent e)
		{
			Window w;
			w=e.getWindow();
			String s=textarea.getText();
			//System.out.println(s);
			if(s.length()!=0 && textareachanges==false)
			{
				Dialog d=new Dialog(frame,"Notepad",true);
				d.setLayout(new GridBagLayout());
				d.setSize(410,100);
				d.setLocation(300,300);
				JButton b1,b2,b3;
				JLabel l=new JLabel("Do You Really Want To Save?");
				GridBagConstraints gbc=new GridBagConstraints();
				b1=new JButton("Save");
				b2=new JButton("Don't Save");
				b3=new JButton("Cancel");
			
				gbc.gridx=0;
				gbc.gridy=0;
				d.add(l,gbc);
		
				gbc.anchor=GridBagConstraints.EAST;
				gbc.gridx=0;
				gbc.gridy=1;
				d.add(b1,gbc);
			
				gbc.insets=new Insets(10,10,10,0);
				gbc.gridx=1;
				gbc.gridy=1;
				d.add(b2,gbc);
			
				gbc.anchor=GridBagConstraints.WEST;
				gbc.gridx=2;
				gbc.gridy=1;
				d.add(b3,gbc);
			
				b1.addActionListener((E)->{JFileChooser jf=new JFileChooser();
										int x=jf.showSaveDialog(d);
										if(x==JFileChooser.APPROVE_OPTION)
										{
											File f1=jf.getSelectedFile();
											FileOutputStream fos;
											try{
												String s0=textarea.getText();
												byte d1[]=s0.getBytes();
												fos=new FileOutputStream(f1);
												for(int h:d1)
													fos.write(h);
												fos.close();
											}
											catch(IOException K)
											{
												System.out.println(K.getMessage());
											}
											//textarea.replaceRange("",0,s.length());
											d.setVisible(false);
											frame.setVisible(false);
											System.exit(0);
										}
										else if(x==JFileChooser.CANCEL_OPTION)
										{
											d.setVisible(false);
										}
										});
				b2.addActionListener((E)->{textarea.replaceRange("",0,s.length()); 
										d.setVisible(false);
										frame.setVisible(false);
										System.exit(0);
										});
				b3.addActionListener((E)->{d.setVisible(false);});
				//WindowCloser wc=new WindowCloser();
				//d.addWindowListener(wc);
				d.setVisible(true);
			}
			/*else
			{
				frame.setVisible(false);
				System.exit(0);
			}*/
		//w.setVisible(false);
		//w.dispose();
		}
	
	
	public void InputS()
	{
		internalframe=new JInternalFrame(("InternalFrame"+i),true,true,true,true);
		internalframe.setLocation(100+k1,100+k1);
		internalframe.setSize(350,300);
		internalframe.setBackground(Color.white);
		
		textarea=new JTextArea();
		scrollpane=new JScrollPane(textarea);
		
		internalframe.add(scrollpane,BorderLayout.CENTER);
		internalframe.setVisible(true);
		
		desktoppane.add(internalframe);
		internalframe.moveToFront();
		
		v1=new Vector(10,5);
		
		v1.add(internalframe);
		
		i++;
		k1=k1+50;
		
		it=v1.iterator();
		
		//System.out.println("hello");
		//String s=textarea.getText();
		if(it.hasNext()==true)
		{
			//JInternalFrame o=(JInternalFrame)it.next();
			String s=textarea.getText();
		if(s.length()!=0 && textareachanges==false)
		{
			Dialog d=new Dialog(frame,"Notepad",true);
			d.setLayout(new GridBagLayout());
			d.setSize(410,100);
			d.setLocation(300,300);
			JButton b1,b2,b3;
			JLabel l=new JLabel("Do You Really Want To Save?");
			GridBagConstraints gbc=new GridBagConstraints();
			b1=new JButton("Save");
			b2=new JButton("Don't Save");
			b3=new JButton("Cancel");
			
			gbc.gridx=0;
			gbc.gridy=0;
			d.add(l,gbc);
		
			gbc.anchor=GridBagConstraints.EAST;
			gbc.gridx=0;
			gbc.gridy=1;
			d.add(b1,gbc);
			
			gbc.insets=new Insets(10,10,10,0);
			gbc.gridx=1;
			gbc.gridy=1;
			d.add(b2,gbc);
			
			gbc.anchor=GridBagConstraints.WEST;
			gbc.gridx=2;
			gbc.gridy=1;
			d.add(b3,gbc);
			
			b1.addActionListener((e)->{	if(textareachanges==true)
										{
										JFileChooser jf=new JFileChooser();
										int x=jf.showSaveDialog(d);
										if(x==JFileChooser.APPROVE_OPTION)
										{
																						File f1=jf.getSelectedFile();
											FileOutputStream fos;
											try{
												String s0=textarea.getText();
												byte d1[]=s0.getBytes();
												fos=new FileOutputStream(f1);
												for(int h:d1)
													fos.write(h);
												fos.close();
											}
											catch(IOException K)
											{
												System.out.println(K.getMessage());
											}
											textarea.replaceRange("",0,s.length());
											d.setVisible(false);
										}
										else if(x==JFileChooser.CANCEL_OPTION)
										{
											textarea.replaceRange("",0,s.length());
											d.setVisible(false);
										}
										}
										else
										{
											FileOutputStream fos;
											try{
												String s0=textarea.getText();
												byte d1[]=s0.getBytes();
												fos=new FileOutputStream(globalfile);
												for(int h:d1)
													fos.write(h);
												//textarea.replaceRange("",0,s0.length());
												fos.close();
											}
											catch(IOException L)
											{
												System.out.println(L.getMessage());
											}
											d.setVisible(false);
										}
										});
			b2.addActionListener((e)->{textarea.replaceRange("",0,s.length()); 
										d.setVisible(false);});
			b3.addActionListener((e)->{d.setVisible(false);});
			WindowCloser wc=new WindowCloser();
			d.addWindowListener(wc);
			d.setVisible(true);
		}
		else
		{
			textarea.replaceRange("",0,s.length());
		}
		}
	}
	
	
	public void FileChooser()
	{
		String s=textarea.getText();
		System.out.println(s);
		if(s.length()!=0 && textareachanges==false)
		{
			Dialog d=new Dialog(frame,"Notepad",true);
			d.setLayout(new GridBagLayout());
			d.setSize(410,100);
			d.setLocation(300,300);
			JButton b1,b2,b3;
			JLabel l=new JLabel("Do You Really Want To Save?");
			GridBagConstraints gbc=new GridBagConstraints();
			b1=new JButton("Save");
			b2=new JButton("Don't Save");
			b3=new JButton("Cancel");
			
			gbc.gridx=0;
			gbc.gridy=0;
			d.add(l,gbc);
		
			gbc.anchor=GridBagConstraints.EAST;
			gbc.gridx=0;
			gbc.gridy=1;
			d.add(b1,gbc);
			
			gbc.insets=new Insets(10,10,10,0);
			gbc.gridx=1;
			gbc.gridy=1;
			d.add(b2,gbc);
			
			gbc.anchor=GridBagConstraints.WEST;
			gbc.gridx=2;
			gbc.gridy=1;
			d.add(b3,gbc);
			
			b1.addActionListener((e)->{
										if(textareachanges==true)
										{
										JFileChooser jf=new JFileChooser();
										int x=jf.showSaveDialog(d);
										if(x==JFileChooser.APPROVE_OPTION)
										{
																						File f1=jf.getSelectedFile();
											FileOutputStream fos;
											try{
												String s0=textarea.getText();
												byte d1[]=s0.getBytes();
												fos=new FileOutputStream(f1);
												for(int h:d1)
													fos.write(h);
												fos.close();
											}
											catch(IOException K)
											{
												System.out.println(K.getMessage());
											}
											textarea.replaceRange("",0,s.length());
											d.setVisible(false);
										}
										else if(x==JFileChooser.CANCEL_OPTION)
										{
											//textarea.replaceRange("",0,s.length());
											d.setVisible(false);
										}
										}
										else
										{
											FileOutputStream fos;
											try{
												String s0=textarea.getText();
												byte d1[]=s0.getBytes();
												fos=new FileOutputStream(globalfile);
												for(int h:d1)
													fos.write(h);
												textarea.replaceRange("",0,s0.length());
												fos.close();
											}
											catch(IOException L)
											{
												System.out.println(L.getMessage());
											}
											d.setVisible(false);
										}
										});
			b2.addActionListener((e)->{textarea.replaceRange("",0,s.length()); 
										d.setVisible(false);
										JFileChooser jfc=new JFileChooser();
										int x;
										x=jfc.showOpenDialog(frame);
										File f=jfc.getSelectedFile();
										//System.out.println(f);
										if(x==JFileChooser.APPROVE_OPTION)
										{
											try{
												FileInputStream fis=new FileInputStream(f);
												byte k[]=new byte[fis.available()];
												fis.read(k);
												String s1=new String(k);
												textarea.setText(s1);
												fis.close();
												}
											catch(IOException E)
											{
												System.out.println(E.getMessage());
											}
										}});
			b3.addActionListener((e)->{d.setVisible(false);});
			WindowCloser wc=new WindowCloser();
			d.addWindowListener(wc);
			d.setVisible(true);
		}
		else
		{
		JFileChooser jfc=new JFileChooser();
		int x;
		x=jfc.showOpenDialog(frame);
		File f=jfc.getSelectedFile();
		globalfile=f;
		if(x==JFileChooser.APPROVE_OPTION)
		{
		try{
		FileInputStream fis=new FileInputStream(f);
		byte k[]=new byte[fis.available()];
		fis.read(k);
		char l;
		String s1=new String(k);
		//Object o=v1.get(i)
		textarea.setText(s1);
		textareachanges=true;
		fis.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		}
		
		}
	}
	
	public void FindReplace()
	{
		Dialog d=new Dialog(frame,"Find/Repalce",false);
		d.setLayout(new GridBagLayout());
		d.setSize(600,200);
		d.setLocation(300,300);
		JButton b1,b2,b3;
		JLabel l1,l2;
		JTextField tf1,tf2;
		JRadioButton rb1,rb2;
		ButtonGroup bg;
		l1=new JLabel("Find");
		l2=new JLabel("Replace");
		
		tf1=new JTextField();
		tf2=new JTextField();
		
		rb1=new JRadioButton("Up");
		rb2=new JRadioButton("Down");
		rb2.setSelected(true);
		bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		b1=new JButton("Find Next");
		b2=new JButton("Replace");
		b3=new JButton("Replace All");
		
		GridBagConstraints gbc;
		gbc=new GridBagConstraints();
		gbc.insets=new Insets(10,10,10,10);
		gbc.gridx=0;
		gbc.gridy=0;
		d.add(l1,gbc);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=1;
		gbc.gridy=0;
		d.add(tf1,gbc);
		
		gbc.fill=GridBagConstraints.NONE;
		gbc.gridx=2;
		gbc.gridy=0;
		d.add(b1,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		d.add(rb1,gbc);
		
		gbc.gridx=1;
		gbc.gridy=1;
		d.add(rb2,gbc);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=2;
		d.add(l2,gbc);
		
		
		gbc.gridx=1;
		gbc.gridy=2;
		d.add(tf2,gbc);
		
		gbc.fill=GridBagConstraints.NONE;
		gbc.gridx=2;
		gbc.gridy=2;
		d.add(b2,gbc);
		
		gbc.anchor=GridBagConstraints.EAST;
		gbc.gridx=3;
		gbc.gridy=2;
		d.add(b3,gbc);
		
		rb1.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent e){
		findreplace=false;}});
		rb2.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent e){
		findreplace=true;}});
		String s0=textarea.getSelectedText();
		tf1.setText(s0);
		tf1.selectAll();
			b1.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent e)
									{
										if(findreplace==true)
										{
										replacebutton=true;
										
										String s=tf1.getText();
										String s1=textarea.getText();
										int start=s1.indexOf(s,k);
										int end=start+s.length();
										k=start+1;
										if(start==-1)
										{
											System.out.println(start);
											JDialog d=new JDialog(frame,"Notepad",true);
											d.setLayout(new GridBagLayout());
											d.setSize(200,100);
											d.setLocation(300,300);
											JButton b1;
											JLabel l=new JLabel("Cannot find"+"\""+s+"\"");
											GridBagConstraints gbc=new GridBagConstraints();
											b1=new JButton("Ok");
			
											gbc.gridx=0;
											gbc.gridy=0;
											d.add(l,gbc);
											
											gbc.gridx=0;
											gbc.gridy=1;
											d.add(b1,gbc);
											
											b1.addActionListener((E)->{d.setVisible(false);
																	});
											
											d.setVisible(true);
										}
										else
										{
											textarea.select(start,end);
										}
										}
										else if(findreplace==false)
										{
										String s=tf1.getText();
										String s1=textarea.getText();
										if(intialization==true)
										{
											k=s1.length();
											//start=0;
											intialization=false;
										}
										else if(intialization==false)
										{
											k=start1-1;
										}
										start1=s1.lastIndexOf(s,k);
										int end=start1+s.length();
										//k=start-1;
										if(start1==-1)
										{
											//System.out.println(start);
											JDialog d=new JDialog(frame,"Notepad",true);
											d.setLayout(new GridBagLayout());
											d.setSize(200,100);
											d.setLocation(300,300);
											JButton b1;
											JLabel l=new JLabel("Cannot find"+"\""+s+"\"");
											GridBagConstraints gbc=new GridBagConstraints();
											b1=new JButton("Ok");
			
											gbc.gridx=0;
											gbc.gridy=0;
											d.add(l,gbc);
											
											gbc.gridx=0;
											gbc.gridy=1;
											d.add(b1,gbc);
											
											b1.addActionListener((E)->{d.setVisible(false);
																	});
											
											d.setVisible(true);
										}
										else
										{
											textarea.select(start1,end);
										}
										}
									}				
								});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					System.out.println("hello");
					String s=tf2.getText();
					String s1=textarea.getText();
					String s2=tf1.getText();
					int start=s1.indexOf(s2,k);
					int end=start+s2.length();
					k=start+1;
					textarea.select(start,end);
					if(start!=-1)
					{
						textarea.select(start,end);
						textarea.replaceSelection(s);
						//textarea.select(start,end);
					}
					else if(start==-1)
					{
											//System.out.println(start);
											JDialog d=new JDialog(frame,"Notepad",true);
											d.setLayout(new GridBagLayout());
											d.setSize(200,100);
											d.setLocation(300,300);
											JButton b1;
											JLabel l=new JLabel("Cannot find"+"\""+s2+"\"");
											GridBagConstraints gbc=new GridBagConstraints();
											b1=new JButton("Ok");
			
											gbc.gridx=0;
											gbc.gridy=0;
											d.add(l,gbc);
											
											gbc.gridx=0;
											gbc.gridy=1;
											d.add(b1,gbc);
											
											b1.addActionListener((E)->{d.setVisible(false);
																	});
											
											d.setVisible(true);
					}
			}
		});
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int count=-1,start=0,end=0;
				//System.out.println("hello");
				while(start!=-1)
				{
					String s=tf2.getText();
					String s1=textarea.getText();
					String s2=tf1.getText();
					start=s1.indexOf(s2,k);
					end=start+s2.length();
					k=start+1;
					count++;
				}
				if(count!=0)
				{
					JDialog d=new JDialog(frame,"Notepad",true);
											d.setLayout(new GridBagLayout());
											d.setSize(200,100);
											d.setLocation(300,300);
											JButton b1;
											JLabel l=new JLabel("Total items to replace"+count+"items");
											GridBagConstraints gbc=new GridBagConstraints();
											b1=new JButton("Ok");
			
											gbc.gridx=0;
											gbc.gridy=0;
											d.add(l,gbc);
											
											gbc.gridx=0;
											gbc.gridy=1;
											d.add(b1,gbc);
											
											b1.addActionListener((E)->{int start1=0,end1=0;
												while(start1!=-1)
												{
													String s=tf2.getText();
													String s1=textarea.getText();
													String s2=tf1.getText();
													start1=s1.indexOf(s2,k);
													end1=start1+s2.length();
													k=start1+1;
													if(start1!=-1)
													{
														textarea.replaceRange(s,start1,end1);
													}
												}
												d.setVisible(false);
											});
											d.setVisible(true);
				}
					
			}
		});
		WindowCloser wc=new WindowCloser();
		d.addWindowListener(wc);
		d.setVisible(true);
	}
	public static void main(String ar[])
	{
		InternalFrameNotepad ifn=new InternalFrameNotepad();
	}
}
