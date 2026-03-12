package pt.ipleiria.estg.dei.ei.esoft;

import javax.swing.*;
import java.awt.*;

public class Experimental extends JFrame {
    private JPanel painelPrincipal;
    private JLabel experiencia;

    public Experimental() {
        setMinimumSize(new Dimension(300, 200));
        setContentPane(painelPrincipal);
        pack();
    }
    public static void main(String[] args) {
        new Experimental().setVisible(true);
    }
}


