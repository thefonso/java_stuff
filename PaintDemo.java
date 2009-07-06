//graphics/PaintDemo.java
import java.awt.*;
import javax.swing.*;

public class PaintDemo extends JPanel{
	public void paintComponent(Graphics g){
		g.setColor(Color.orange);
		g.fillRect(20,50,100,100);
	}
}