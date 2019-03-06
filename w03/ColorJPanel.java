package assignment;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class ColorJPanel extends JPanel{

	public void paintComponent( Graphics g )
	{
		super.paintComponent(g);
		
		this.setBackground( Color.WHITE);

		g.setColor( new Color(255,0,0) );
		g.drawRect(250, 250, 250, 250);
		
		g.drawLine(250, 375, 500, 375);
		
		g.drawLine(375, 250, 375, 500);
		g.drawArc(250,125,250,250,180,180);
		g.drawArc(250,375,250,250,0,180);
		g.drawArc(375,250,250,250,90,180);
		g.drawArc(125,250,250,250,270,180);
		
		g.drawArc(125,125,250,250,0,270);
		g.drawArc(375,375,250,250,180,270);
		g.drawArc(375,125,250,250,270,270);
		g.drawArc(125,375,250,250,90,270);
		
		g.drawOval(311, 312, 125, 125);
		
	}
}
