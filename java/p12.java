
import java.util.Scanner;

class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int n ,a ,max = 0;

       for(a = 1 ; a<=4;a++){
        System.out.println("Entre a no. ");
        n = sc.nextInt();
        if (n>max) {
            max = n;
        }
    //    System.out.println (  max);
    System.out.println( " Largest no. is at index "+ n  +" --> "+ max);

       }
       
    }
}