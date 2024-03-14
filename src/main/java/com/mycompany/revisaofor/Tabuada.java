package com.mycompany.revisaofor;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in); 
        
       int numero = 0;
       
       numero = teclado.nextInt();
       
       for(int i = 1; i <= 10; i++){
           System.out.println(numero + "x" + i + " = " + (numero*i));
       }
    }   
}
