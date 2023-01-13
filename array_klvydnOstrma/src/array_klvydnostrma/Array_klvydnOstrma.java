
package array_klvydnostrma;

import java.util.Scanner;

public class Array_klvydnOstrma {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Dizi Kaç Elamanlı Olsun :");
        int diziUzunluk = scan.nextInt();
        scan.nextLine();
        String[] isimler = new String[diziUzunluk];
        for(int i=0; i<isimler.length; i++){
            System.out.print("Dizinin "+ i + ". İndex Değerini Giriniz :");
            isimler[i]=scan.nextLine();
        }
        for(int i=0; i<isimler.length; i++) System.out.print(isimler[i] + " ");
        System.out.println();
    }
    
}
