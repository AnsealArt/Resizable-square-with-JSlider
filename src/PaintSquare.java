import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class PaintSquare extends JPanel {
    int val = 50;

    public void setVal(int v) {
        this.val = v;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int side = (int)((getWidth() > getHeight() ? getHeight() : getWidth()) * val / 100.0);
        int x = (getWidth() - side) / 2;
        int y = (getHeight() - side) / 2;
        g.setColor(Color.BLUE);
        g.fillRect(x, y, side, side);
    }
}
