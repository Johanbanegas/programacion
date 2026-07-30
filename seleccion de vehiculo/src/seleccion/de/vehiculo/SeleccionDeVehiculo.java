/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccion.de.vehiculo;

import java.util.Scanner;

/**
 *
 * @author Xande
 * Objetivo
 *1. Estructura  o formato
 * a.palabra claves
 * b.Bloques
 * c.Terminaciones
 * d.Condiciones
 *2. Tipos de seleccion
 * a.simple
 * b. doble
 *3. Condiciones
 * a.Tipos de condiciones
 * 
 *
 * b.Tipos de comparacion
 */
public class SeleccionDeVehiculo {

    /**
     * @param args the command line arguments
     * Desarrollar un algoritmo que me permita determinar los siguientes elementos de un vehiculo:
     * a.si el tamaño del tanque de combustible agarra mas de 30 litros (dato numerico)
     * b.El tipo de combustible si es o no Diesel                       (Dato tipo caracter)
     * c.Si energeticamente efeciente y  ecologico                      (Dato cadena)
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //sout
        //souf
        Scanner entrada= new Scanner(System.in);
        
        int cantidadLitros=0;
        char respuestaTipo='a';
        String respuestaCadena= "John Doe";
        
        System.out.println("Me dijieron que eres duenio de un vehiculo\"verde\"");
        System.out.println("Tienes que echarle biodiesel");
        System.out.println("Cuantos litros agarra?");
        cantidadLitros=entrada.nextInt();
        
        if(cantidadLitros>30){
            System.out.println("Es un vehiculo con");
            System.out.println("grandes capacidades");
            System.out.println("Seguro la factura es alta");
        }
        System.out.println("");
        entrada.nextLine();
        System.out.println("Tu Vehiculo es Diesel?(x=si,y=no");
        respuestaTipo=entrada.nextLine().charAt(0);
       
        if(respuestaTipo=='x'){
            System.out.println("Si es diesel verde");
            System.out.println("Diesel combinado con ethanol");
            System.out.println("Se saca del maiz");
            
        }
        else{
            System.out.println("uyyyyy. eres anticlimatico");
            System.out.println("calentamiento Globlal");
        }
        System.out.println("");
        System.out.println("Tu carro es energeticamente eficiente?");
        respuestaCadena=entrada.nextLine();
        System.out.printf("Respuesta ingresada: %s",respuestaCadena);
        
        System.out.println("\nseguro que es asi?");
        respuestaCadena=entrada.nextLine().toUpperCase();
        System.out.printf("Respuesta ingresada: %s",respuestaCadena);
        
          System.out.println("\n100% seguro?");
        respuestaCadena=entrada.nextLine().toLowerCase();
        System.out.printf("Respuesta ingresada: %s",respuestaCadena);
        
        if(respuestaCadena.equals("si")){
            System.out.println("Excelente");
            System.out.println("Amigable con el ambiente");
            
        }
        else{
            System.out.println("\nuyyy..... manito pero busca que se puede hacer");
        }
    }//Fin del main
    
}//Fin de class
