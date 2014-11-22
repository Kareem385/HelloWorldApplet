import java.applet.*;
import java.awt.*;

public class HelloWorld extends Applet
{
  public void paint (Graphics g) //No return method since void is used
  {
	  int x;
	  int y;
	  //Drawing random numbers
	  x = (int) (Math.random() *100);
	  y = (int) (Math.random() * 100);
	  
	 g.setColor(Color.red); //Setting color
    g.drawString("Hello World!", x, y); //String, x and y coordinates 
	 g.drawRect(10, 8, 50, 50); 
	 g.fillRect(10, 8, 50, 50);
   
	
/*drawOval (int x, int y, int width, int height)
drawLine (int x1, int x2, int y1, int y2)
drawRoundRect (int x, int y, int width, int height, int arcWidth, int arcHeight)
drawArc (int x, int y , int width, int height, int startAngle, int arcAngle)
draw3DRect (int x, int y, int width, int height, boolean raised) */
    
  }
 
}
