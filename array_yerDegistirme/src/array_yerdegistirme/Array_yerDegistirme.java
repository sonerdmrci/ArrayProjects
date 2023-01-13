
package array_yerdegistirme;

public class Array_yerDegistirme {

    public static void main(String[] args) {
        //1-En büyük sayıyı bul
        //2-En küçük sayıyı bul
        //3-Yer Değiştir
        int[] sayi = new int[]{10,15,5,45,65,11,25};
        for(int i=0; i<sayi.length; i++) System.out.print(sayi[i]+" ");
        int enbsayi = sayi[0],enksayi = sayi[0],sirab = 0, sirak = 0;
        for(int i=0; i<sayi.length; i++){
            if(sayi[i]>enbsayi){
                enbsayi = sayi[i];
                sirab = i;
            }
        }
        System.out.println();
        for(int i=0; i<sayi.length; i++){
            if(sayi[i]<enksayi){
                enksayi = sayi[i];
                sirak = i;
            }
        }
        int temp = sayi[sirab];
        sayi[sirab] = sayi[sirak];
        sayi[sirak] = temp; // =sayi[sirab]
        for(int i=0; i<sayi.length; i++) System.out.print(sayi[i]+" ");

}
    
}
