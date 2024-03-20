package btth1;

import java.util.Scanner;

public class Bai2 {
    public static float Sum(float x, int n) {
        float T1 = 1;
        float T2 = 0;
        float S = 0;

        for (int i = 1; i <= n; i++) {
            T1 = T1 * x;
            T2 = T2 + i;
            S = S + (float) T1 / T2;
        }
    
        return S;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x;
        System.out.println("\nNhập x: ");
        x = sc.nextFloat();
        
        System.err.println("\nNhập n: ");
        int n;
        n = sc.nextInt();
        
        float S;
        S = Sum(x, n);
        System.out.println("\nGiá trị của biểu thức là S = " + S);
    }
}
