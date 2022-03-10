/* Kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
       toplam tutarını ekrana yazdıran program
   Meyve kg fiyatları: Armut : 2,14 TL
                       Elma : 3,67 TL
                       Domates : 1,11 TL
                       Muz: 0,95 TL
                       Patlıcan : 5,00 TL  */

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutkg=2.14, elmakg=3.67, domateskg=1.11, muzkg=0.95, patlicankg=5.00;
        double armut,elma,domates,muz,patlican,tutar;
        Scanner input= new Scanner(System.in);

        System.out.println("Kaç Kilo Elma Aldınız? ");
        elma= input.nextDouble();
        System.out.println("Kaç Kilo Armut Aldınız? ");
        armut= input.nextDouble();
        System.out.println("Kaç Kilo Domates Aldınız? ");
        domates = input.nextDouble();
        System.out.println("Kaç Kilo Muz Aldınız? ");
        muz= input.nextDouble();
        System.out.println("Kaç Kilo Patlıcan Aldınız? ");
        patlican= input.nextDouble();

        tutar= (elma*elmakg+armut*armutkg+domates*domateskg+muz*muzkg+patlican*patlicankg);
        System.out.println("Toplam Tutarınız: "+tutar);
    }
}
