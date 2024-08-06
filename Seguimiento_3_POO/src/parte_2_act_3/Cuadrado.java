package parte_2_act_3;


public class Cuadrado {
	double lado;  
 
public Cuadrado(double lado) {
	this.lado = lado;
}
 
double calcularArea2() {
	return lado*lado;
}
 
double calcularPerimetro2() {
	return (4*lado);
}
}