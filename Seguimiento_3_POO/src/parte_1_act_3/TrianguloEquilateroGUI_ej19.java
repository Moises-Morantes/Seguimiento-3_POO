package parte_1_act_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrianguloEquilateroGUI_ej19 extends JFrame {

    private JTextField ladoField;
    private JTextArea resultadoArea;

    public TrianguloEquilateroGUI_ej19() {
        setTitle("Calculadora de Triángulo Equilátero");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel ladoLabel = new JLabel("Valor del lado (metros):");
        ladoLabel.setBounds(10, 10, 150, 25);
        add(ladoLabel);

        ladoField = new JTextField();
        ladoField.setBounds(170, 10, 200, 25);
        add(ladoField);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 40, 150, 25);
        add(calcularButton);

        resultadoArea = new JTextArea();
        resultadoArea.setBounds(10, 80, 360, 160);
        resultadoArea.setEditable(false);
        add(resultadoArea);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularTriangulo();
            }
        });
    }

    private void calcularTriangulo() {
        try {
            double lado = Double.parseDouble(ladoField.getText());

            TrianguloEquilatero_ej19 triangulo = new TrianguloEquilatero_ej19(lado);
            resultadoArea.setText(triangulo.getInformacion());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TrianguloEquilateroGUI_ej19 gui = new TrianguloEquilateroGUI_ej19();
            gui.setVisible(true);
        });
    }
}
