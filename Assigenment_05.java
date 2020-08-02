import java.awt.*;
import java.awt.event.*;
class Assigenment_05 extends MouseAdapter implements ActionListener,MouseMotionListener
{
    private int a,b;
    private Frame f;
    private Graphics g;
    private Button bred,bgreen,bblue,byellow,bblack,bcyan,bpink,bmagenta,bgray,blight_gray,bdark_gray,borange;
    private Panel p;
    private Color c;
    
    Assigenment_05()
    {
        f=new Frame();
        f.setBounds(400,400,450,400);
        f.setLayout(new BorderLayout());
     
        c=Color.BLACK;
        
        f.addMouseMotionListener(this);
        f.addMouseListener(this);
        
        p=new Panel();
        
        bred=new Button();
        bgreen=new Button();
        bblue=new Button();
        byellow=new Button();
        bblack=new Button();
        bcyan=new Button();
        bpink=new Button();
        bmagenta=new Button();
        bgray=new Button();
        blight_gray=new Button();
        bdark_gray=new Button();
        borange=new Button();
        
        
        bred.addActionListener(this);
        bgreen.addActionListener(this);;
        bblue.addActionListener(this);
        byellow.addActionListener(this);
        bblack.addActionListener(this);
        bcyan.addActionListener(this);
        bpink.addActionListener(this);
        bmagenta.addActionListener(this);
        bgray.addActionListener(this);
        blight_gray.addActionListener(this);
        bdark_gray.addActionListener(this);
        borange.addActionListener(this);

        bred.setBackground(Color.RED);
        bgreen.setBackground(Color.GREEN);
        bblue.setBackground(Color.BLUE);
        byellow.setBackground(Color.YELLOW);
        bblack.setBackground(Color.BLACK);
        bcyan.setBackground(Color.CYAN);
        bpink.setBackground(Color.PINK);
        bmagenta.setBackground(Color.MAGENTA);
        bgray.setBackground(Color.GRAY);
        blight_gray.setBackground(Color.LIGHT_GRAY);
        bdark_gray.setBackground(Color.DARK_GRAY);
        borange.setBackground(Color.ORANGE);

        p.setLayout(new GridLayout(1,11));
        p.add(bred);
        p.add(bgreen);
        p.add(bblue);
        p.add(byellow);
        p.add(bblack);
        p.add(bcyan);
        p.add(bmagenta);
        p.add(bgray);
        p.add(blight_gray);
        p.add(bdark_gray);
        p.add(borange);
       
       
        f.add(p);
        f.add(p,BorderLayout.NORTH);
        
        WindowCloser wc;
        wc=new WindowCloser();
        f.addWindowListener(wc);
        
        //f.setResizable(false);
        f.setVisible(true);
    
    }
    public void actionPerformed(ActionEvent e)
    {
        Object o;  
        o=e.getSource();
        
        if(o==bred)
            c=Color.RED;
        else if(o==bgreen)
            c=Color.GREEN;
        else if(o==bblue)
            c=Color.BLUE;
        else if(o==byellow)
            c=Color.YELLOW;
        else if(o==bblack)
            c=Color.BLACK;
        else if(o==bcyan)
            c=Color.CYAN;
        else if(o==bpink)
            c=Color.PINK;
        else if(o==bmagenta)
            c=Color.MAGENTA;
        else if(o==bgray)
            c=Color.GRAY;
        else if(o==blight_gray)
            c=Color.LIGHT_GRAY;
        else if(o==bdark_gray)
            c=Color.DARK_GRAY;
        else if(o==borange)
            c=Color.ORANGE;
    }
    public void mousePressed(MouseEvent e)
    {
        a=e.getX();
        b=e.getY();
    }
    public void mouseMoved(MouseEvent e)
    {  
    }
    public void mouseDragged(MouseEvent e)
    {
    }
    public void mouseReleased(MouseEvent e)
    {
        int x,y;
     
        g=f.getGraphics();    
        x=e.getX();
        y=e.getY();
        
        g.setColor(c);             
        g.drawLine(x,y,a,b);
    
    }
    public static void main(String arg[])
    {
        Assigenment_05 a= new Assigenment_05();
    }
    
}