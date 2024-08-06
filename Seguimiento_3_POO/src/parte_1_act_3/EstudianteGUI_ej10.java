package parte_1_act_3;
//ejercicio 10
import parte_1_act_3.Estudiante_ej10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstudianteGUI_ej10 extends JFrame {

    private JTextField niField;
    private JTextField nomField;
    private JTextField patField;
    private JTextField estField;
    private JButton calcularButton;
    private JTextArea resultArea;
    private JScrollPane scrollPane;

    public EstudianteGUI_ej10() {
        setTitle("Calculadora de Pago de Estudiante");
        setSize(500, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));


        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2, 10, 10)); 


        JLabel niLabel = new JLabel("Número de inscripción:");
        niField = new JTextField();

        JLabel nomLabel = new JLabel("Nombre del estudiante:");
        nomField = new JTextField();

        JLabel patLabel = new JLabel("Patrimonio:");
        patField = new JTextField();

        JLabel estLabel = new JLabel("Estrato:");
        estField = new JTextField();

        calcularButton = new JButton("Calcular");

      
        inputPanel.add(niLabel);
        inputPanel.add(niField);
        inputPanel.add(nomLabel);
        inputPanel.add(nomField);
        inputPanel.add(patLabel);
        inputPanel.add(patField);
        inputPanel.add(estLabel);
        inputPanel.add(estField);
        inputPanel.add(new JLabel());
        inputPanel.add(calcularButton);

       
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true); 

    
        scrollPane = new JScrollPane(resultArea);
        scrollPane.setPreferredSize(new Dimension(480, 150)); 

      
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER); 

        
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPago();
            }
        });
    }

    private void calcularPago() {
        try {
            String ni = niField.getText();
            String nom = nomField.getText();
            double pat = Double.parseDouble(patField.getText());
            int est = Integer.parseInt(estField.getText());

            Estudiante_ej10 estudiante = new Estudiante_ej10(ni, nom, pat, est);
            resultArea.setText(estudiante.getInfo());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EstudianteGUI_ej10 gui = new EstudianteGUI_ej10();
            gui.setVisible(true);
        });
    }
}
