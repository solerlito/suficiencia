/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author icomsqa1
 */
public class Examen1 {
    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main2(String[] args) {
        boolean salir = true;
    
        do{
        System.out.println("escoga una opcion: \n1. ejercicio 1\n2. ejercicio 2\n3. ejercicio3\n0. sair");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3: 
                ejercicio3();
                break;
                
            default:
                salir = false;
                
        }
        }while(salir);
    }
    
    public static void main(String[] args) {
        ejercicio3();
    }
    //ejercicio1
    public static void ejercicio1(){
        System.out.print("Danos dos palabras y te diremos si puedes contruir una apartir de la otra "
                + "\nPalabra 1: ");
        String padre = leer.next();
        System.out.print("Palabra 2: ");
        String hija = leer.next();
        
        if(compararCadenas(padre, hija)){
            System.out.println("Buenas noticias, si se puede.");
        }else{
            System.out.println("intenta con otra palabra.");
        }
        System.out.println("\n\n\n");

    }
    public static boolean compararCadenas(String padre, String hija){
        char[] apadre = padre.toCharArray();
        char[] ahija = hija.toCharArray();
        
        for (int i = 0; i < ahija.length; i++) {
            for (int j = 0; j < apadre.length; j++) {
                if( ahija[i] == apadre[j]){
                    ahija[i] = ' ';
                    apadre[j] = ' ';
                }
                        
            }
        }
        hija = "";
        for (int i = 0; i < ahija.length; i++) {
            if(ahija[i] != ' ')
            hija = hija + ahija[i]; 
        }
  
        if(hija.isEmpty()){
            return true;
        }else{
            return false;  

        }
        
    }
    //ejercicio2
    public static void ejercicio2(){
        System.out.print("aqui ejecutaremos una serie, solo danos dos numeros: \nx: ");
        int x = leer.nextInt();
        System.out.print("n: ");
        int n = leer.nextInt();
        System.out.println("el resultado es: " + sumatoria(x, n));
        System.out.println("\n\n\n");
    }
    public static double sumatoria(int x, int n){
        double resultado = 0;
        
        for (int i = 0; i < n; i++) {
            resultado += Math.pow(x, 2*i+1)/factorial(2*i+1);
        }
        return resultado;
    }
    //ejercicio3
    public static void ejercicio3(){
        triangulo(5);
    }
    //este se parece pero no es igual este codigo no funciona para este ejercio 
    public static void trianguloPascal(int lineas) {
        int num = 0;
        for (int i = 0; i < lineas; i++) {
            for (int y = 0; y < lineas - i; ++y) {
                System.out.print(" ");
            }
            num = 1;
            for (int j = 0; j <= i; j++) {
                if (num % 2 == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ◉");
                }
                num = num * (i - j) / (j + 1);
            }
            System.out.println("");
        }
    }
    //otro intento
    public static void triangulo(int filas) {
        for (int i = 0; i < filas*3; i++) {
            for (int j = 0; j < 3*filas -i ; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                if(i < 3)
                System.out.print(" @");
                else{
                    if (i%3 == 0) {
                        System.out.print(" @");
                    }else
                        System.out.print(" @");
                }
                   
            }
            
            System.out.println();

        }
        

    }

    
    
    //complementos
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
