package parte_1_act_3;

public class Ejer7 {
    private double valorA;
    private double valorB;

   
    public Ejer7(double valorA, double valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

   
    public String compararValores() {
        if (valorA > valorB) {
            return "A es mayor que B";
        } else if (valorA == valorB) {
            return "A es igual a B";
        } else {
            return "A es menor que B";
        }
    }
}

