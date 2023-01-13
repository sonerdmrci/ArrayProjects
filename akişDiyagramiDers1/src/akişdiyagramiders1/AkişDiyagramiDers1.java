package akişdiyagramiders1;

import java.util.Scanner;
public class AkişDiyagramiDers1 {
    
    public static void main(String[] args) {
       Scanner oku = new Scanner(System.in);
       int s=1, sayi, enB= 0;
       while (s<=5){
           System.out.print("Bir Sayı Giriniz :");
           sayi = oku.nextInt();
           if(sayi > enB){
               enB = sayi;
           }
           s++;
           }
       System.out.println("En Büyük Sayı :"+ enB);
    }
    
}
