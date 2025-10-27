public class compare {
    public static void main(String[] args) {
        int a = 5, b = 4;
        boolean compare = a == b;
        String str = (compare) ? "eşittir" : "eşit değildir";

        System.out.println(str);
        if (compare) {
            System.out.println("eşittir");
        } else {
            System.out.println("yanlıştır");
        }
    }
}
