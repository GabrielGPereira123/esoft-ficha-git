package pt.ipleiria.estg.dei.ei.esoft;

import javax.swing.*;
import java.awt.*;

public class HelloWorld extends  JFrame {
    private JPanel painelPrincipal;
    private JLabel helloWorld;
    private JLabel lblMensagem2;

    public HelloWorld() {
        setMinimumSize(new Dimension(300, 200));
        setContentPane(painelPrincipal);
        pack();
    }

    private void init() {
        lblMensagem2.setText("O Rómulo José Vieira Marques esteve aqui");
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
