package parte_2_act_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JSplitPane;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Color;

public class Pantalla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCirculo;
	private JTextField txtRadio;
	private JTextField txtArea;
	private JTextField txtPerimetro;
	private JTextField txtLado;
	private JLabel lblIngreseLado;
	private JButton btnBorrar2;
	private JTextField txtArea2;
	private JButton btnArea2;
	private JTextField txtPerimetro2;
	private JButton btnPerimetro2;
	private JTextField tituloCuadrado;
	private JTextField txtBase;
	private JLabel lblBase;
	private JButton btnBorrar_3;
	private JTextField txtRectangulo;
	private JTextField txtArea3;
	private JButton btnArea3;
	private JTextField txtPerimetro3;
	private JButton btnPerimetro3;
	private JTextField txtAltura;
	private JLabel lblAltura;
	private JTextField txtTrianguloRectangulo;
	private JButton btnArea4;
	private JButton btnPerimetro4;
	private JTextField txtArea4;
	private JTextField txtPerimetro4;
	private JLabel lblBase_1;
	private JTextField txtBase2;
	private JTextField txtAltura2;
	private JLabel lblAltura_1;
	private JButton btnBorrar_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 713);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		txtCirculo = new JTextField();
		txtCirculo.setBackground(new Color(0, 128, 192));
		txtCirculo.setText("CIRCULO");
		txtCirculo.setHorizontalAlignment(SwingConstants.CENTER);
		txtCirculo.setColumns(10);
		
		JLabel lblIngreRadio = new JLabel("Ingrese Radio");
		
		txtRadio = new JTextField();
		txtRadio.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setColumns(10);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setColumns(10);
		
		JButton btnArea1 = new JButton("MOST-AREA");
		btnArea1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				double area;
				double radio = Double.parseDouble(txtRadio.getText());
				Circulo figura1 = new Circulo(radio);
				area = figura1.calcularArea();
				txtArea.setText(String.valueOf(area));
				
				
			}
		});
		
		JButton btnPerimetro1 = new JButton("MOST-PERIMETRO");
		btnPerimetro1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				double perimetro;
				double radio = Double.parseDouble(txtRadio.getText());
				Circulo figura1 = new Circulo(radio);
				perimetro = figura1.calcularPerimetro();
				txtPerimetro.setText(String.valueOf(perimetro));
				
			}
		});
		
		JButton btnBorrar1 = new JButton("BORRAR");
		btnBorrar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtPerimetro.setText("");
				txtArea.setText("");
				txtRadio.setText("");
				
			}
		});
		//Cuadrado
		txtLado = new JTextField();
		txtLado.setColumns(10);
		
		lblIngreseLado = new JLabel("Ingrese Lado ");
		
		
		btnBorrar2 = new JButton("BORRAR");
		btnBorrar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPerimetro2.setText("");
				txtArea2.setText("");
				txtLado.setText("");
			}
		});
		
		txtArea2 = new JTextField();
		txtArea2.setColumns(10);
		
		btnArea2 = new JButton("MOST-AREA");
		btnArea2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double area2;
				double lado = Double.parseDouble(txtLado.getText());
				Cuadrado figura2 = new Cuadrado(lado);
				area2 = figura2.calcularArea2();
				txtArea2.setText(String.valueOf(area2));
				
			}
		});
		
		txtPerimetro2 = new JTextField();
		txtPerimetro2.setColumns(10);
		
		btnPerimetro2 = new JButton("MOST-PERIMETRO");
		btnPerimetro2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double perimetro2;
				double lado = Double.parseDouble(txtLado.getText());
				Cuadrado figura2= new Cuadrado(lado);
				perimetro2 = figura2.calcularPerimetro2();
				
				txtPerimetro2.setText(String.valueOf(perimetro2));
				
			}
		});
		
		
		// Rectangulo
		
		tituloCuadrado = new JTextField();
		tituloCuadrado.setBackground(new Color(0, 128, 192));
		tituloCuadrado.setText("CUADRADO");
		tituloCuadrado.setColumns(10);
		
		txtBase = new JTextField();
		txtBase.setColumns(10);
		
		lblBase = new JLabel("Ingrese Base");
		
		btnBorrar_3 = new JButton("BORRAR");
		btnBorrar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPerimetro3.setText("");
				txtArea3.setText("");
				txtBase.setText("");
				txtAltura.setText("");

			}
		});
		
		txtRectangulo = new JTextField();
		txtRectangulo.setBackground(new Color(0, 128, 192));
		txtRectangulo.setText("RECTANGULO");
		txtRectangulo.setHorizontalAlignment(SwingConstants.CENTER);
		txtRectangulo.setColumns(10);
		
		txtArea3 = new JTextField();
		txtArea3.setColumns(10);
		
		btnArea3 = new JButton("MOST-AREA");
		btnArea3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double area3;
				double base = Double.parseDouble(txtBase.getText());
				double altura = Double.parseDouble(txtAltura.getText());
				Rectangulo figura3= new Rectangulo(base,altura);
				area3 = figura3.calcularArea();
				
				txtArea3.setText(String.valueOf(area3));
				
			
				
				
				
			}
		});
	
		
		txtPerimetro3 = new JTextField();
		txtPerimetro3.setColumns(10);
		
		btnPerimetro3 = new JButton("MOST-PERIMETRO");
		btnPerimetro3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double perimetro3;
				double base = Double.parseDouble(txtBase.getText());
				double altura = Double.parseDouble(txtAltura.getText());
				Rectangulo figura3= new Rectangulo(base,altura);
				perimetro3 = figura3.calcularPerímetro();
				
				txtPerimetro3.setText(String.valueOf(perimetro3));
				
			}
		});
		
		//Triangulo Rectangulo
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		
		lblAltura = new JLabel("Ingrese Altura");
		
		txtTrianguloRectangulo = new JTextField();
		txtTrianguloRectangulo.setBackground(new Color(0, 128, 192));
		txtTrianguloRectangulo.setText("TRIANGULO RECTANGULO");
		txtTrianguloRectangulo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTrianguloRectangulo.setColumns(10);
		
		btnArea4 = new JButton("MOST-AREA");
		btnArea4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double area4;
				double base = Double.parseDouble(txtBase2.getText());
				double altura = Double.parseDouble(txtAltura2.getText());
				TrianguloRectangulo figura4= new TrianguloRectangulo(base,altura);
				area4 = figura4.calcularArea();
				
				txtArea4.setText(String.valueOf(area4));
				
				
				
			}
		});
		
		btnPerimetro4 = new JButton("MOST-PERIMETRO");
		btnPerimetro4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double perimetro4;
				double base = Double.parseDouble(txtBase2.getText());
				double altura = Double.parseDouble(txtAltura2.getText());
				TrianguloRectangulo figura4= new TrianguloRectangulo(base,altura);
				perimetro4 = figura4.calcularPerímetro();
				
				txtPerimetro4.setText(String.valueOf(perimetro4));
				
				
			}
		});
		
		txtArea4 = new JTextField();
		txtArea4.setColumns(10);
		
		txtPerimetro4 = new JTextField();
		txtPerimetro4.setColumns(10);
		
		lblBase_1 = new JLabel("Ingrese Base");
		
		txtBase2 = new JTextField();
		txtBase2.setColumns(10);
		
		txtAltura2 = new JTextField();
		txtAltura2.setColumns(10);
		
		lblAltura_1 = new JLabel("Ingrese Altura");
		
		btnBorrar_4 = new JButton("BORRAR");
		btnBorrar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPerimetro4.setText("");
				txtArea4.setText("");
				txtBase2.setText("");
				txtAltura2.setText("");
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtRadio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblIngreRadio)
											.addGap(81)
											.addComponent(btnBorrar1))
										.addComponent(txtCirculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(txtArea, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(10)
													.addComponent(btnArea1)))
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addComponent(txtPerimetro)
												.addComponent(btnPerimetro1))))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(tituloCuadrado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(10)
												.addComponent(lblIngreseLado, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addComponent(txtLado, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(72)
										.addComponent(btnBorrar2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(btnArea2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtArea2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(10)
												.addComponent(txtPerimetro2, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
											.addComponent(btnPerimetro2, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(65)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnArea4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addGap(18)
											.addComponent(btnPerimetro4, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(txtArea4, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(txtPerimetro4, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(txtArea3, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
												.addComponent(btnArea3, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addComponent(txtPerimetro3)
												.addComponent(btnPerimetro3, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(15)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addGap(5)
															.addComponent(txtBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_contentPane.createSequentialGroup()
															.addGap(13)
															.addComponent(lblBase, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblAltura)
														.addComponent(txtAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addGap(10)
															.addComponent(lblBase_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
															.addGap(71))
														.addComponent(txtBase2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
														.addComponent(txtAltura2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblAltura_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
													.addGap(28))))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(172)
									.addComponent(txtRectangulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(104)
									.addComponent(txtTrianguloRectangulo, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(441)
							.addComponent(btnBorrar_4, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
					.addGap(495))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(452)
					.addComponent(btnBorrar_3, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(599, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtCirculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtRectangulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblIngreRadio)
									.addComponent(btnBorrar1))
								.addGap(9)
								.addComponent(txtRadio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(37)
								.addComponent(lblBase)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblAltura)
							.addGap(14)
							.addComponent(txtAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPerimetro1)
								.addComponent(btnArea1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPerimetro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPerimetro3)
								.addComponent(btnArea3))
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtPerimetro3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtArea3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnBorrar_3)
					.addGap(94)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(tituloCuadrado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(22)
									.addComponent(lblIngreseLado)
									.addGap(14)
									.addComponent(txtLado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(38)
									.addComponent(btnBorrar2)))
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPerimetro2)
								.addComponent(btnArea2))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtArea2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPerimetro2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(txtTrianguloRectangulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblBase_1)
									.addGap(18)
									.addComponent(txtBase2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblAltura_1)
									.addGap(14)
									.addComponent(txtAltura2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnPerimetro4)
								.addComponent(btnArea4))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtArea4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPerimetro4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnBorrar_4)
					.addContainerGap(237, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
