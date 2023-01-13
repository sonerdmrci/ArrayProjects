
package array_rekorlar;

public class Array_rekorlar {

    public static void main(String[] args) {
        double[] scores = new double[]{10,12,9,14,15,8,13.8,12,7,10,9};
        int recores =0;
        for(int i=0; i<scores.length; i++){
            boolean rekor = true;
            for(int j=0; j<i; j++){
                if(scores[j]<scores[i]) {
                 rekor = false;
                 break;
                }
            }
            if(rekor) recores++;
        }
        System.out.println("recores :"+recores);
    }
    
}
