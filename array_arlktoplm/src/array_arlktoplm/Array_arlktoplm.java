
package array_arlktoplm;

public class Array_arlktoplm {

    public static void main(String[] args) {
        //1.En büyük sayıyı bul
        //2.En küçük sayıyı bul
        //3.en büyük sayı ile en küçük sayı arasındaki sayıların toplamı
        int[] sayi = new int[]{100,15,10,45,5,11,25};
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
        int sum = 0;
        if(sirak<sirab) for(int i=sirak+1; i<sirab; i++ ){
            sum +=sayi[i];
        }else{
            for(int i=sirab+1; i<sirak; i++){
                sum +=sayi[i]; 
            }
        }
            System.out.println("En Büyük Sayı İle En Küçük Sayı Arasındaki Sayılar Toplamı :"+sum);
    }
    
}
