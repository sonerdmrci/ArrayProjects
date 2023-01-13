
package array_sayiyiyaziyacevirme;

import java.util.Scanner;

public class Array_SayiyiYaziyaCevirme {

    public static void main(String[] args) {
        //Uc basamaklı verilen bir sayiyi yazi ile yazdiriniz
        //ornek girdi = 311
        //ornek cıktı = üç yüz on bir
        Scanner scan = new Scanner (System.in);
        String[] birler = new String[]{"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
        String[] onlar  = new String[]{"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};
        String[] yuzler = new String[]{"","yüz","ikiyüz","üçyüz","dörtyüz","beşyüz","altıyüz","yediyüz","sekizyüz","dokuzyüz"};
        System.out.print("Üç Basamaklı Bir Sayı Giriniz :");
        int sayi = scan.nextInt();
        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = sayi % 100 / 10;
        int yuzlerBasamagi = sayi % 1000 / 100;
        String yazi =yuzler[yuzlerBasamagi]+" "+ onlar[onlarBasamagi]+" "+birler[birlerBasamagi];//yazi.substring(1) 1. elemandan sonraki elemanları koparma 
        yazi = yazi.substring(0,1).toUpperCase() + yazi.substring(1); //substring(0,1) 0. elamanı koparma 
        System.out.println("Sayı :"+ sayi + "\nYazılışı :"+yazi);     //toUpperCase() büyük sayıya çevirme
    }
    
}
