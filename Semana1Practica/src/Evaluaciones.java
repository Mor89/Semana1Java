/*
Un estudiante  del ITCA tiene 5 evaluaciones en cada ciclo de estudio. La primera evaluación tiene una ponderación
del 25% de la nota final, la segunda evaluación tiene un 15% de la nota final, la tercera evaluación tiene un 15% de la nota
final, la cuarta evaluación tiene un 20% del valor de la nota final y la quinta evaluación tiene un 25% del valor de la nota final.
Si el estudiante obtuvo las siguientes calificaciones:
Parcial 1: 8.0 Parcial 2: 7.5 Parcial 3: 9.0 Parcial 4: 8.0 Parcial 5: 9.0
¿Cuál sería el promedio final del estudiante al final del ciclo?
*/
public class Evaluaciones {
    public static void main (String[] args){
        double Evaluacion1, Evaluacion2, Evaluacion3, Evaluacion4, Evaluacion5, PromFinal;
        Evaluacion1 = 8.0 * 0.25;
        Evaluacion2 = 7.5 * 0.15;
        Evaluacion3 = 9.0 * 0.15;
        Evaluacion4 = 8.0 *0.20;
        Evaluacion5 = 9.0*.25;
        PromFinal = Evaluacion1 + Evaluacion2 + Evaluacion3 +Evaluacion4 + Evaluacion5/5;
        
       System.out.println("El promedio final del ciclo es: " + PromFinal);
        
        
        
                
               
    }
}
