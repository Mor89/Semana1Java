/*Si un trabajador de la empresa privada está afiliado a las AFP y los porcentajes que se paga a las AFP es de 6% por parte del
trabajador y 6.5% por parte del empleador, si el empleado gana $500 al mes, ¿Cuánto está pagando a la AFP el trabajador en
concepto de empleado y de empleador?*/
public class AFPt {
    public static void main (String[] args){
        double AFP = 0.06;
        double empleado = 0.065;
        double emplePago, empleadorPag, pagoAFP;
        
        emplePago = 500 * AFP;
        empleadorPag = 500 * empleado;
        pagoAFP = emplePago + empleadorPag;
        
        
        System.out.println("EL pago a la AFP es : $" + pagoAFP);
        
    }
}
