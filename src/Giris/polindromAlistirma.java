package Giris;

public class polindromAlistirma {

    public static boolean isPalindrome(int save) {

        int temp = save, reverseNumber = 0, lastNumber;


        while (temp != 0) {
            System.out.println("sayi :" + temp);
            lastNumber = temp % 10;
            System.out.println("son basamak"+ lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;

            temp /= 10;
            System.out.println("yeni sayi :"+reverseNumber);
        }
        return true;
    }

    public static void main(String[] args) {

        isPalindrome(1456);
    }
}


