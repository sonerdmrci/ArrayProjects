
package array_alininsirasi;

public class Array_alininSirasi {

    public static void main(String[] args) {
        //boy sıralamasında Ali kaçıncı sıradadır en uzun 1. sıradan başlar.
        int[] boylar = new int[]{170,180,175,168,185};
        int uzunlar = 0;
        int alininBoyu = 177;
        for(int i=0; i<boylar.length; i++){
            if(boylar[i]>alininBoyu){
                uzunlar++;
            }            
        }
        int sira = uzunlar + 1;
        System.out.println("Ali "+ sira +". sırada");
        
    }
    
}
