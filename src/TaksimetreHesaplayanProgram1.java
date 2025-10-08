import java.util.Scanner;

public class TaksimetreHesaplayanProgram1 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        double yol;
        double kmBasiUcret=2.20;
        double tutar;
        double acılısUcret=10;
        System.out.println("Toplam yolu giriniz: ");
        yol=input.nextInt();
        tutar=(kmBasiUcret*yol)+acılısUcret;
        tutar= (tutar<20) ? 20:tutar;
        System.out.println("tutar : "+tutar);



    }
}
