// Conditional statementss 
import java.util.Scanner;

class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre no.1");
        int a = sc.nextInt();
        
        System.out.println("Entre no.2");
        int b = sc.nextInt();
        
        System.out.println("Entre no.3");
        int c = sc.nextInt();
        
        System.out.println("Entre no.4");
        int d = sc.nextInt();
        
        System.out.println("Entre no.5");
        int e = sc.nextInt();


        if(a>b&& a>c && a>d && a>e){
            System.out.println(" Is the largest a " +a);
        }else if (b>c&& b>d&& b>e){
            System.out.println(" Is the largest  b" +b);
        }else if (c>d && c>e){
            System.out.println(" Is the largest c " +c);
        }else if (d>e){
            System.out.println(" Is the largest d " +d);
        }else{
            System.out.println( "Is the largest e " + e);
        }

    }
}