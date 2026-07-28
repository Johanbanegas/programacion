/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

import java.util.Scanner;

/**
 *
 * @author Xande
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     * orden secuencial de las instrucciones
     * capturar datos desde el teclado
     * operaciones aritmeticas
     * 
     * Desarrollar un algoritmo que me permita convertir los siguientes elementos:
     * Pulgadas a centimetros
     * Kilometros a Millas 
     * Grados Farenheint
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
//Declarar variables
int pulgadas =0;
double resultadoCM = 0;

double Kilometros=0;
double millas = 0;
double farenheit= 0;
double celsius = 0;

pulgadas = 10;//Los datos van de derecha a izquierda =
resultadoCM= pulgadas *2.54;
System.out.printf("%d pulgadas es igual a %.2f cm ",pulgadas,resultadoCM);
          //sout
        //souf
pulgadas=35;
resultadoCM = pulgadas * 2.54;
        System.out.printf("\n%.2f cm es igual a %d pulgadas",resultadoCM,pulgadas);
        System.out.printf("Cuantos Kilometros hay de TGU- SPS?");
        Kilometros= teclado.nextDouble();
        millas= Kilometros /1.6;
        System.out.printf("%.2f Km es igual a %.2f millas",Kilometros,millas);
        
        
        System.out.printf("Ingrese la temperatura en farenheit");
        farenheit=teclado.nextDouble();
        celsius= (farenheit-32)*5/9;
        System.out.printf("%.2f farenheit equivale a %.2f grados celsius",farenheit,celsius);
        System.out.println("");

    }
    
}
