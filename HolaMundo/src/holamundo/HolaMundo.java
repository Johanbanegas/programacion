/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author Xander
 */
public class HolaMundo {
/*
    Pleca asterisco -> inicio y al reves cierre.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        1. imprimir en pantalla
        caracter de Escape
        2.Captura de datos:
        */
        //sout
        //souf
        System.out.println("Hola me llamo Johan");
        System.out.println("Este sera mi primer");
        System.out.println("Programa ");
        
        System.out.print("Vamos en camino a ");
        System.out.print("la clase de ");
        System.out.print("Programacion");
        // \n para dar enter
        // \t es tabulacion
        
       // System.out.println(" ");
        System.out.printf("Tu apellido es %S\n ","Banegas ");
       // System.out.println(" ");
       
        System.out.printf("%S Tu apellido es \n ","Banegas ");
        
        System.out.printf("Tu apellido %S es \n ","Banegas ");
        
        System.out.println("Hola \n este es \n un nuevo \n amanacer");
        System.out.println("Hola \t este es \t un nuevo \t amanacer");
        
        //Variables
        int edad; //tipo entero
        double peso; // tipo decimal
        char inicial; //tipo caracter letras,digitos , simbolos especiales
        String nombre;// tipo cadena
        boolean estado; //tipo estado false o true
        /*
        Caracter comillas simples ' '
        Cadena string comillas doubles " "
        */
        edad=21;
        peso=60.5;
        inicial='D';
        nombre= "Oscar";
        System.out.printf("Tengo %d anios \n",edad);
         System.out.printf("Mi peso ideal es %.2f",peso);
          System.out.printf("Dime %c por mi inicial",inicial);
           System.out.printf("%s es mi nombre",nombre);
             
    }//Fin del main
    
}//Fin del class
