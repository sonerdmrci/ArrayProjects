
package array_ucluyazdirma;

public class Array_ucluYazdirma {

    public static void main(String[] args) {
        int[] sayilar = new int[]{10,15,45,70,54,65,87,50,35,25,20};
        int k=3;
        for(int i=0; i<sayilar.length; i++){
            System.out.print(sayilar[i]+" ");
            if((i+1)%k == 0) System.out.println();
        }
        int kalan =sayilar.length % k;
        kalan = k - kalan;
        for(int i=0; i<kalan; i++){
            System.out.print("00 ");
        }
    }
    
}
