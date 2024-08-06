package parte_1_act_3;


public class Ejercicio23 {
    private double a;
    private double b;
    private double c;

    // Constructor
    public Ejercicio23(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

   
    public String calcularSoluciones() {
        double rootTerm = Math.pow(b, 2) - (4 * a * c);
        if (rootTerm < 0) {
            return "La ecuación no tiene soluciones reales";
        } else {
            double sln1 = (-b + Math.sqrt(rootTerm)) / (2 * a);
            double sln2 = (-b - Math.sqrt(rootTerm)) / (2 * a);
            if (sln1 == 0 && sln2 == 0) {
                return "La solución de la ecuación es: 0";
            } else {
                return "Las soluciones a la ecuación son:\n" + sln1 + "\n" + sln2;
            }
        }
    }
}
