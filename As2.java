import java.awt.*;
class As_3
{
    public static void main(String arg[])
    {
        Frame f=new Frame("pattern");
        f.setSize(200,300);
        f.setLocation(800,200);
        
        GridLayout g=new GridLayout(1,3);
        f.setLayout(g);
        
        Button b1=new Button("b1");
        f.add(b1);
       
        Panel p=new Panel();
        GridLayout g1=new GridLayout(2,1);
        p.setLayout(g1);
        
        Button b2=new Button("b2");
        p.add(b2);
        
        Panel p1=new Panel();
        GridLayout g2=new GridLayout(1,2);
        p1.setLayout(g2);
        
        Button b3=new Button("b3");
        p1.add(b3);
        
        Button b4=new Button("b4");
        p1.add(b4);
        
        p.add(p1);
        f.add(p);
        
        
        
        Button b5=new Button("b5");
        f.add(b5);

        f.setVisible(true);
    }
}