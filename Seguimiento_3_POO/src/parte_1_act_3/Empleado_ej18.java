package parte_1_act_3;

//ejercicio 18
public class Empleado_ej18 {
    private int codigoEmpleado;
    private String nombres;
    private double horasTrabajadas;
    private double valorHora;
    private double retencionFuente;

   
    public Empleado_ej18(int codigoEmpleado, String nombres, double horasTrabajadas, double valorHora, double retencionFuente) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.retencionFuente = retencionFuente;
    }

 
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getRetencionFuente() {
        return retencionFuente;
    }

    public void setRetencionFuente(double retencionFuente) {
        this.retencionFuente = retencionFuente;
    }

    
    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        return salarioBruto - (salarioBruto * (retencionFuente / 100));
    }

   
    public String getInformacion() {
        return "Código del empleado: " + codigoEmpleado + "\n" +
               "Nombres: " + nombres + "\n" +
               "Salario Bruto: $" + String.format("%.2f", calcularSalarioBruto()) + "\n" +
               "Salario Neto: $" + String.format("%.2f", calcularSalarioNeto());
    }
}

