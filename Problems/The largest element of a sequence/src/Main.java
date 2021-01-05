import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int[] myArray = new int[1000000];
        int max = 0;
        int i = 0;
        while(true){

            int elem = scanner.nextInt();
            myArray[i] = elem;
            if(elem==0){
                for (int a:myArray) {
                    if(a>max){
                        max = a;
                    }
                }
                break;
            }
            i++;
        }
        System.out.println(max);
    }
}