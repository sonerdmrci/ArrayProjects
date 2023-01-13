
package array_notebook;

import java.util.Scanner;

public class Array_notebook {

    
    public static void main(String[] args) {
        /*bir ogertmen sınıftaki ogrencilerin defter ihtiyacını 
        karsilamak icin getirdiği defter sayısını giriniz ve  
        karsıladıgı ogrenci sayisini bulunuz        
        */
        Scanner scan = new Scanner (System.in);
        int totalNotebook = scan.nextInt();
        int[] Class = new int[]{1,2,2,3,5,5,7,8};
        int counter = 0; //sayaç
        for(int i=0; i<Class.length; i++){
            if(Class[i]<=totalNotebook){
            totalNotebook -= Class[i];
            counter++;
            }else break;
        }
        if(counter == Class.length){
            System.out.println("Tüm Öğrencilerin Defter İhtiyacı Karşılandı");
        }else{
            System.out.println(counter + " Öğrencinin ihtiyacı karşılandı");
        }
    }
    
}
