
package array_bsrl_ogr_ort;

public class Array_Bsrl_ogr_ort {

    public static void main(String[] args) {
        int basariliogr = 0, sum = 0, i;
        double average;
        int[] notlar = new int[]{30,75,50,60,70,80,90};
        for(i=0; i<notlar.length; i++){
            if(notlar[i]>=50){
                sum +=notlar[i];
                basariliogr++;
            }
        }
        average = sum*1.0/basariliogr;
        System.out.println("Toplam :"+ sum);
        System.out.println("Ortalama :"+ average);
    }
    
}
