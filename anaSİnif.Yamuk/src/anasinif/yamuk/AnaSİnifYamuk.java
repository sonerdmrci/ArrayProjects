
package anasinif.yamuk;

import java.util.Scanner;

public class AnaSİnifYamuk {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Taban Giriniz :");
        int taban = scan.nextInt();
        System.out.print("Tvan Giriniz :");
        int tavan = scan.nextInt();
        System.out.print("Yükseklik Giriniz :");
        int yukseklik = scan.nextInt();
        yamuk hesap = new yamuk(taban,tavan,yukseklik);
        System.out.println("Alan :"+hesap.alanHesapla());
    }
    
}
