import java.util.Scanner;

class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      String a = scanner.next();
      //String a1 =   a.substring(0,1);
      //String a2 = a.substring(3,4);
        // System.out.println(a.substring(3,4));
      if(a.substring(0,1).equals(a.substring(3,4))){
          if(a.substring(1,2).equals(a.substring(2,3))){
                System.out.println(1);
            }else {
              System.out.println(10);
          }

      }else{
          System.out.println(10);
      }


    }
}