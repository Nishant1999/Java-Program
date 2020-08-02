import java.awt.*;

class Drawing

{
	private Frame f;
	
	Drawing()
	
	{
	
		f=new Frame("Drawing");
	
		f.setBounds(50,50,400,400);
	
	
		Graphics g=f.getGraphics();
	
		System.out.println(g);
		
		g.fillRect(20,20,100,100);
		
	
		f.setVisible(true);
	
	}
	
	public static void main(String ar[])
	
	{
		
		Drawing d=new Drawing();
	
	}

}