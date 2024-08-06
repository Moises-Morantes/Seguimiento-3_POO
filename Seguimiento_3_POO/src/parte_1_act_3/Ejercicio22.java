package parte_1_act_3;


public class Ejercicio22 {
    private String nombre;
    private double salarioHora;
    private double horasTrabajadas;

    // Constructor
    public Ejercicio22(String nombre, double salarioHora, double horasTrabajadas) {
        this.nombre = nombre;
        this.salarioHora = salarioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

  
    public double calcularSalarioMensual() {
        return salarioHora * horasTrabajadas;
    }

  
    public String obtenerInformacion() {
        double salarioMensual = calcularSalarioMensual();
        if (salarioMensual > 450000) {
            return "Nombre del empleado: " + nombre + "\n" +
                   "Salario Mensual: $" + salarioMensual;
        } else {
            return "Nombre del empleado: " + nombre;
        }
    }
}
