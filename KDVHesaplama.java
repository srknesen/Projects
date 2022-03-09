/* Kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını
  (Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı) hesaplayıp ekrana bastıran program */

import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        double tutar, kdv, kdvlitutar, kdvorani;
        Scanner input= new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz: ");
        tutar= input.nextDouble();

        kdvorani = tutar<=1000 ? 0.18:0.08;
        kdv= kdvorani*tutar;
        kdvlitutar=kdv+tutar;


        System.out.println("Girilen Tutar: "+tutar);
        System.out.println("KDV Oranı "+kdvorani);
        System.out.println("KDV Tutarı "+kdv);
        System.out.println("Toplam Tutar: "+kdvlitutar);
    }
}
