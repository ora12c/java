import javax.swing.*;
public class HelloJava 
{
  public static void main( String[] args ) {
    JFrame frame = new JFrame( "HelloJava" );
	JLabel label = new JLabel("Hello, Java!", JLabel.CENTER );
    frame.getContentPane().add( label );
    frame.setSize( 300, 300 );
    frame.setVisible( true );
  }
}

