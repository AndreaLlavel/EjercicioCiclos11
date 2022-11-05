/*
 Andrea Llavel.Asistencia Octubre de Grupo Encrypted Code.
Ejercicio 12: Pdeir un numero y calcular su factorial .
Hacerlo con las dos clases,Scanner y JOptionPane
*/
package Ciclos12;

//import javax.swing.JOptionPane;

import java.util.Scanner;                             //Ejecutando la 

public class Ciclos12 {                               //clase Scanner
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        long factorial =1;
        System.out.println("Digite un numero:");
        int numero = 0;
       // int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite  un numero nuevo: "));
                for(int i=1; i<numero;i++){
                    factorial*=i;
                }
                System.out.println("\nEl factorial del numero Ingresado es:"+factorial);
                //JOptionPane.showMessageDialog(null, "El factorial del numero ingresado es: "+factorial);
    }
}
