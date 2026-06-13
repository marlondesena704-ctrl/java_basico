import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = {64, 25, 12, 22, 11};

        // Antes
        System.out.print("Antes:  ");
        for (int n : v) System.out.print(n + " ");
        System.out.println();

        // Selection Sort:
        // A cada iteração de i, encontramos o menor a partir de i
        // e o trocamos com v[i], colocando-o em sua posição definitiva.
        for (int i = 0; i < v.length - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[iMin]) iMin = j;
            }
            // Troca v[i] com v[iMin]
            int temp = v[i];
            v[i] = v[iMin];
            v[iMin] = temp;
        }

        // Depois
        System.out.print("Depois: ");
        for (int n : v) System.out.print(n + " ");
        // 11 12 22 25 64
    }
}
