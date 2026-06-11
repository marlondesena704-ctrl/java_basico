package src;

import java.util.Scanner;

public class exer3_basico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Posição: " + i + " = " + i*i);
//            vetor[i] = i*i;
        }
//        for(int n:vetor){
//            System.out.println(n + " ");
//        }
        sc.close();
    }

}
