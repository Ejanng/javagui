import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {

    public Frame(String title, JPanel panel) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().add(panel);
        
        pack();
        setVisible(true);
        // setLocationRelativeTo(null);
    }
}
