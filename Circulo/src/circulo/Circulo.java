/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulo;

import java.util.Scanner;

/**
 *
 * @author Xande
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner e =new Scanner(System.in);
        double radio,area,circunferencia;
        System.out.println("Ingrese el radio de su circulo");
        radio=e.nextDouble();
        area=Math.PI*Math.pow(radio, 2);
        circunferencia=2*Math.PI*radio;
        System.out.printf("La area encontrada del circulo %.2f ",area);
        System.out.println("");
        System.out.printf("La circunferencia del circulo es  %.2f",circunferencia);
        
        
        
    }
    
}
