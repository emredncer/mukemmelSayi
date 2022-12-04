import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        int basla = 0 , ekle = 0 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        for (int i = 1 ; i < sayi ; i++){
            basla ++;
            if (sayi % basla == 0){
                ekle += basla;
            }
        }if (ekle == sayi){
            System.out.print(sayi+" Sayisi mükemmel bir sayıdır");
        }else {
            System.out.println(sayi+" Sayısı mükemmel bir sayı değildir");
        }
    }
}
