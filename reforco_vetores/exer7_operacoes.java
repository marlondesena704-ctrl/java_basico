package src;

import java.util.Scanner;

public class exer7_operacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaNota = 0;
        double media = 0;
        double qtdAcimaMedia = 0;

        double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5};

        for(double nota:notas){
            somaNota+=nota;
            media = somaNota/5;
            if(nota>=7){
                qtdAcimaMedia++;
                System.out.println("Notas acima da média: " + nota);
            }
        }
        System.out.println("Quantidade de notas acima da média: " + (int) qtdAcimaMedia);

        System.out.println("Soma das notas: " + somaNota);
        System.out.println("Média: " + media);

    }
}
