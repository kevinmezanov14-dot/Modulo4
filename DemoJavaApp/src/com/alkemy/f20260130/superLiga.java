package com.alkemy.f20260130;

import java.util.Scanner;

public class superLiga {
    public static void main(String[] args) {

        // 1. Declarar variables
        int pg, pe, pp; // partidos ganados, empatados, perdidos
        int ppg, ppe, ptotal; // puntos por ganados, empatados, total

        // 2. Leer datos
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese partidos ganados:");
        pg = sc.nextInt();

        System.out.println("Ingrese partidos empatados:");
        pe = sc.nextInt();

        System.out.println("Ingrese partidos perdidos:");
        pp = sc.nextInt();

        // 3. Calcular puntos
        ppg = pg * 3;
        ppe = pe * 1;

        // 4. Puntaje total
        ptotal = ppg + ppe;
       
        // Calcular total de partidos jugados
        int totalPartidos = pg + pe + pp;
        
        // 5. Mostrar resultado
        System.out.println("El puntaje total del equipo es: " + ptotal); 
        System.out.println("Partidos jugados: " + totalPartidos);


        sc.close();
    }
}
