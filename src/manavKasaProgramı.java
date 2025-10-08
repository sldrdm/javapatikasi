import java.util.Scanner;
public class manavKasaProgramı {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double Armut = 2.14, Elma = 3.67, Domates = 1.11 , Muz= 0.95, Patlıcan =5.00 ;
        double armutKg, elmaKg,domateskg,muzKg,patlıcanKg;
        Double total;
        System.out.println("alınan armut bilgisinini giriniz :");
        armutKg= input.nextDouble();
        System.out.println("alınan elma bilgisinini giriniz :");
        elmaKg= input.nextDouble();
        System.out.println("alınan domates bilgisinini giriniz :");
        domateskg= input.nextDouble();
        System.out.println("alınan muz bilgisinini giriniz :");
        muzKg= input.nextDouble();
        System.out.println("alınan patlıcan bilgisinini giriniz :");
        patlıcanKg= input.nextDouble();
        total=(armutKg*Armut)+(elmaKg*Elma)+(domateskg*Domates)+(muzKg*Muz)+(patlıcanKg*Patlıcan);
        System.out.println("total tutar :"+total);
    }
}
