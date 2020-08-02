import java.awt.*;
import java.awt.event.*;
class WindowCloser implements WindowListener
{
    public void windowOpened(WindowEvent e)
    {
        System.out.println("OPENED");
    }
    public void windowClosed(WindowEvent e)
    {
        System.out.println("CLOSED");
    }
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Activated");
    }
	public void windowDeactivated(WindowEvent e)
	{
		System.out.println("Deactivated");
	}	
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Iconified");
    }
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("De-Iconified");
    }
    public void windowClosing(WindowEvent e)
    {
        Window w;
        w=e.getWindow();
        w.setVisible(false);
        w.dispose();
       // System.exit(1);
    }
}