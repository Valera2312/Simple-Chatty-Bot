import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float start = scanner.nextInt();
        float end = scanner.nextInt();
        float sum = 0;
        float counter = 0;


        for (float i = start; i <= end; i++){
            if(i % 3 == 0){
                sum+=i;
                counter++;
            }

        }
        System.out.println(sum/counter);

    }
}