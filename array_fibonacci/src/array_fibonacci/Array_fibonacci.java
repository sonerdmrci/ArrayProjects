
package array_fibonacci;

import java.util.Scanner;

public class Array_fibonacci {

    public static void main(String[] args) {
        //fibonacci sayılar dizisi
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane fibonacci sayısı istiyorsunuz :");
        int N = scan.nextInt();
        int[] fibo = new int[N];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2; i<fibo.length; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
            
        }
        for(int i=0; i<fibo.length; i++){
            System.out.print(fibo[i] + ",");
        }
        System.out.println();
    }
    
}
