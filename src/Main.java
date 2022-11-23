import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int x, sayi, i;


        Scanner scan = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        x = scan.nextInt();
        System.out.print("Ussunu giriniz: ");
        sayi = scan.nextInt();
        int total = 1;

        for (i = 0; i < sayi; i++) {
            total *= x;
        }
        System.out.println("Sonuc= " + total);
    }
}