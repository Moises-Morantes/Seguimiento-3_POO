package parte_2_act_3;

public class Circulo {

	double radio; 
	 
	Circulo(double radio) {
		this.radio = radio;
	}
	 
	double calcularArea() {
		return Math.PI*Math.pow(radio,2);
	}
	 
	double calcularPerímetro() {
		return 2*Math.PI*radio;
	}
	
	

}
