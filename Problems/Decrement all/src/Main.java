import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[4];
        for (int i = 0;i < 4;i++){
             myArray[i] = scanner.nextInt();

        }
        for (int d : myArray){
            System.out.print( --d + " " );
        }
    }
}