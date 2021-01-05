import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int e = 0;
        for(int i = 0;i<=count;i++){
            for(int j = 0;j<i;j++){
                e++;
                System.out.print(i+" ");
                if(e==count){
                    break;
                }
            }
            if(e==count){
                break;
            }
        }


    }
}
