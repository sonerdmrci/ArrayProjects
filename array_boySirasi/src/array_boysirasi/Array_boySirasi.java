
package array_boysirasi;

public class Array_boySirasi {

    public static void main(String[] args) {
        
        //1- Ali boy sıralamasında kaçıncı sıradadır en uzun 1. sıradadır.
        //2- Ali ile aynı boyda olanları bulunuz.
        //3- Alinin olabileceği sıra aralığını bulunuz.
        int[] boy = new int[]{170,180,175,190,185,175,188,175,195};
        int aynıBoy = 0;
        int uzunOlanlar = 0;
        int alininBoyu = 175;
        for(int i=0; i<boy.length; i++){
            if(boy[i] > alininBoyu) uzunOlanlar++;
            else if(boy[i] == alininBoyu) aynıBoy++;
        }
        int siraAlt = uzunOlanlar;
        int siraUst = uzunOlanlar + aynıBoy;
        System.out.println("Ali "+ siraAlt +" ile "+ siraUst +" Arasındadır.");
        
    }
    
}
