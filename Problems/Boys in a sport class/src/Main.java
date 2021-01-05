import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean x = ((a >= b)&&(b>=c))||((a==b)||(b==c));
        System.out.println(x);
    }
}