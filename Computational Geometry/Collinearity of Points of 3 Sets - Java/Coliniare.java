import java.util.Arrays;

public class Coliniare{
    public static void main(String[] args)
    {
        int n = 9;
        int[] A = {-9, -2, 3, 7, -7, 10, 5, 1, 4};
        int[] B = {-9, 3, -8, 1, 4, 2, 8, -2, 6};
        int[] C = {6, 3, 4, -5, 9, -4, -1, 5, 8};

        Arrays.sort(A);        
        Arrays.sort(B);        
        Arrays.sort(C);

        System.out.println("A = " + Arrays.toString(A));
        System.out.println("B = " + Arrays.toString(B));
        System.out.println("C = " + Arrays.toString(C));

        int[] D = new int[n];
        int[] E = new int[n];

        for(int i = 0; i < n; i++){
            D[i] = 2 * B[i];
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                E[i] = A[i] + C[j];
            }
        }

        Arrays.sort(D);
        Arrays.sort(E);
        System.out.println("D = " + Arrays.toString(D));
        System.out.println("E = " + Arrays.toString(E));

        /*j = 0; k = 0;
        while(j < n && k < n){
            if(D[j] == E[k])
                System.out.println("D" + j + " si E" + k + " sunt coliniare");
            if(D[j] < E[k])
                j++;
            if(D[j] > E[k])
                k++;
        }*/

        for(int j = 0; j < n; j++){
            for(int k = 0; k < n; k++){
                if(D[j] == E[k])
                    System.out.println("D" + (j+1) + " si E" + (k+1) + " coliniare");
            }
        }
    }
}