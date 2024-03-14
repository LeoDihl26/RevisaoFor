package com.mycompany.revisaofor;

import java.util.Scanner;

public class RevisaoFor {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in
        );
        
        int n = 0;
        int soma = 0;
        
        /*
          int = 0 - inicializador, em que posição o i (contador) vai iniciar 
          i <= n - ENQUANTO i for menor ou igual a n, o LOOP vai continuar
          i ++ - cada vez vez que o LOOP é realizado, é adicionado +1
        */
        n = teclado.nextInt();
        
        for(int i = 2; i <= n; i += 2) {
            soma += i;
            System.out.println(i);
        }
        System.out.println("A soma dos números pares até " + n + " é: " + soma);
    }
}
