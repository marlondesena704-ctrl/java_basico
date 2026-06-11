package src;

import java.util.Scanner;

public class exer6_iteracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = {10,20,30,40,50};

        System.out.println("ELEMENTOS DO VETOR: ");
        for(int n:v){
            System.out.println(n);
        }
        System.out.println("ELEMENTOS DO VETOR INVERTIDOS: ");
        for(int i = v.length-1;i>=0; i--){
            System.out.println(v[i] + " ");
        }
    }
}
