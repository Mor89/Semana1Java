/*
Un docente universitario gana $8.00 la hora de clase y ha impartido 36 horas en un mes de clases. Debemos de
calcular el salario del docente sabiendo que le van a descontar el 10% de la renta. ¿Cuánto ganara el docente al final de
un mes de clases menos el descuento de la renta?
*/
public class Renta {
    public static void main (String[] args){
        
        double salarioHora, tiempo, salarioTotal, renta, totalRenta, totalFinal;
        
       salarioHora = 8.00;
       tiempo = 36;
       salarioTotal = 8.00 * 36;
       renta = 0.1;
       totalRenta = salarioTotal * renta;
       totalFinal = salarioTotal - totalRenta;
       
       System.out.println("El salario sin descuento es: $" + salarioTotal);
       System.out.println("El valor de la renta es : $" + totalRenta);  
       System.out.println("El salario con renta es : $" + totalFinal);
}
}