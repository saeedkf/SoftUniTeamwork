import javax.swing.*;
import java.awt.*;

public class HoleObstacle{

	int x, y;
	public HoleObstacle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void update() {

	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getHoleObstacleImg(), x, y, null);
		//g2d.draw(getBounds());
	}

	public Image getHoleObstacleImg() {

		ImageIcon ic = new ImageIcon("media/holeobstacle.png");
		return ic.getImage();
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, getHoleObstacleImg().SCALE_DEFAULT,getHoleObstacleImg().SCALE_DEFAULT);
	}

}
