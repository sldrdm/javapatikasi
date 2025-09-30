import java.util.Scanner;


public class Main
{
    public static void main(String[] args){
        int math,fizik, kimya,turkce,muzik, tarih;
        System.out.println("math puanınızı giriniz: ");
        Scanner inputmath =new Scanner(System.in);
         math= inputmath.nextInt();
        System.out.println(math);

        System.out.println("fizik puanınızı giriniz: ");

        fizik= inputmath.nextInt();
        System.out.println(fizik);

        System.out.println("kimya puanınızı giriniz: ");

         kimya= inputmath.nextInt();
        System.out.println(kimya);
        System.out.println("Türkçe puanınızı giriniz: ");

         turkce= inputmath.nextInt();
        System.out.println(turkce);
        System.out.println("tarih puanınızı giriniz: ");

         tarih= inputmath.nextInt();
        System.out.println(tarih);
        System.out.println("Muzik puanınızı giriniz: ");

         muzik= inputmath.nextInt();
        System.out.println(muzik);
        int toplam ;
        toplam=math+fizik+kimya+turkce+muzik+tarih;
        System.out.println("toplam : " + toplam);
        int ort;
        ort= toplam /6;


        System.out.println("ortalama :" +ort);
        if(ort>60)
        {
            System.out.println("Sınıfı geçti");
        }
        else {
            System.out.println("Sınıfta kaldı ");
        }
    }
}