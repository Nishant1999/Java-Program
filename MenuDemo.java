import java.awt.*;
import java.awt.event.*;
import java.io.*;
class MenuDemo implements ActionListener,ItemListener
{
	private Frame f;
	private MenuBar mb;
	private Menu file,edit,others,options;
	private MenuItem neu,open,save,saveas,cut,copy,paste,one,two;
	private CheckboxMenuItem toolbar,statusbar;
	private String s1,s2,s3,s11,s;
	private TextArea ta1;
	private FileOutputStream fos;
	private FileInputStream fis;
	private byte d[];
	private File f1;
	public MenuDemo()
	{
		f=new Frame("Menu Demo");
		f.setBounds(50,50,400,400);
		
		mb=new MenuBar();
		
		file=new Menu("File");
		edit=new Menu("Edit");
		options=new Menu("Options");
		others=new Menu("Others");
		
		neu=new MenuItem("New");
		open=new MenuItem("Open");
		save=new MenuItem("Save");
		saveas=new MenuItem("Save As");
		cut=new MenuItem("Cut");
		copy=new MenuItem("Copy");
		paste=new MenuItem("Paste");
		one=new MenuItem("One");
		two=new MenuItem("Two");
		
		neu.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		saveas.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		
		toolbar=new CheckboxMenuItem("Toolbar");
		statusbar=new CheckboxMenuItem("Statusbar");

		toolbar.addItemListener(this);
		statusbar.addItemListener(this);
		
		file.add(neu);
		file.add(open);
		file.addSeparator();
		file.add(save);
		file.add(saveas);

		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
	
		others.add(one);
		others.add(two);
	
		options.add(toolbar);
		options.add(statusbar);
		options.addSeparator();
		options.add(others);

		mb.add(file);
		mb.add(edit);
		mb.add(options);
		
		ta1=new TextArea();
		f.add(ta1);
		f.setMenuBar(mb);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o=e.getSource();
		if(o==open)
		{
			InputS();
		}
		else if(o==save)
		{
			OutputS();
		}
		else if(o==cut)
		{
			Cut();
		}
		else if(o==copy)
		{
			Copy();
		}
		else if(o==paste)
		{
			Paste();
		}
	}
	public void itemStateChanged(ItemEvent e)
	{
	}
	public void Cut()
	{
		s11=ta1.getSelectedText();
		ta1.replaceRange("",ta1.getSelectionStart(),ta1.getSelectionEnd());
	}
	public void Copy()
	{
		s11=ta1.getSelectedText();
	}
	public void Paste()
	{
		System.out.println(ta1.getSelectionStart());
		ta1.insert(s11,ta1.getSelectionStart());
	}
	public void InputS()
	{
		try{
		fis=new FileInputStream("F:/Deepanshu.txt");
		byte k[]=new byte[fis.available()];
		fis.read(k);
		char l;
		s1=new String(k);
		ta1.setText(s1);
		fis.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void OutputS()
	{
		try{
		f1=new File("F:/Deepanshu.txt");
		boolean b=f1.exists();
		s=ta1.getText();
		d=s.getBytes();
		if(b==false)
		{
			f1.createNewFile();
			fos=new FileOutputStream(f1);
		}
		for(int h:d)
				fos.write(h);
		fos.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String ar[])
	{
		MenuDemo d=new MenuDemo();
	}
}	