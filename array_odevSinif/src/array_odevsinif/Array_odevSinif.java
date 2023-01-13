
package array_odevsinif;

import java.util.Scanner;

public class Array_odevSinif {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ogrsayisi ;
        
        System.out.print("Öğrenci Sayısını Giriniz :");
        ogrsayisi = scan.nextInt();        
            int no;
            String[] adi= new String[ogrsayisi];
            String soyadi;
            int vize ;
            int ffinal;
            double[] ortalama = new double[ogrsayisi];
            int altmisUstu = 0, altmisAlti = 0, j, i;            
            for(i = 0; i<ogrsayisi; i++){            
            //System.out.print("Öğrencinin Numarasını Giriniz :");
            //no = scan.nextInt();
            System.out.print("Öğrencinin Adını Giriniz :");
            adi[i] = scan.next();
            //System.out.print("Öörencinin Soyadını Giriniz :");
            //soyadi = scan.next();
            System.out.print("Vize Notunu Giriniz :");
            vize = scan.nextInt();
            System.out.print("Final Notunu Giriniz :");
            ffinal = scan.nextInt();
            double ort = 1.0*((vize* 0.4 ) + (ffinal * 0.6));
            if(ort>=60) altmisUstu++;
            if(ort<60) altmisAlti++;
            ortalama[i] = ort;
            
            }
            String[] list1 = new String[altmisUstu];
            String[] list2 = new String[altmisAlti];
            for(j=0; j<ortalama.length; j++){
                if(ortalama[i]>=60){
                    list1[j] = adi[i];
                }
            }
                for(int b=0; b<ortalama.length; b++){
                if(ortalama[i]>=60){
                    list2[b] = adi[i];
                }
                }
            for(int a=0; a<list1.length; a++){
                System.out.println(list1[a]);
            }
                
            
    }
}
