/*   1. Break
    2. Continous 
    3. Return
 */
import java.util.Scanner;
  public  class Pascals {
  public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   System.out.print("Entre a no. of row u wants");
   int b= 5;
     int p;
     for(int i = 1 ; i<=b;i++){  // row
         for(int j = b;j>=i;j--){
            System.out.print(" ");
         }
      
              p = 1;
         for(int k = 1; k<=i;k++){
            System.out.print(p + "  ");
            p = p*(i-k)/k;
         }
         System.out.println();
      }

//       int rows = 5;

//         for (int i = 0; i < rows; i++) {

//             int number = 1;

//             System.out.printf("%" + (rows - i) * 2 + "s", ""); // For spacing

//             for (int j = 0; j <= i; j++) {

//                 System.out.printf("%4d", number);

//                 number = number * (i - j) / (j + 1);

//             }

//             System.out.println();

//         }
  }
}
