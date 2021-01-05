import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int max = 0;
        for (int i=0; i<size ;i++ ){
            array[i]= scanner.nextInt();
        }
        for (int i =0;i<array.length;i++){
            if(max<array[i]&&array[i]%4==0){
                max = array[i];
            }
        }
        System.out.println(max);


    }
}