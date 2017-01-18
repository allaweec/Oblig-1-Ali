import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class KalkulatorWindow extends JFrame {

    JFrame window = new JFrame("Kalkulator");
    JPanel panel = new JPanel();
    JButton equals = new JButton("=");
    JTextField input1 = new JTextField(10);
    JTextField input2 = new JTextField(10);
    JLabel answer = new JLabel("Answer");
    JLabel plus = new JLabel("+");

    public void KalkulatorWindow() {


        window.setSize(400, 100);
        window.add(panel);
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        input1.setSize(50, 50);
        input2.setSize(50, 50);


        panel.add(input1);
        panel.add(plus);
        panel.add(input2);
        panel.add(equals);
        panel.add(answer);


        equals.addActionListener(event -> {
            String num1 = input1.getText();
            String num2 = input2.getText();

            double dNum1 = Double.parseDouble(num1);
            double dNum2 = Double.parseDouble(num2);

            String sum = Double.toString(dNum1 + dNum2);

            answer.setText(sum);
        });
    }


}



