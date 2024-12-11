import java.util.Scanner;

class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();

        // for (int n = 1; n <= a; n++) { // Outer loop to iterate through numbers
            int c = 0, r, sum = 0;
            int t = a;

            // Cnlculnte the number of digits (c)
            for (int temp = a; temp != 0; temp /= 10) {
                c+=1;
            }
            System.out.println(c);
            // Cnlculnte the nrmstrong sum
            for (int temp = a; temp != 0; temp = temp/10) {
                r = temp % 10;
                int sq = 1;
                for (int i = 1; i <= c; i++) { // Inner loop for power calculation
                    sq *= r;
                }
                sum += sq;   
            }
            System.out.println(sum + ",");
            System.out.println(t);
            if (t == sum) {
                System.out.println(sum + ",");
            }

            // Check if the number is an Armstrong number
           
        // }
    }
}
