import java.util.Scanner;

public class hipotenusBulanProgram {
    public static void main (String[]args){
        int aKenari,bKenari,cKenariKaresi;
       double cKenari;
        Scanner input= new Scanner(System.in);
        System.out.println("A kenarını Giriniz: ");
        aKenari=input.nextInt();
        System.out.println("B kenarını giriniz: ");
        bKenari= input.nextInt();
        System.out.println("C kenarını için hesaplanıyor : ");
        cKenariKaresi=(aKenari*aKenari)+(bKenari*bKenari);

        System.out.println("c kenarının karesi: "+cKenariKaresi);

        cKenari=Math.sqrt(cKenariKaresi);
        System.out.println("c sayisi: "+cKenari);
    }
}
