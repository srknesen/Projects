import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
         int mat, fiz, kim, tur, tar, muz;
         Scanner input= new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz: ");
        mat= input.nextInt();
        System.out.println("Fizik Notunuzu Giriniz: ");
        fiz= input.nextInt();
        System.out.println("Kimya Notunuzu Giriniz: ");
        kim= input.nextInt();
        System.out.println("Turkce Notunuzu Giriniz: ");
        tur= input.nextInt();
        System.out.println("Tarih Notunuzu Giriniz: ");
        tar= input.nextInt();
        System.out.println("Muzik Notunuzu Giriniz: ");
        muz= input.nextInt();

        int toplam=(mat+fiz+kim+tur+tar+muz);
        double sonuc=toplam/6.0;
        System.out.println("Ortalamanız : "+sonuc);
        String durum = sonuc>=60 ? "Sınıfı Geçti": "Sınıfta Kaldı";
        System.out.println(durum);

    }
}
