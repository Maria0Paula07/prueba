/*MUESTRAVISUAL4ARREGLOS*/
package muestravisual4arreglos;
/**SALATIEL */
public class MUESTRAVISUAL4ARREGLOS {
 
 public static void main(String[] args) {
 String cursos []={"Lógica de sistemas", "Precálculo”,” introducción a los sistemas"}; 
int practicas []={40,3,2};
System.out.println("Promedio de Cursos");
System.out.println("ASIGNATURA NOTA");
System.out.println("------ ----- ");
int pp=(practicas[0]+practicas[1]+practicas[2])/3;
for (int s=0;s<cursos.length;s++){
System.out.println(cursos[s] + " "+practicas[s]); } System.out.println("Su Promedio es : " +pp);
 }

@Override
public String toString() {
    return "MUESTRAVISUAL4ARREGLOS []";
}
}