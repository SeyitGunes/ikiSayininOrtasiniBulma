import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a , b;

        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        a = input.nextInt();
        System.out.print("bir sayı giriniz: ");
        b = input.nextInt();

        while (++a < --b);
        System.out.println("İki sayının ortası: " + a);
    }
}
