import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1 = scanner.nextInt();
        float y1 = scanner.nextInt();
        float x2 = scanner.nextInt();
        float y2 = scanner.nextInt();
        if ((y2 - y1) / (x2 - x1) == 1 ) {
            System.out.println("YES");
        }
        else if ((y2 - y1) / (x2 - x1) == -1 ) {
            System.out.println("YES");
        }
        else if(x1 == x2 || y1 == y2) {
            System.out.println("YES");
        }
        else if(x1 == x2 && y1 == y2){
            System.out.println("YES");
        }
        else{System.out.println("NO");}



    }

}