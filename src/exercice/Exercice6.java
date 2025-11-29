package exercice;
import java.util.Scanner;
public class Exercice6 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrée : ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }
        
        int[] freq = new int[100001];

        int distinct = 0;

        for (int i = 0; i < k; i++) {
            int x = T[i];
            if (freq[x] == 0) {
                distinct++;
            }
            freq[x]++;
        }
        
        System.out.println("Sortie : ");
        System.out.print(distinct);

        for (int i = k; i < n; i++) {

            int out = T[i - k];
            freq[out]--;
            if (freq[out] == 0) {
                distinct--;
            }

            int in = T[i];
            if (freq[in] == 0) {
                distinct++;
            }
            freq[in]++;

            System.out.print(" " + distinct);
        }

        System.out.println();
		
       sc.close();
       

       
	}

}
