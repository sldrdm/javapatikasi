import java.util.Scanner;

public class vucutKitleIndeks {
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);
        double kilo;
        double boy;
        double index;
        System.out.println("kilonuzu girin :");
        kilo=input.nextDouble();
        System.out.println("boyunuzu metre olarak giriniz:");
        boy=input.nextDouble();
        index=kilo/(boy*boy);
        System.out.println(" vucut kilo indexiniz: "+index);
    }
}
