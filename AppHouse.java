import java.awt.*;
import java.applet.*;
public class AppHouse extends Applet
{
  public void paint(Graphics g)
  {
    g.drawLine(10,100,50,50);
	g.drawLine(50,50,100,100);
	g.drawLine(100,100,100,200);
	g.drawLine(100,200,10,200);
	g.drawLine(10,200,10,100);
   g.drawLine(50,50,200,50);
   g.setColor(Color.blue);
   g.drawLine(200,50,250,100);
   g.drawLine(250,100,250,200);
   g.drawLine(250,200,100,200);
   g.drawLine(250,100,10,100);
   }
   
   }