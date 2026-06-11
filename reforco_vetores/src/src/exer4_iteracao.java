package src;

import java.util.Scanner;

public class exer4_iteracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cidades = {"São Paulo", "Rio", "Curitiba", "Salvador", "Fortaleza"};

        for(String cidade:cidades){
            System.out.println(cidade.toUpperCase());
        }
    }
}
