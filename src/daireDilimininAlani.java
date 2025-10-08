import java.util.Scanner;

public class daireDilimininAlani {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        double r;
        double alfa;
        double PI=3.14;
        double alan;
        System.out.println( "dairenin yariçapını giriniz :");
        r= input.nextInt();
        System.out.println("açıyi giriniz: ");
        alfa= input.nextInt();
        alan=(alfa*(r*r)*PI)/360;
        System.out.println( "alan: "+alan);

    }
}
