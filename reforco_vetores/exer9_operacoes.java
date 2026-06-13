import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = {12, 5, 33, 7, 28, 14, 9};

        int alvo = 28, posicao = -1;

        for(int i = 0; i < v.length; i++){
            if(v[i] == alvo){
                posicao = i;
                break;
            }

        }
        System.out.println(posicao == -1
                ? "Não encontrado"
                : alvo + " - Encontrado em v[" + posicao + "]");
    }
}
