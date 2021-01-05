import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.endsWith("burg")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}