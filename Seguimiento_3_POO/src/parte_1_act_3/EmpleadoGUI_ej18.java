package parte_1_act_3;
//ejercicio 18
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpleadoGUI_ej18 extends JFrame {

    private JTextField codigoField;
    private JTextField nombresField;
    private JTextField horasField;
    private JTextField valorHoraField;
    private JTextField retencionField;
    private JTextArea resultadoArea;

    public EmpleadoGUI_ej18() {
        setTitle("Calculadora de Salario de Empleado");
        setSize(400, 340); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel codigoLabel = new JLabel("Código del empleado:");
        codigoLabel.setBounds(10, 10, 150, 25);
        add(codigoLabel);

        codigoField = new JTextField();
        codigoField.setBounds(170, 10, 200, 25);
        add(codigoField);

        JLabel nombresLabel = new JLabel("Nombres:");
        nombresLabel.setBounds(10, 40, 150, 25);
        add(nombresLabel);

        nombresField = new JTextField();
        nombresField.setBounds(170, 40, 200, 25);
        add(nombresField);

        JLabel horasLabel = new JLabel("Horas trabajadas:");
        horasLabel.setBounds(10, 70, 150, 25);
        add(horasLabel);

        horasField = new JTextField();
        horasField.setBounds(170, 70, 200, 25);
        add(horasField);

        JLabel valorHoraLabel = new JLabel("Valor hora trabajada:");
        valorHoraLabel.setBounds(10, 100, 150, 25);
        add(valorHoraLabel);

        valorHoraField = new JTextField();
        valorHoraField.setBounds(170, 100, 200, 25);
        add(valorHoraField);

        JLabel retencionLabel = new JLabel("Retención en la fuente (%):");
        retencionLabel.setBounds(10, 130, 200, 25);
        add(retencionLabel);

        retencionField = new JTextField();
        retencionField.setBounds(220, 130, 150, 25);
        add(retencionField);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 160, 150, 25);
        add(calcularButton);

        resultadoArea = new JTextArea();
        resultadoArea.setBounds(10, 190, 360, 98);
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
            int codigoEmpleado = Integer.parseInt(codigoField.getText());
            String nombres = nombresField.getText();
            double horasTrabajadas = Double.parseDouble(horasField.getText());
            double valorHora = Double.parseDouble(valorHoraField.getText());
            double retencionFuente = Double.parseDouble(retencionField.getText());

            Empleado_ej18 empleado = new Empleado_ej18(codigoEmpleado, nombres, horasTrabajadas, valorHora, retencionFuente);
            resultadoArea.setText(empleado.getInformacion());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese datos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmpleadoGUI_ej18 gui = new EmpleadoGUI_ej18();
            gui.setVisible(true);
        });
    }
}
