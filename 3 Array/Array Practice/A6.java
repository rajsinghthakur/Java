import javax.swing.JButton;
import javax.swing.JFrame;

class javaswing extends JFrame {
    public javaswing() {
        setTitle("this is normal frame");

        // JButton jb = new JButton("click me");
        // jb.setBounds(150, 150, 100, 30);
        // add(jb);
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
    }
}

public class A6 {
    public static void main(String[] args) {
        javaswing obj = new javaswing();
    }
}
