import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elem = scanner.nextInt();
        System.out.print(elem+" ");

        while (true) {

            if(elem==1){break;}

            else if(elem % 2 == 0 ){
                elem = elem/2;
                System.out.print(elem + " ");

            }else{
                elem = elem * 3 + 1;
                System.out.print(elem + " ");
            }

        }
    }
}