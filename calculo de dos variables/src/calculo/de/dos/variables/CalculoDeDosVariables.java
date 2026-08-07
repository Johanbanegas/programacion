/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo.de.dos.variables;

import java.util.Scanner;

/**
 *
 * @author Xande
 */
public class CalculoDeDosVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int base=0;
        int altura=0;
        int area=0;
        int perimetro=0;
        int hola=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Te cuento un chiste");
        System.out.println("SI=1 NO=2");
        hola= sc.nextInt();
        if(hola==1){
            System.out.println("Sabes que hace una abeja en un gimnasio?");
            System.out.println("Zum-ba!");
        }
        else{
            System.out.println("Maitro aburrido");
        }
        System.out.println("-----------------------------------");
        System.out.println("Ingrese su base :");
        base=sc.nextInt();
        System.out.println("Ingrese su altura");
        altura=sc.nextInt();
        System.out.println("Su area es:");
        area=(base*altura);
        System.out.println(area);
        System.out.println("Su perimetro es de:");
        perimetro=2*(base+altura);
        System.out.println(perimetro);
        System.out.println("Gracias por usar mi programa manin");
        
    }
    
}
