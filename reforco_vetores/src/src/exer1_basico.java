package src;

import java.util.Scanner;

public class exer1_basico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = {10,20,30,40,50};

        for(int i = 0; i< numeros.length; i++){
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
    }
}
