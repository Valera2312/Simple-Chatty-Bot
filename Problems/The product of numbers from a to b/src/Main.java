
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        long sum = 1;
        for (int i = start; i < end; i++){
            sum*=i;
        }
        System.out.println(sum);
    }
}