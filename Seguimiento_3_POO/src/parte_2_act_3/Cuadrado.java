package parte_2_act_3;


public class Cuadrado {
	double lado;  
 
public Cuadrado(double lado) {
	this.lado = lado;
}
 
double calcularArea() {
	return lado*lado;
}
 
double calcularPerímetro() {
	return (4*lado);
}
}