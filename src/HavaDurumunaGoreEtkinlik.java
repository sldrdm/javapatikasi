import java.util.Scanner;

public class HavaDurumunaGoreEtkinlik {
    static void main(String[] args) {
        int sicaklik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Hava sıcaklık değerini giriniz: ");
        sicaklik = inp.nextInt();
        if (sicaklik <= 5) {
            System.out.println("Kayak tatiline gidebilirsiniz.");
        }
        else if (sicaklik > 5 && sicaklik <= 15) {
            System.out.println("sinemaya gidebilirisiniz");
        }
        else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("pikniğe gidebilirisiniz");
        }
        else if (sicaklik>25 && sicaklik<=35) {
            System.out.println("yüzmeye gidebilirisiniz");
        }

    }
}
