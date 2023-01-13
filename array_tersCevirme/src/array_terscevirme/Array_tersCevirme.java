
package array_terscevirme;

public class Array_tersCevirme {

    public static void main(String[] args) {
        //diziyi ters çevirme
        int[] numbers = new int[]{1,2,5,4,6,8};
        int[] numbers2 = new int[numbers.length];
        for(int i=0; i<numbers.length; i++) System.out.print(numbers[i]+",");
        System.out.println();
        for(int i=0; i<numbers.length; i++){
            numbers2[numbers.length-i-1] = numbers[i];
        }
        for(int i=0; i<numbers.length; i++) System.out.print(numbers2[i]+",");
        System.out.println();
    }
    
}
