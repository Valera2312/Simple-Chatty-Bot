import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int i = 0;
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if(n==0){
                break;
            }
            arr[i] = n;
            i++;


        }
        for (int j:arr) {
            if(j==0){break;}
            if(j % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}