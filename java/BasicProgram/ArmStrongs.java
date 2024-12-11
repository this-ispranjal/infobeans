import java.util.Scanner;

class test{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre a no --->");
		int n = sc.nextInt();
		// int t1 = n;
		int length=0;
	for(int i = 1 ;i<=n;i++){
		int temp = i;
		for( int t1 = i;t1>0;t1/=10){
			length += 1;
		}
		   int arm =0 , rem ;
		
		 for(int t2 = i ; t2>0;t2/=10){
			 rem = t2%10;

			 int max = 1;

			 for(int p = 1; p<=length;p++){
				max = max * rem;
			 }

			 arm = arm + max;
		 }
		 if (temp == arm) {
            System.out.println( n + " Is an ArmStrong No. " );
			
		 }
	}

	}
}