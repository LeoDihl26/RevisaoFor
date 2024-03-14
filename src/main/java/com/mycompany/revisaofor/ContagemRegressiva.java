package com.mycompany.revisaofor;

import java.util.Scanner;

public class ContagemRegressiva {
 
   public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in); 
       
       System.out.printf("\nDigite o tempo de autodestruição: ");
       
       int x = teclado.nextInt();
       
       System.out.printf("\nINICIAR AUTODESTRUIÇÃO EM:\n");
       
       for(int i = x; i >= 1; i -= 1){
           System.out.println("..." + i);
       }  
           System.out.println("KABOOM!!");
    } 
}
