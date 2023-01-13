
package array_diagonal;

public class Array_diagonal {

    public static void main(String[] args) {
        //1 2 3 5 3
        //1 7 3 5 3
        //1 2 3 5 3 
        //1 2 3 5 3
        //1 2 3 5 3 
        int n=5;
        int[][] dizi = new int[][]{{1,2,3,5,3},{1,7,3,5,3},{1,2,3,5,3},{1,2,3,5,3},{1,2,3,5,3}};
        int sag = 0, sol = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i == j) sag +=dizi[i][j];
                if(i+j == n-1) sol +=dizi[i][j];
            }
        }
        int fark = Math.abs(sag-sol);
        System.out.println(fark);
        System.out.println(sag);
        System.out.println(sol);
                
    }
    
}
