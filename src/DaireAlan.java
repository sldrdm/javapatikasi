import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args){
        int r;
        double alan;
        double PI=3.14;
        double cevre;
        Scanner input= new Scanner(System.in);
        System.out.println( "Dairenin yarıçapı bilgisini giriniz: ");
        r= input.nextInt();
        alan=((double)r*r)*PI;

        System.out.println("alan: "+alan);

cevre=(r*PI)*2;
        System.out.println("çevre: "+cevre);
    }
}
