package parte_2_act_3;


public class Rectangulo {
	double base,altura;  
 
Rectangulo(double base,double altura) {
	this.base = base;
	this.altura = altura;
}
 
double calcularArea() {
	return base * altura;
}
  
double calcularPerímetro() {
	return (2 * base) + (2 * altura);
}
}