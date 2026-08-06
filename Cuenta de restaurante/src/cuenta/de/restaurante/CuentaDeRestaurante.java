/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta.de.restaurante;

import java.util.Scanner;

/**
 *
 * @author Xande
 * objetivos 
 * conocer las diferentes tipos de ciclo de repeticion
 * analizar los componentes de todo ciclo de rep
 * construir un algoritmo con un ciclo de rep
 */
public class CuentaDeRestaurante {

    /**
     * @param args the command line arguments
     * desarrollar un algoritmo que simule la cuenta de un restaurante
     * que se tiene que pagar entre un grupo de amigos(7) dividido en partes iguales
     */
    /*
    Ciclo de repeticion
    1 while
    2 do- while
    3 for
    4 foreach
    
    Componentes de ciclos de repeticion
    1. variable de control-> valor inicial
    2. Condicion          -> Limite de repeticion
    Todo ciclo de repeticion se ejecuta y repite siempre
    y cuando la condicion se mantenga verdadera.
    3. Modifcador de la variable control
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double promedioPago=0;
        int gastoIndividual=0;
        int gastoAcumulado=0;
        int numPersona=1;
        while(numPersona<=7){
            //Instrucciones a repetir
            System.out.printf("Persona %d) Cuanto consumiste",numPersona);
            System.out.println("");
            gastoIndividual=sc.nextInt();
            gastoAcumulado += gastoIndividual;
            System.out.printf("P: %d\tGasto ind:%d\tGasto ACUM:%d",numPersona,gastoIndividual,gastoAcumulado);
            System.out.println("");
            //Modificador
            //opcion1
           // numPersona +=1;//numPersona=numpersona+1
            //Opcion #2
            numPersona++;//Incremento unitarios PDST Incremento
        }//WHILE
        numPersona--;
        System.out.printf("\nTotal Personas:%d",numPersona);
        promedioPago= gastoAcumulado/numPersona;
                System.out.printf("\nGasto promedio x persona: %.2f",promedioPago);
    }//MAIN
    
}//ULTIMO
