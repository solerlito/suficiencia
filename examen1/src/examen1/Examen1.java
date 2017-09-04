/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author icomsqa1
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        trianguloPascal(8);
    }
    //ejercicio1
    public static int compararCadenas(String padre, String hija){
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
            return 1;
        }else{
            return 0;  

        }
        
    }
    //ejercicio2
    public static double sumatoria(int x, int n){
        double resultado = 0;
        
        for (int i = 0; i < n; i++) {
            resultado += Math.pow(x, 2*i+1)/factorial(2*i+1);
        }
        return resultado;
    }
    //ejercicio3
    public static void trianguloPascal(int lineas) {
        int num = 0;
        for (int i = 0; i < lineas; i++) {
            for (int y = 0; y < lineas - i; ++y) {
                System.out.println(" ");
            }
            num = 1;
            for (int j = 0; j <= i; j++) {
                if (num % 2 == 0) {
                    System.out.println("◌");
                } else {
                    System.out.println("◉");
                }
                num = num * (i - j) / (j + 1);
            }
            System.out.println("");
        }
    }
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
