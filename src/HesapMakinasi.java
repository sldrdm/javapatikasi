import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayiyi giriniz: ");
        n1 = scanner.nextInt();
        System.out.println("ikinci sayiyi giriniz : ");
        n2 = scanner.nextInt();
        System.out.println("1 Toplama \n 2 çıkartma \n 3 çarpma \n 4 bölme");
        System.out.println("Seçiminizi giriniz :");
        select = scanner.nextInt();
        System.out.println(select);
        switch (select) {
            case 1:
                System.out.println("toplam =" + (n1 + n2));
                break;
            case 2:
                System.out.println("çıkartma= " + (n1 - n2));
                break;
            case 3:
                System.out.println("çarpım= " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("hatali giriş yaptiniz");
                }
                System.out.println("bolme= " + (n1 / n2));
                break ;

        }


    }
}

