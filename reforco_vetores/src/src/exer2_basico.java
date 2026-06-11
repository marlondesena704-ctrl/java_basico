package src;

import java.util.Scanner;

public class exer2_basico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = {5, 3, 8, 1, 9, 4, 7};

        System.out.println("=====ELEMENTOS DO VETOR:=====");

        for(int numero:v){
            System.out.println(numero);
        }

        System.out.println("Primeiro elemento: " + v[0]);
        System.out.println("Último elemento: " + v[v.length-1]);
        System.out.println("Elemento central: " + v[v.length/2]);
    }
}

