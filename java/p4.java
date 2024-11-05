import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Entre the no. of row --> ");
        int n = sc.nextInt() ;
        System.out.print("Entre the no. of calumn --> ");
        int m = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for (int j = 1 ; j<=m;j++){
                if(i == 1 || j == 1 || i==n || j==m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}