import javax.swing.*;

public class SimpleGui {
    public static void main (String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}