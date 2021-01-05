import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        char[] chars = a.toCharArray();
        for (char b :chars){
            if(b=='a'){
            b  = (char) (b + 1);
            }
            System.out.print(b);
        }
    }
}