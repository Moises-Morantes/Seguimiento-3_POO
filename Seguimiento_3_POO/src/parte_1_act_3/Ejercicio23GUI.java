package parte_1_act_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio23GUI extends JFrame {

    private JTextField aField;
    private JTextField bField;
    private JTextField cField;
    private JTextArea resultadoArea;

    public Ejercicio23GUI() {
        setTitle("Calculadora de Ecuación Cuadrática");
        setSize(400, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel aLabel = new JLabel("Ingrese el valor que acompaña al término cuadrático (A):");
        aLabel.setBounds(10, 10, 360, 25);
        add(aLabel);

        aField = new JTextField();
        aField.setBounds(10, 40, 200, 25);
        add(aField);

        JLabel bLabel = new JLabel("Ingrese el valor que acompaña al término lineal (B):");
        bLabel.setBounds(10, 70, 360, 25);
        add(bLabel);

        bField = new JTextField();
        bField.setBounds(10, 100, 200, 25);
        add(bField);

        JLabel cLabel = new JLabel("Ingrese el valor del término independiente (C):");
        cLabel.setBounds(10, 130, 360, 25);
        add(cLabel);

        cField = new JTextField();
        cField.setBounds(10, 160, 200, 25);
        add(cField);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 190, 150, 25);
        add(calcularButton);

     
        resultadoArea = new JTextArea();
        resultadoArea.setBounds(10, 220, 360, 77); 
        resultadoArea.setEditable(false);
        add(resultadoArea);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularEcuacion();
            }
        });
    }

    private void calcularEcuacion() {
        try {
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            double c = Double.parseDouble(cField.getText());

            Ejercicio23 ecuacion = new Ejercicio23(a, b, c);
            resultadoArea.setText(ecuacion.calcularSoluciones());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio23GUI gui = new Ejercicio23GUI();
            gui.setVisible(true);
        });
    }
}

