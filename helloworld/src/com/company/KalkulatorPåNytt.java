package com.company;


import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class KalkulatorPåNytt {
    public static void main(String[] args) {

        new KalkulatorPåNytt();

        Scanner input = new Scanner(System.in);

        System.out.println("Tall 1: ");
        String tall1 = input.nextLine();

        System.out.println("Operator: ");
        String operator = input.nextLine();

        System.out.println("Tall 2: ");
        String tall2 = input.nextLine();



        if (operator.equals("+")) {
            System.out.println(Double.parseDouble(tall1)+Double.parseDouble(tall2));
        }
        else if (operator.equals("-")) {
            System.out.println(Double.parseDouble(tall1)-Double.parseDouble(tall2));
        }
        else if (operator.equals("*")) {
            System.out.println(Double.parseDouble(tall1)*Double.parseDouble(tall2));
        }
        else if (operator.equals("/")) {
            System.out.println(Double.parseDouble(tall1)/Double.parseDouble(tall2));
        }
        else {
            System.out.println("ERROR! FEIL OPERATOR! VELG +, -, *, /");
        }
    }

    public KalkulatorPåNytt() {

        JButton plus  = new JButton("+");
        JButton minus = new JButton("-");
        JButton multi = new JButton("*");
        JButton div   = new JButton("/");



        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.add(plus);
        panel.add(minus);
        panel.add(multi);
        panel.add(div);

        JFrame frame = new JFrame("Kalkulator");
        frame.setSize(200,300);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
