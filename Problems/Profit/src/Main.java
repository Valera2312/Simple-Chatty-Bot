import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        double M = scanner.nextInt();
        double P = scanner.nextInt();
        double K = scanner.nextInt();
        double n = 1;
        P = P/100;
        double t = (Math.log(K)-Math.log(M))/(n*Math.log(n+P/n));
        String result = String.format("%.0f",Math.ceil(t));
        System.out.println(result);

    }
}