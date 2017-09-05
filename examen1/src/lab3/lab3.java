/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author icomsqa1
 */
public class lab3 {
    public static void main(String[] args) {
        conejo();
    }
    
    public static void ejercicio2(int n){
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                if (i == (n-1)/2 && j  == (n-1)/2 ){
                    System.out.print(" ~ ");
                }else if(i == 0 && j > (n-1)/2 && j < n -1 ){
                    System.out.print(" % ");
                }else if (j == 0 || j==n-1 ) {
                    System.out.print(" # ");
                }else if (j == (n-1) /2 ) {
                    System.out.print(" * ");
                }else if(i == 0){
                    System.out.print(" & ");
                }else if (i == n-1 && j > (n-1) /2) {
                    System.out.print(" $ ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
    
    public static void intercalarCadenas(String uno, String dos){
        String cadena = "";
        
       
        for (int i = 0; i < uno.length(); i++) {
            cadena += uno.charAt(i) + "" +dos.charAt(i);
        }
        System.out.println(cadena);
    }
    
    public static void conejo(){
        
    }
}
