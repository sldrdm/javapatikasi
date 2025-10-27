import java.util.Scanner;

public class SinifKontrolu {
    static void main(String[] args){
        int mat,turkce,kimya,fizik,muzik;
        Scanner inp=new Scanner(System.in);
        System.out.println("matematik notunuzu giriniz: ");
        mat= inp.nextInt();

        System.out.println("turkce notunuzu giriniz: ");
        turkce= inp.nextInt();

        System.out.println("kimya notunuzu giriniz: ");
        kimya= inp.nextInt();

        System.out.println("fizik notunuzu giriniz: ");
        fizik= inp.nextInt();

        System.out.println("müzik notunuzu giriniz:  ");
        muzik= inp.nextInt();

        double avarage=(mat+fizik+turkce+muzik+kimya)/5;
        if(avarage>55){
            System.out.println("Geçtiniz.  ");
        }
        else {
            System.out.println("kaldınız.Seneye yeniden dene ");
        }
        System.out.println("Ortalamanız :  "+avarage);
    }
}
