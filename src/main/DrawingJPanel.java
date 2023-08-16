package main;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingJPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        this.setBackground(Color.WHITE);

        // bathroom
        g.setColor(Color.MAGENTA);
        g.fillRect(100, 100, 150, 100);
        g.setColor(Color.BLACK);
        g.drawString("Kamar Mandi", 125, 150);

        // bedroom 1
        g.setColor(Color.GREEN);
        g.fillRect(100, 200, 150, 200);
        g.setColor(Color.BLACK);
        g.drawString("Kamar Tidur 1", 125, 250);

        // living room
        g.setColor(Color.YELLOW);
        g.fillRect(250, 100, 150, 300);
        g.setColor(Color.BLACK);
        g.drawString("Ruang Tamu", 275, 200);

        // bedroom 2
        g.setColor(Color.GREEN);
        g.fillRect(400, 100, 150, 100);
        g.setColor(Color.BLACK);
        g.drawString("Kamar Tidur 2", 425, 150);

        // kitchen
        g.setColor(Color.PINK);
        g.fillRect(400, 200, 150, 200);
        g.setColor(Color.BLACK);
        g.drawString("Dapur", 425, 250);

        // terrace
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(100, 400, 450, 100);
        g.setColor(Color.BLACK);
        g.drawString("Teras", 300, 450);

        // triangle house
        int[] xPoints = { 650, 800, 950 };
        int[] yPoints = { 300, 200, 300 };
        int nPoints = 3;

        g.setColor(Color.GRAY);
        g.fillPolygon(xPoints, yPoints, nPoints);

        // house
        g.setColor(Color.GREEN);
        g.fillRect(650, 300, 100, 100);
        g.setColor(Color.YELLOW);
        g.fillRect(750, 300, 100, 100);
        g.setColor(Color.PINK);
        g.fillRect(850, 300, 100, 100);
    }
}
