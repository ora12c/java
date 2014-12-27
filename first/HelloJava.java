import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava
{
  public static void main( String[] args ) {
    JFrame frame = new JFrame( "HelloJava" );
    frame.add( new HelloComponent("Hello Java!") );
	frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setSize( 300, 300 );
    frame.setVisible( true );
  }
}

class HelloComponent extends JComponent 
	implements MouseMotionListener 
{
  String theMessage;
  int messageX = 125, messageY = 95; // Coordinates of the message

  public HelloComponent( String message ) {
    theMessage = message;
    addMouseMotionListener(this);
  }

  public void paintComponent( Graphics g ) {
    g.drawString(theMessage, messageX, messageY);
  }

  public void mouseDragged(MouseEvent e) {
    // Save the mouse coordinates and paint the message.
    messageX = e.getX();
    messageY = e.getY();
    repaint();
  }

  public void mouseMoved(MouseEvent e) { }
}
