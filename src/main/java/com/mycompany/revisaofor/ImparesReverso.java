package com.mycompany.revisaofor;

import java.util.Scanner;

public class ImparesReverso {

    public static void main(String[] args) {
                 
       Scanner teclado = new Scanner(System.in); 
       
       int x = teclado.nextInt();
       
       for(int i = x; i >= 1; i -= 2){
           System.out.println(i);
       } 
    }
}
