import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Snake extends JPanel {
    private class Tile {
        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    int boardWidth;
    int boardHeight;
    int tileSize = 20;

    Tile snakeHead;

    Snake(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.DARK_GRAY);

        snakeHead = new Tile(5, 5);


    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        draw(graphics);
    }

    public void draw(Graphics graphics) {
        for (int i = 0; i <boardWidth/tileSize; i++) {
            graphics.drawLine(i*tileSize, 0, i*tileSize, boardHeight);
            graphics.drawLine(0, i*tileSize, boardWidth, i*tileSize);
        }

        graphics.setColor(Color.yellow);
        graphics.fillRect(snakeHead.x * tileSize, snakeHead.y * tileSize,  tileSize, tileSize);


    }

}
