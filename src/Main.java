import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Harcamanızı giriniz: ");

        double tutar = input.nextDouble();
        double kdvOran;
        if (tutar > 1000) {
            kdvOran = 0.08;
        } else {
            kdvOran = 0.18;
        }
        double kdvTutari = tutar * kdvOran;
        double kdvDahilTutar = tutar + kdvTutari;
        System.out.println("-------------------------------------");
        System.out.println("KDV Oranı:           %" + (kdvOran * 100));
        System.out.println("KDV'siz Tutar:       " + tutar + " TL");
        System.out.println("Uygulanan KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("KDV Dahil Toplam Tutar: " + kdvDahilTutar + " TL");
        input.close();
    }
}