package pt.ipleiria.estg.dei.ei.esoft;

import javax.swing.*;
import java.awt.*;

public class HelloWorld extends  JFrame {
    private JPanel painelPrincipal;
    private JLabel helloWorld;

    public HelloWorld() {
        setMinimumSize(new Dimension(300, 200));
        setContentPane(painelPrincipal);
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
