import java.util.Scanner;

class test{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Entre the no. of row you want ---> ");

       int n = sc.nextInt();
        int k = 0;
       for(int i = 1 ; i <=n;i++){

        int res = i<=5? k++: k--;
        for(int j = 1 ; j<=n; j++){
           if(j<=6-k || j>=4+k){
            System.out.print("*");
           }else{
            System.out.print(" ");
           }
        }
        System.out.println();
       }
    }
}