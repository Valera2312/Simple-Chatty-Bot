import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int i = 0;
        int[] xarr = new int[10];

        for(int x = 0;x<=1000;x++){

            if((a*Math.pow(x,3))+(b*Math.pow(x,2))+(c*x)+d==0){

               xarr[i] = x;
                i++;
            }
        }
            for (int m : xarr)
            {
                if(m==0){break;}
                System.out.println(m);
            }


        }

    }
