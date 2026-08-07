/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interes.simple;

import java.util.Scanner;

/**
 *
 * @author Xande
 */
public class InteresSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int capital=0;
        int tasa=0;
        int tiempo=0;
        int total=0;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad a prestar");
        capital=entrada.nextInt();
        System.out.println("ingrese la tasa de interes anual");
        tasa=entrada.nextInt();
        System.out.println("Ingrese el tiempo de duracion en años");
        tiempo=entrada.nextInt();
        System.out.println("Su total a pagar sera:");
        total=(capital*tasa*tiempo)/100;
        System.out.println(total+capital);
        System.out.println("Su interes generado es: ");
        System.out.println("de "+total);
    }
    
}
