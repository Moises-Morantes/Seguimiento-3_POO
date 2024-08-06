package parte_1_act_3;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio22GUI extends JFrame {

    private JTextField nombreField;
    private JTextField salarioHoraField;
    private JTextField horasTrabajadasField;
    private JTextArea resultadoArea;

    public Ejercicio22GUI() {
        setTitle("Calculadora de Salario");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nombreLabel = new JLabel("Nombre del empleado:");
        nombreLabel.setBounds(10, 10, 200, 25);
        add(nombreLabel);

        nombreField = new JTextField();
        nombreField.setBounds(210, 10, 160, 25);
        add(nombreField);

        JLabel salarioHoraLabel = new JLabel("Salario básico por hora:");
        salarioHoraLabel.setBounds(10, 40, 200, 25);
        add(salarioHoraLabel);

        salarioHoraField = new JTextField();
        salarioHoraField.setBounds(210, 40, 160, 25);
        add(salarioHoraField);

        JLabel horasTrabajadasLabel = new JLabel("Horas trabajadas en el mes:");
        horasTrabajadasLabel.setBounds(10, 70, 200, 25);
        add(horasTrabajadasLabel);

        horasTrabajadasField = new JTextField();
        horasTrabajadasField.setBounds(210, 70, 160, 25);
        add(horasTrabajadasField);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 100, 150, 25);
        add(calcularButton);

        resultadoArea = new JTextArea();
        resultadoArea.setBounds(10, 130, 360, 120);
        resultadoArea.setEditable(false);
        add(resultadoArea);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularSalario();
            }
        });
    }

    private void calcularSalario() {
        try {
            String nombre = nombreField.getText();
            double salarioHora = Double.parseDouble(salarioHoraField.getText());
            double horasTrabajadas = Double.parseDouble(horasTrabajadasField.getText());

            Ejercicio22 empleado = new Ejercicio22(nombre, salarioHora, horasTrabajadas);
            resultadoArea.setText(empleado.obtenerInformacion());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio22GUI gui = new Ejercicio22GUI();
            gui.setVisible(true);
        });
    }
}
