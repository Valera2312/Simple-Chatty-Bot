import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int high = scanner.nextInt();
        int count = scanner.nextInt();
        //boolean YesOrNo = false;
        int number = 0;
        int i = 1;




        while(true){

            int bridge = scanner.nextInt();
            if(bridge==high||high>bridge){
                number = i;
                break;
            }


            i++;
        }
        if(number!=0){
            System.out.println("Will crash on bridge "+ number);
        }else {
            System.out.println("Will not crash");
        }
    }
}