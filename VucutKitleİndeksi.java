// Kullanıcıdan boy ve kilo değerlerini alıp "Vücut Kitle Endeksi"ni bulan program
// Vücut-Kitle Endeksi= Kilo(kg) / Boy(m)* Boy(m)

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double index, boy, kilo;
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre) giriniz: ");
        boy= input.nextDouble();
        System.out.println("Lütfen Kilonuzu (kg) giriniz: ");
        kilo= input.nextDouble();
        index= kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+index);
    }
}
