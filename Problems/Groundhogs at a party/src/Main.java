import java.util.Scanner;

class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int countCups = scanner.nextInt();
            boolean x = scanner.nextBoolean();

            boolean y;
            boolean f;
            y =  (countCups >= 15 && countCups <= 25 && x==true);
            f = (countCups >= 10 && countCups <= 20 && x==false);

            if(x){
                System.out.println(y);
            }
            else{System.out.println(f);}



            //System.out.println(y + " " + f);




            //boolean y = ( x==true && countCups >= 15 && countCups <= 25) || (x==false && countCups >= 10 && countCups <= 20);



    }
}