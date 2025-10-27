import java.util.Scanner;

public class sifreKontrol {
    static void main(String[] args){
        String sifre;
        String yenisifre;
        Scanner inp= new Scanner(System.in);
        System.out.println( "şifreniz: ");
        sifre=inp.nextLine();

        if(sifre.equals("Java123")){
            System.out.println("şifre doğru");
        }
        else{
            System.out.println("yanlış girdiniz");
            System.out.println("yeni sifre giriniz :");
            yenisifre=inp.nextLine();
            if(sifre!=yenisifre){
                System.out.println("şifre kabul oldu");
            }
            else {
                System.out.println("girdiğiniz şifre yanlış yeni şifre belirleyin");
            }

        }

    }
}
