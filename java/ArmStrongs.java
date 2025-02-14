import java.util.Scanner;
class test{
    public static void main(String args[]){
        
        int length =0,no;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Entre a no. -----> : ");
        no = sc.nextInt();
        int t1 = no;
// for loop way is also very easy 
        // for counting the length of the given words
        while(t1!=0){



            t1 = t1/10;
            length = length + 1;
        }

        // Now doing the sum


        int t2 = no; 
        int arm = 0, rem;
        while(t2!=0){
            rem = t2%10;
            int multi = 1;

            for (int i = 0; i < length; i++) {
                multi = multi *rem;
            }
            t2 = t2/10;
            arm = arm+ multi;
        }

        if(arm == no){
            System.out.println("ArmStrong No. ");
        }else{
            System.out.println("NOt an ArmStrongs");
        }
        
    }
}

