//Üç kenar uzunluğunu kullanıcıdan aldığımız üçgenin alanını hesaplayan program
import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        double a,b,c,u,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk kenarı giriniz: ");
        a= input.nextDouble();
        System.out.println("İkinci kenarı giriniz: ");
        b= input.nextDouble();
        System.out.println("Üçüncü kenarı giriniz: ");
        c= input.nextDouble();

        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı:"+alan);
    }
}
