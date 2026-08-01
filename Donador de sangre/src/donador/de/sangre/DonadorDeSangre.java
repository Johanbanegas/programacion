/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donador.de.sangre;

import java.util.Scanner;

/**
 *
 * @author Xande
 */
public class DonadorDeSangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
     * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
     * y peso (Mas de 110 lbs). 
     * Si se llega a cumplir los criterios antes expuestos, solo
     * se podra donar sangre si ha comido.
     * 
     * Otro elemento que se tiene que considerar para poder donar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los 
     * niveles adecuados.
     * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
     * 
     */
        int edad=0;
        int peso= 0;
        char comio='a';
        int niveles=0;
        String Genero="x";
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la edad");
        edad=entrada.nextInt();
        
        System.out.println("ingrese el peso");
        peso=entrada.nextInt();
        
        System.out.println("Su peso es :");
        System.out.println(peso);
        System.out.println("Su edad es: ");
        System.out.println(edad);
        
        if (edad >= 18 && edad <= 65 && peso >= 110) {
            System.out.println("Usted es un crack puede donar sangre maquina");
            
            entrada.nextLine();//Limpieza del buffer
            System.out.println("Ya comio?");
            System.out.println("Escriba 's' si es verdadero ");
            comio = entrada.nextLine().charAt(0);

            if (comio == 's' || comio == 's') {
                System.out.println("si puede donar");
            }
        } else {
            System.out.println("No se puede donar");
        }
        System.out.println("Ingrese su niveles de hierro mi estimada maquina");
       
        niveles=entrada.nextInt();
        entrada.nextLine();
        System.out.println("Eres hombre o mujer?");
       Genero=entrada.nextLine().toUpperCase();
        
        if((niveles>=14 && Genero.equals("HOMBRE"))||(niveles>=12 &&Genero.equals("FEMENINO"))){
            System.out.println("Si puede donar sangre");
        } else{
               System.out.println("no se puede donar sangre");     
        }
    }//main
    
}//class
