
package anasinif.yamuk;

public class yamuk {
    int taban;
    int tavan;
    int yukseklik;
    public yamuk(){
        
    }
    public yamuk(int gelentavan,int gelentaban, int gelenyukseklik){
        this.taban= gelentaban;
        this.tavan = gelentavan;
        this.yukseklik = gelenyukseklik;
    }
    public double alanHesapla(){
        return((taban + tavan)*yukseklik)/2;
    }
    
}
