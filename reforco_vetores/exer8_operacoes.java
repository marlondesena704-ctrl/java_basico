import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = {4, 17, 3, 22, 8, 15, 1, 30, 9};

        int iMaior = 0;
        int iMenor = 0;

        for(int i=1; i<v.length; i++){
            if(v[i] > v[iMaior]){
                iMaior = i;
            }if(v[i] < v[iMenor]){
                iMenor = i;
            }

        }
        System.out.println("Maior: v[" + iMaior + "] = " + v[iMaior]);
        System.out.println("Menor: v[" + iMenor + "] = " + v[iMenor]);
    }
}
