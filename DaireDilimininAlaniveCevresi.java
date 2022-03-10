//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanını ve çevresini bulan program
import java.util.Scanner;

public class DaireDilimininAlaniOdev {
    public static void main(String[] args) {
        double r, pi=3.14,aci,alan,cevre;
        Scanner input= new Scanner(System.in);
        System.out.println("Dairienin Yarıçapını Giriniz: ");
        r= input.nextDouble();
        System.out.println("Daire Diliminin Açı Ölçüsünü Giriniz: ");
        aci= input.nextDouble();
        
        alan=(pi*(r*r)*aci)/360;
        cevre=(2*pi*r*aci)/360;
        
        System.out.println("Daire Diliminin Alanı: "+alan);
        System.out.println("Daire Diliminin Çevresi: "+cevre);
    }
}
