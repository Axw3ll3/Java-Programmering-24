package codealongs.HelloWorld.Personlig;

import javax.swing.*;


public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
        frame.setSize(350, 250);
        JLabel label = new JLabel ("Hello, Mjukvarutestare!", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}