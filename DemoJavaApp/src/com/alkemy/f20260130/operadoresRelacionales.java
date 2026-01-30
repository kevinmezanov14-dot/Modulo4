package com.alkemy.f20260130;

public class operadoresRelacionales {

    public static void main(String[] args) {

        int A = 5;
        int B = 10;
        int C = 5;
        int D = 20;

        // variable auxiliar
        int aux;

        aux = B; // guardo B (10)
        B = C;   // B toma el valor de C (5)
        C = A;   // C toma el valor de A (5)
        A = D;   // A toma el valor de D (20)
        D = aux; // D toma el valor original de B (10)

        System.out.println("Valor final de A: " + A); // 20
        System.out.println("Valor final de B: " + B); // 5
        System.out.println("Valor final de C: " + C); // 5
        System.out.println("Valor final de D: " + D); // 10
        
        // Ejemplos de operadores relacionales
        int a = 10;
        int b = 20;

        System.out.println(a < b);   // true
        System.out.println(a > b);   // false
        System.out.println(a == b);  // false
        System.out.println(a != b);  // true

        int x = 5;
        int y = 5;
        String g = "5";

        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(g.equals("5"));

    }
}

