
package array_enyukseknotualanlar;

public class Array_enYuksekNotuAlanlar {

    public static void main(String[] args) {
        //en yuksek notu alan ogrenci sayisi
        int[] notlar = new int[]{60,70,55,95,45,95,72,95,65,95};
        int enYuksekNotAlanlar=0, buyukNot=0;
        for(int i=0; i<notlar.length; i++){
            if(notlar[i] > buyukNot){
                buyukNot = notlar[i];
            }
        }
        for(int i=0; i<notlar.length; i++){
            if(notlar[i]==buyukNot){
                enYuksekNotAlanlar++;
            }
        }
        System.out.println("En Yüksek Notu Alan Öğrenci Sayısı :"+enYuksekNotAlanlar);
        System.out.println("--------");
        /*bir ogretmen en yuksek notu alan oggrencinin
        notunu 100'e tamaladığında diger ogrencilerinde 
        notuna aynı puanı ekleyecektir programı yapınız.
        */
        for(int i=0; i<notlar.length; i++){
            System.out.print(notlar[i]+",");
        }
        System.out.println();
        int ekPuan = 100-buyukNot;
        for(int i=0; i<notlar.length; i++){
            notlar[i] +=ekPuan;
        }
        for(int i=0; i<notlar.length; i++){
            System.out.print(notlar[i]+",");
        }
        System.out.println();
    }
    
}
