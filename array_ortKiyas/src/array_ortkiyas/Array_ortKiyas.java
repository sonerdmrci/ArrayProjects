
package array_ortkiyas;

public class Array_ortKiyas {

    public static void main(String[] args) {
        int[] A = new int[]{50,55,80,70,90,50,100,95,85};
        int[] B = new int[]{70,50,40,15,65,25,10,20,85,65};
        int sum1 = 0, sum2 = 0;
        double average1 , average2;
        for(int i=0; i<A.length; i++){
            sum1 += A[i];
        }
        for(int i=0; i<B.length; i++){
            sum2 += B[i]; 
        }
        average1 = (1.0 * sum1) / A.length;
        average2 = (1.0 * sum2) / B.length;
        if(average1 > average2){
            System.out.println("A sınıfının Ortalaması Daha Yüksek");
        }
        else if(average2 > average1){
            System.out.println("B sınıfının Ortalaması Daha Yüksek");
        }
        else{
            System.out.println("İki Sınıfın Ortalaması Eşit");
        }
        System.out.println("A Sınıfının Ortalaması :"+ average1);
        System.out.println("B Sınıfının Ortalaması :"+ average2);
    }
    
}
