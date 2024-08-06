package parte_1_act_3;

public class TrianguloEquilatero_ej19 {
    private double lado;

  
    public TrianguloEquilatero_ej19(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado del triángulo debe ser un número positivo.");
        }
        this.lado = lado;
    }

  
    public double calcularPerimetro() {
        return lado * 3;
    }

    public double calcularAltura() {
        return (lado * Math.sqrt(3)) / 2;
    }

    public double calcularArea() {
        double altura = calcularAltura();
        return (lado * altura) / 2;
    }

   
    public String getInformacion() {
        return String.format("El perímetro es de %.2f metros\n", calcularPerimetro()) +
               String.format("La altura es de %.2f metros\n", calcularAltura()) +
               String.format("El área es de %.2f metros cuadrados", calcularArea());
    }
}
