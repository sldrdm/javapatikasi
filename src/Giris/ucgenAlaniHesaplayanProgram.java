package Giris;

import java.util.Scanner;

public class ucgenAlaniHesaplayanProgram {
    public static void main(String[] args) {
        int a,b;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.println("1. kenari giriniz :");
        a=input.nextInt();
        System.out.println("2.kenari giriniz: ");
        b=input.nextInt();
        alan= (double) (a * b) /2;
        System.out.println("alan: "+alan);

    }
}