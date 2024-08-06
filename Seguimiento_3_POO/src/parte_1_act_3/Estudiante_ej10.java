package parte_1_act_3;
//ejercicio 10
public class Estudiante_ej10 {
    double PAT, PAGMAT;
    int EST;
    String NOM, NI;

   
    public Estudiante_ej10(String NI, String NOM, double PAT, int EST) {
        this.NI = NI;
        this.NOM = NOM;
        this.PAT = PAT;
        this.EST = EST;
        calcularPago();
    }

    
    private void calcularPago() {
        this.PAGMAT = 50000;
        if (PAT > 2000000 && EST > 3) {
            this.PAGMAT += 0.03 * PAT;
        }
    }

   
    public String getInfo() {
    	return "Numero de inscripción: " + NI + "\n\nNombre: " + NOM + "\n\n Debe pagar: $ " + PAGMAT;    }
}
