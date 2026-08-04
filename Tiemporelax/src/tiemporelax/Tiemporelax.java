/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemporelax;

import java.util.Scanner;

/**
 *
 * @author Xande
 * 1.objetivos
 * seleccion Multiples
 * A.Estructura
 * b.Tipos de condicion
 * 2.Formato de cadenas (printf)
 */
public class Tiemporelax {

    /**
     * Desarrollar algoritmo que me permita escoger un pais a visitar
     * posteriormente a ello, debemos nostros escoger las posibles ciudades 
     * a recorrer,sin embargo,solo se puede una ciudad.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        int seleccionMenu=0;
        char seleccionsubMenu='a';
        System.out.println("Agencia de viaje");
        System.out.printf("|%20s||%-20s|\n","Tania's Travel","Buen viaje");
        System.out.println("--------------------------");
        System.out.println("1.Japon");
        System.out.println("2.Francia");
        System.out.println("3.Nueva zelanda");
        System.out.println("4.Canada");
        System.out.print("Respuesta: ");
        seleccionMenu=sc.nextInt();
        
        /*
        if/else rango de valores
        swith igualdad/ todas opciones estan en el mismo nivel
        
        */
        switch (seleccionMenu) {
            case 1:
                System.out.println("Nihon e yokoso");
                System.out.println("Bienvenido a Japon");
                System.out.println("-------------------");
                System.out.println("A. Osaka");
                System.out.println("B Tokio");
                System.out.println("C.Kioto");
                System.out.println("Respuesta:  ");
                sc.nextLine();//Limpieza de Buffer
                seleccionsubMenu = sc.nextLine().toUpperCase().charAt(0);
                switch (seleccionsubMenu) {
                    case 'A':
                        System.out.println("Super Nintendo World Tour");

                        break;
                    case 'B':
                        System.out.println("Car Meet");
                        break;
                    case 'C':
                        System.out.println("Pabellon Dorado segun Google");
                        break;
                    default:
                        System.out.println("Cualquier ciudad");
                        System.out.println("porque no esta la opcion");
                        System.out.println("que escogiste");
                        break;
                }//SUBMENU
                break;
            case 2:
                System.out.println("Bienvenue en France");
                System.out.println("Bienvenido a Francia");
                System.out.println("-------------------");
                System.out.println("1. Paris");
                System.out.println("2. Marsella");
                System.out.println("3.Lyon");
                System.out.println("Respuesta: ");
                sc.nextLine();
                seleccionsubMenu = sc.nextLine().charAt(0);
                switch (seleccionsubMenu) {
                    case '1':
                        System.out.println("Torre Eiffel");
                        break;
                    case '2':
                        System.out.println("Palacio de Marshella");
                        break;
                    case '3':
                        System.out.println("El estadio");
                        break;
                    default:
                        System.out.println("Lea manin.... no esta la opcion");
                        break;
                }//FN SWITCH
                break;
            case 3:
                System.out.println("Nau mai,haere mai! ");
                System.out.println("Bienvenido a Nueva Zelanda");
                System.out.println("-------------------");

                System.out.println("A. Sky Tower");
                System.out.println("B. Hogbbiton");
                System.out.println("C. Mildford sound");
                System.out.println("Respuesta");

                sc.nextLine();
                seleccionsubMenu = sc.nextLine().toUpperCase().charAt(0);
                if (seleccionsubMenu == 'A') {
                    System.out.printf("%s Sky Tower %s", "\u001B[31m", "\u001B[0m");

                } else if (seleccionsubMenu == 'B') {
                    System.out.printf("%s Hogbbiton %s", "\u001B[32m", "\u001B[0m");

                } else if (seleccionsubMenu == 'C') {
                    System.out.printf("%s Mildford Sound %s", "\u001B[34m", "\u001B[0m");
                } else {
                    System.out.println("Usted no lee va?!!!");
                }

                break;
            case 4:
                System.out.println("Welcome to Canada");
                System.out.println("Bienvenido a Canada");
                break;
        }
    }//main

}//class
