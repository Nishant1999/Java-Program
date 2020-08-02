import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
class Calcu implements ActionListener
{
    private String operand;
    private long operator1,operator2;
    private boolean getOperator1=false;
    private Frame f;
    private Panel p;
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bc,bequl,badd,bsub,bdiv,bmul;
    private TextField tf;
    Calcu()
    {
        //Frame
        f=new Frame("Calculator");
        f.setSize(300,400);
        f.setLocation(1200,300);
        f.setResizable(false);
        f.setLayout(new BorderLayout());

        //textField
        tf=new TextField("");
        tf.setEditable(false);
        f.add(tf,"North");
    
    //Panel for buttons
        p=new Panel();
        p.setLayout(new GridLayout(4, 5));
        f.add(p,BorderLayout.CENTER);
    //Button        
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b0=new Button("0");
        bc=new Button("C");
        bequl=new Button("=");
        badd=new Button("+");
        bsub=new Button("-");
        bdiv=new Button("/");
        bmul=new Button("*");

        p.add(bmul);        
        p.add(bdiv);        
        p.add(bsub);        
        p.add(badd);

        p.add(b7);        
        p.add(b8);        
        p.add(b9);        
        p.add(bequl);        
        
        p.add(b4);        
        p.add(b5);        
        p.add(b6);        
        p.add(bc);

        p.add(b1);        
        p.add(b2);        
        p.add(b3);        
        p.add(b0);        

  
        b0.addActionListener(this); 
        b1.addActionListener(this); 
        b2.addActionListener(this); 
        b3.addActionListener(this); 
        b4.addActionListener(this); 
        b5.addActionListener(this); 
        b6.addActionListener(this); 
        b7.addActionListener(this); 
        b8.addActionListener(this); 
        b9.addActionListener(this); 
        bsub.addActionListener(this); 
        badd.addActionListener(this); 
        bdiv.addActionListener(this); 
        bmul.addActionListener(this); 
        bequl.addActionListener(this); 
        bc.addActionListener(this);       
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Object o;
        o=e.getSource();
        
        if(getOperator1==false  && (o==b0 || o==b1 || o==b2 || o==b3 || o==b4 || o==b5 || o==b6 || o==b7 || o==b8 || o==b9))
        {
            tf.setText("");
            try
            {
                operator1=getInput(o);
                tf.setText(String.valueOf(operator1));
            }
            catch(Exception NumberFormatException)
            {
                tf.setText("Out of range");
            }
        }
        else if(getOperator1 == false  &&  (o==badd || o==bsub || o==bdiv || o==bmul))  
        {
            tf.setText("");
            operand=getOperand(o);
            getOperator1=true;
        }
        
        else if(getOperator1==true && (o==b0 || o==b1 || o==b2 || o==b3 || o==b4 || o==b5 || o==b6 || o==b7 || o==b8 || o==b9))
        {
            tf.setText("");
            try
            {
                operator2=getInput(o);
            }
            catch(Exception NumberFormatException)
            {
                tf.setText("Out of range");
            }
        }
        
        else if(o==bequl)
        {
            tf.setText("");
            if(operand.equals("+"))
            {
                operator1+=operator2;
            }
            else if(operand.equals("*"))
            {
                try
                {
                    operator1 = operator1*operator2;
                }
                catch(ArithmeticException E)
                {
                    tf.setText("MATH ERROR");
                }
            }
            else if(operand.equals("/"))
            {
                try
                {
                    operator1=operator1/operator2;
                    tf.setText(String.valueOf(operator1));
                }
                catch(ArithmeticException E)
                {
                    tf.setText("MATH ERROR");
                }
            }
            else if(operand.equals("-"))
            {
                tf.setText("");
                operator1-=operator2;
                tf.setText(String.valueOf(operator1));
            }
           
            getOperator1=false;
        }
        else if(o==bc)
        {
            tf.setText("");
            operator1=0;
            operator2=0;
            operand="";
            getOperator1=false;
        }
    }
    private String getOperand(Object o)
    {
        String t="";
        tf.setText("");
        if(o==bmul)
            t= "*";
        
            else if(o==bdiv)
            t="/";
        else if(o==badd)
            t= "+";
        else if(o==bsub)
            t= "-";
        return t;
    }
    private long getInput(Object o)
    {
        String s1="";
        if(o==b0)
        {       
            s1=tf.getText();
            s1+="0";
        }
        else if(o==b1)
        {
            s1=tf.getText();   
            s1+="1";
        }
        else if(o==b2)
        {
            s1=tf.getText();   
            s1+="2";
        }
        else if(o==b3)
        {
            s1=tf.getText();   
            s1+="3";
        }
        else if(o==b4)
        {
            s1=tf.getText();   
            s1+="4";
        }
        else if(o==b5)
        {
            s1=tf.getText();   
            s1+="5";
        }
        else if(o==b6)
        {
            s1=tf.getText();   
            s1+="6";
        }       
        else if(o==b7)
        {
            s1=tf.getText();   
            s1+="7";
        
        }
        else if(o==b8)
        {
            s1=tf.getText();   
            s1+="8";
        
        }        
        else if(o==b9)
        {
            s1=tf.getText();   
            s1+="9";
        }
        tf.setText(s1);
        long temp = Long.parseLong(s1);
        return temp;
    }
    public static void main(String arg[])
    {
        Calcu cu=new Calcu();
    }
}