import javax.swing.*;
import java.awt.*;

public class HoleObstacle extends Entity {

    public HoleObstacle(int x, int y) {
        super(x, y);
    }

    public void update() {

    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(getHoleObstacleImg(), x, y, null);
    }

    public Image getHoleObstacleImg() {

        ImageIcon ic = new ImageIcon("media/holeobstacle.png");
        return ic.getImage();
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, getHoleObstacleImg().getWidth(null), getHoleObstacleImg().getHeight(null));
    }

}