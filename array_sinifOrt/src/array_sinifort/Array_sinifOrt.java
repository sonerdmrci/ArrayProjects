
package array_sinifort;

public class Array_sinifOrt {

    public static void main(String[] args) {
        //1-notları toplama
        //2-ortalamayı bulma
        //3-ortalamanın üzerinde olanlar
        int[] notlar = new int[]{50,65,70,80,45,30,90,35,90,100,75};
        int basariliSayisi = 0, sum = 0;
        double average;
        for(int i=0; i<notlar.length; i++){
            sum += notlar[i];
        }
        average = (1.0 * sum) / notlar.length;
        for(int i=0; i<notlar.length; i++){
            if(notlar[i] >= average) basariliSayisi++;
        }
        System.out.println(average);
        System.out.println(basariliSayisi);
    }
    
}
