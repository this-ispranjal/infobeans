import java.util.Scanner;

class test{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        /*   For Loop Practice Questions:
        Q1.  Print all numbers from 1 to 50 that are divisible by 4 using a for loop.
        */


        // System.out.print("Entre a range of no. ---> ");
        // int  n = sc.nextInt();



        // int sum =0 ;
        // for(int i =1;i<=n;i++){
        //    if(i%4==0){
        //     System.out.println(i);
        //     sum+=1;
        //    }
        // }
        // System.out.print(" And the total divible are ---> "+sum);

        // -----------------------------------------------------------------------

        /*Q2. Calculate and print the factorial of a number (given by the user) using a for loop.  */

        // int f = 1;
        // for(int i = 1; i<=n;i++){
        //     f = f*i;
        // }

        // System.out.println("The factorial of "+ n +" is --> "+ " "+f);

        // ------------------------------------------------------------------------

        /*Q3. Print all prime numbers from 1 to 100 using a for loop. */

         // This is for know indivdual no. 


        // int count = 0;
        // if(n!=0){
        //     for(int i = 1 ; i <=n ; i++){
        //         if(n%i==0){
        //             count++;
        //         }
        //     }
        //     if(count==2){
        //         System.out.println("its prime no.");
        //     }
        //     else{
        //         System.out.println("not prime");
        //     }
        // }

        // -------------------             -------------------------           ------------------        

        // for knowing n to an


        // for(int i = 1;i<=n;i++){
        //     int c = 0;

        //     for(int j = 1 ; j<=i; j++){
        //         if(i%j==0){
        //             c++;
        //         }
        //     }
        //     if(c==2){
        //         System.out.println(i );
        //     }
        // }
        
        // ------------------------------------------------------------------------
        

        /* Q4. Find the sum of numbers from 1 to 100 that are multiples of 3 using a for loop.  */

        int sum = 1;
        for(int i = 1 ;i<=n;i++){
           if(i%3==0){
            sum+=i;
           }
        }

        // System.out.println(sum);

        // ------------------------------------------------------------------------

        /* Q5. Print all odd numbers from 1 to a given number (input by user) using a for loop */


        // for(int i = 1; i<=n;i++){
        //     if(i%3==0){
        //         System.out.println(i);
        //     }
        // }






        /*Do-While Loop Practice Questions: 
        Q1.  Take a number input from the user and keep halving it until it becomes less than or equal to 1, using a do-while loop.*/

        //! using for loop 
        // for(int i = n;i>0;i--){
        //     System.out.println(i);
        // }

        // ! using  do while loop

        // do { 
        // System.out.println(n);
        //     n--;

        // } while (n>0);

        // ------------------------------------------------------------------------

        /* Q2. Reverse the digits of a given number (input by the user) using a do-while loop. (Example: 123 → 321) */


        // int reversednumber = 0;
        
        // do {
        //     int lastDigit = n % 10;       
        //     reversedNumber = (reversednumber * 10) + lastDigit; 
        //     n /= 10;                      
        // } while (n > 0);
        
        // System.out.println("Reversed number: " + reversednumber);

        // ------------------------------------------------------------------------

        /*Q3. Print the Fibonacci series up to a given number using a do-while loop. */

        // int a = 0;
        // int b = 1;
        // int f ;
        // int i = 1;

        // do { 
        //     f = a+b;
        //     System.out.println("Fibonacci series up " + n + "is --> " + f);
        //     a = b;
        //     b = f;
        //     i++;
        // } while (i<=n);


        // ------------------------------------------------------------------------

        /*Q.4   Calculate the sum of numbers from 1 to a given number (input by user) using a do-while loop. */

        // int sum = 0;
        // int i =1;
        //  do { 
        //      sum+=i;
        //      i++;
        //  } while (i<=n);

        //  System.out.println("The sum of n is --> " + sum);

        // ------------------------------------------------------------------------


        /* Q5.  Create a number-guessing game where the user has to guess a number between 1 and 10. The program will keep prompting the user to guess until they get it right, using a do-while loop. */


        // int n2 = 8;
        // int n;
        // do { 
        //     System.out.print("Entre a range of no. ---> ");
        //      n = sc.nextInt();
        //     if (n<1||n>10) {
        //         System.out.println("u entre wrong value");
        //     }else if(n==n2){
        //         System.out.println("u r right ");
        //     }
        //     else{
        //         System.out.println("wrong ");
        //     }
        // } while (n2!=n);

        // ------------------------------------------------------------------------

        /* While Loop Practice Questions:
        Q1.  Print all numbers from 1 to 100 that are multiples of 5 using a while loop. */

        // int  sum = 0;
        // int i =1 ;
        // while (i<=n) { 
        //     if(i%5==0){
        //     System.out.println(i);
        //      }
        //     i++;
        // }

                // ------------------------------------------------------------------------


        /* Q2. Print the Fibonacci series up to a given number using a while loop. */

        // int a = 1;
        // int b = 1;
        // int f;
        // int i =1;

        // while(i<=n){
        //     f = a + b ;
        //     System.out.println(f);
        //     a = b;
        //     b = f ;
        //     i++;
        // }
        

        // ------------------------------------------------------------------------

        /* Q3. Calculate the factorial of a given number using a while loop. */

        // int f =1;
        // int i = 1;
        // do{
        //     f= f* i;
        //     i++;
        // }while(i<=n);

        // System.out.println(f);


        // ------------------------------------------------------------------------

        /* Q4. Find and print all Armstrong numbers between 1 and a given number (input by user) using a while loop. */



        // ------------------------------------------------------------------------


        /* Q5. Take a number input from the user and print its square, cube, and square root using a while loop. */

        // int sqr = n*n ;
        // int cube = n*n*n;

        // System.out.println("The sqr of " + n + "--> "+ sqr);
        // System.out.println("The cube of " + n + "--> "+ cube);


        // ------------------------------------------------------------------------


        // Switch-Case Practice Questions:
        /*Q3.   Write a program that takes a month number (1 to 12) and prints the corresponding month name (e.g., 1 = January, 2 = February, etc.) using switch-case. */
        // System.out.println(" year no.");
        // int year = sc.nextInt();

        // int leapYear = 0 ;
        

        // switch (n) {
        //     case 1:
        //         System.out.println("jan");
        //         break;
        //     case leapYear==0?System.out.print("leap"):System.out.println("not leap");

        //         break;
        //     default:
        //         throw new AssertionError();
        // }







        // for (int i = 0; i < 127; i++) {
        //     System.out.println(i + " "+ (char)(i));
        // }



        for(char i = 'a'; i <='z';i++){
            // for(char b = 1; b <= 4;b++){
                System.out.println(i);
            // }
        }
    }
}
