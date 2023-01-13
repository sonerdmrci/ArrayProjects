
package array_toplamıslemi;

public class Array_toplamIslemi {

    public static void main(String[] args) {
        //bastan sona dogru toplama ve toplamların kac tanesi k ya tam bolunur
        int[] ar = new int[]{1,3,4,2,3,1,4,1};
        int k = 2;
        int result =0;
        for(int i=0; i<ar.length-1; i++){
            for(int j=i+1; j<ar.length; j++){
                if((ar[i]+ar[j])%k == 0) result++;
            }
        }
        System.out.println("Result :"+result);
        
    }
    
}
