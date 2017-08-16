/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author escolareaicoms
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char r = 's';
        int countEdad = 0;
        int count = 0;
        String name;
        int edad;
        do{    
            System.out.println("Ingrese su nombre: ");
            name = sc.next();
            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt();
            countEdad += edad;
            count++;
            if(edad > 100){
                System.out.println("MegaPony");
            }else{
                System.out.println("Meow");
            }
            System.out.println("Desea continuar[s/n]: ");
            r = sc.next().charAt(0);
        }while(r == 's' || r == 'S');
        System.out.println("Promedio: " + (double)countEdad/count);
    }
}
