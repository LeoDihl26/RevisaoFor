package com.mycompany.revisaofor;

import java.util.Scanner;

public class Exemplofibonacci {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        int primeirotermo = 0;
        int segundotermo = 1;        
        
        System.out.println("Os primeiros " + n + " números da "
                + "sequência de Fibonacci são:");
        System.out.println(primeirotermo + " " + segundotermo + " ");
        
        n = teclado.nextInt();
        
        for (int i = 3; i <= n; i++) {
             int proximotermo = primeirotermo + segundotermo;
             System.out.println(proximotermo +" ");
             
             primeirotermo = segundotermo;
             segundotermo = proximotermo;
        }
    }
}
