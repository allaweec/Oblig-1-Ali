package Calculator;

import javax.swing.*;
import java.awt.*;

public class Window {

    JFrame frame;
    JPanel panel;
    JButton plus;


    public Window(int height, int width, String title) {
        frame = new JFrame(title);
        panel = new JPanel();
        plus = new JButton("+");

        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.add(plus);




    }

}
