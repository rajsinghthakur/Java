import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

 class SnakeGame extends JFrame {
    private static final int CELL_SIZE = 20;
    private static final int GRID_SIZE = 20;

    private ArrayList<Point> snake;
    private Point food;
    private int direction;

    public SnakeGame() {
        snake = new ArrayList<>();
        snake.add(new Point(5, 5));
        food = generateFood();
        direction = KeyEvent.VK_RIGHT; // Initial direction: right

        Timer timer = new Timer(200, new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                move();
                checkCollision();
                repaint();
            }
        });
        timer.start();

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if ((key == KeyEvent.VK_LEFT) && (direction != KeyEvent.VK_RIGHT)) {
                    direction = KeyEvent.VK_LEFT;
                } else if ((key == KeyEvent.VK_RIGHT) && (direction != KeyEvent.VK_LEFT)) {
                    direction = KeyEvent.VK_RIGHT;
                } else if ((key == KeyEvent.VK_UP) && (direction != KeyEvent.VK_DOWN)) {
                    direction = KeyEvent.VK_UP;
                } else if ((key == KeyEvent.VK_DOWN) && (direction != KeyEvent.VK_UP)) {
                    direction = KeyEvent.VK_DOWN;
                }
            }
        });

        setPreferredSize(new Dimension(CELL_SIZE * GRID_SIZE, CELL_SIZE * GRID_SIZE));
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setFocusable(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Point p : snake) {
            g.setColor(Color.GREEN);
            g.fillRect(p.x * CELL_SIZE, p.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
        }

        g.setColor(Color.RED);
        g.fillRect(food.x * CELL_SIZE, food.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
    }

    private Point generateFood() {
        Random random = new Random();
        int x = random.nextInt(GRID_SIZE);
        int y = random.nextInt(GRID_SIZE);
        return new Point(x, y);
    }

    private void move() {
        Point head = snake.get(0);
        Point newHead = null;

        if (direction == KeyEvent.VK_LEFT) {
            newHead = new Point(head.x - 1, head.y);
        } else if (direction == KeyEvent.VK_RIGHT) {
            newHead = new Point(head.x + 1, head.y);
        } else if (direction == KeyEvent.VK_UP) {
            newHead = new Point(head.x, head.y - 1);
        } else if (direction == KeyEvent.VK_DOWN) {
            newHead = new Point(head.x, head.y + 1);
        }

        snake.add(0, newHead);

        if (newHead.equals(food)) {
            food = generateFood();
        } else {
            snake.remove(snake.size() - 1);
        }
    }

    private void checkCollision() {
        Point head = snake.get(0);

        // Check if the snake collides with itself or hits the wall
        if (head.x < 0 || head.x >= GRID_SIZE || head.y < 0 || head.y >= GRID_SIZE) {
            gameOver();
        }

        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                gameOver();
            }
        }
    }

    private void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over");
        snake.clear();
        snake.add(new Point(5, 5));
        direction = KeyEvent.VK_RIGHT;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SnakeGame();
            }
        });
    }
}
