import java.util.Scanner;  
 class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a any no. ");

        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j = 1 ; i <= j ;j++){
               for(int k = 1 ; k<=n;k++){
                System.out.print("*");
               }
            System.out.print("");

            }
            System.out.println();
        }

    }
}