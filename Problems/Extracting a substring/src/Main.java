import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        a = a.substring(first,second+1);
        System.out.println(a);
    }
}