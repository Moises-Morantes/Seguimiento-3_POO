package parte_1_act_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer7GUI extends JFrame {

    private JTextField valorAField;
    private JTextField valorBField;
    private JTextArea resultadoArea;

    public Ejer7GUI() {
        setTitle("Comparador de Valores");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel valorALabel = new JLabel("Ingrese el valor de A:");
        valorALabel.setBounds(10, 10, 150, 25);
        add(valorALabel);

        valorAField = new JTextField();
        valorAField.setBounds(170, 10, 200, 25);
        add(valorAField);

        JLabel valorBLabel = new JLabel("Ingrese el valor de B:");
        valorBLabel.setBounds(10, 40, 150, 25);
        add(valorBLabel);

        valorBField = new JTextField();
        valorBField.setBounds(170, 40, 200, 25);
        add(valorBField);

        JButton compararButton = new JButton("Comparar");
        compararButton.setBounds(10, 70, 150, 25);
        add(compararButton);

        resultadoArea = new JTextArea();
        resultadoArea.setBounds(10, 110, 360, 140);
        resultadoArea.setEditable(false);
        add(resultadoArea);

        compararButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compararValores();
            }
        });
    }

    private void compararValores() {
        try {
            double valorA = Double.parseDouble(valorAField.getText());
            double valorB = Double.parseDouble(valorBField.getText());

            Ejer7 comparador = new Ejer7(valorA, valorB);
            resultadoArea.setText(comparador.compararValores());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejer7GUI gui = new Ejer7GUI();
            gui.setVisible(true);
        });
    }
}
