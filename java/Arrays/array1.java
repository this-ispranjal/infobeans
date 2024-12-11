// package Arrays;
// Arrays
/*  new keyword for momoery alocation
 * 
 * arry is a collection of multipule value stored together in memory and all would be of same data type. that'is up array is an collection  homogenuous data types ,where we would use index no. to acces them which start from 0 . The last index value will be n-1.
 * 
 *  Array de
 * int a[] = new int[n];
 * 
 * 
 * 
 * 
 * data typees in c 
 * primary and 
  */

import java.util.Scanner;
class test {

    static void mergeTwo(){
  
        // !  WAP to MErge  two arrays....
      Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array n ");
        int n = sc.nextInt();
        System.out.println("Enter the length of array m");
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        
        
        for(int i = 0 ;i<n;i++){
            System.out.println("Entre " + (i+1) + " the no...");
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<m ;i++){
            System.out.print("Entre " + (i+1) + " the no...");
            b[i] = sc.nextInt();
        }
        int c[]= new int[n+m];
        //  adding the 
        for(int i = 0 ;i<a.length ; i++){
            c[i] = a[i];
            // System.out.print(c[i]);
        }
        for(int i = 0;i<b.length;i++){
            c[n+i] = b[i];
            // System.out.print(c[n+i]);
        }
        for(int i = 0;i<c.length;i++){
            System.out.print(c[i] + ", ");
        }
        

}

    static void reverse(){
      int ar[] = {1,23,4,5,43};

      for(int i = 5;i>0;i--){
        System.out.print(ar[i]);
      }
    }


    static void StudentsData(){
        Scanner sc = new Scanner (System.in);
        System.out.print("---entre a no. of students --> ");
          int n = sc.nextInt();
        int rol[] = new int [n];
        float m1 []  = new float[n];
        float m2 [] = new float[n];
        float m3[] = new float[n];
        float totol[] = new float [5];
        float hi = 0f;
        float avg [] = new float [5];
        float max [] = new float[5] ;
        for(int i = 0;i<5;i++){
            
            System.out.print("entre a first no");
            m1[i] = sc.nextInt();
            System.out.print("entre a second no");
            m2[i] = sc.nextInt();
            System.out.print("entre a third no");
            m3[i] = sc.nextInt();
        }
        for(int i = 0 ;i<5;i++){
          totol[i] = m1[i] + m2[i] + m3[i];
          avg[i] = totol[i]/3;
    
          if(m1[i]>max[i]){
            max[i]=m1[i];
          }
          if(m2[i]> max[i]){
             max[i]=m3[i];
          }
          if(m3[i]>max[i]){
             max[i]=m3[i];
          }
        }
      int i ;
        for( i = 0 ;i<5;i++){
          System.out.print(" TOTAL of "+(i+1)+" Sub is---> " +totol[i] + " ,");
    
         if(totol[i]>hi){
           hi = totol[i];
         }
         
          System.out.println();
    
          System.out.print(" Avg of "+(i+1)+" Sub is---> " +avg[i] + " ,");
          System.out.println();
    
           System.out.println();
    
        }
         System.out.print(" max of "+" Sub is---> " + hi );
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        StudentsData();

        
        // first array program
        // System.out.print("entre a no------");
        // int s = sc.nextInt();
        // int a[] = new int[s];
        // a[0] = 1;
        // a[1] = 2;
        // a[2] = 10;
        // a[3] = 13;
        // a[4] = 40;
        // System.out.println("Elements --> "+ a[0]);
        // System.out.println("Elements --> "+ a[1]);
        // System.out.println("Elements --> "+ a[3]);
        
        
        
        
        // // second progrmo 
        // int age[] = new int[3];
        // int i ;
        // int j = 0;
        // for(i = 0 ;i<3;i++){
            
        //     System.out.print("entre age for "+ i + " Students ");
            // age[i] = sc.nextInt();
            // i++;
        // }
        
        //  for(i = 0 ;i<3;i++){
        //     System.out.println("Age of "+ (i+1) + " Students " + age[i] );
            
        // }
        
        
        // 1. WAP to Print  only even nos. from an integer array

        // for(int i = 0 ;i<ary.length;i++){
        //     // System.out.println("Entre no. the no...");
        //     ary[i] = sc.nextInt();
        // }
        
        
        // 1. WAP to Print  only even nos. from an integer array
        
        // for(int i = 0;i<ary.length;i++){
            
         
        //     if(ary[i]%2==0){
        //         System.out.println(ary[i]);
        //     }
        // }
        

        // 3. WAP to print Average of all array elements
    // sum = ary[0];
    
    // for(int i = 0 ;i<s;i++){
            
    //     sum+=ary[i];
    // }

    // int avg = sum/s;
    // System.out.print("Average  of the array is " + (avg));
        

    // 4. WAP to print to print array elements which are multiples of 23
    
    // for(int i = 0 ;i<s;i++){
    //     if(a[i]%23==0){
    //         System.out.println(a[i] + " and it's index is " + (i+1));
    //     }
    // }


    // 5 . WAP to replace all odd positions array values with 0

    // for(int i = 0 ;i<s;i=2+i){
    //     a[i] =0;
    //     System.out.println(" The new update array is-- " + a[i] +"  at index " + (i+1));
    // }



     // 8. WAP to update all array elements with 10
    
    //  for(int i = 0 ;i<s;i++){
    //     a[i] = 10;
    //     System.out.println("Updated array is --" +  a[i]);
    // }

    
    }
}