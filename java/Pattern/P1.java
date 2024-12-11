
class test{
	
	public static void main(String args[]){

/* 2468
   2468	
   2468
   2468*/
	// for(int i=1;i<5;i++){
	// 	for(int j=1;j<=10;j++){
	// 	if(j%2==0){
	// 	System.out.print(j);
	// 	}
	// 	}System.out.println();
	// }
	

/* *
    **
    ***
    ****
    ******/

// 02
		// for(int i=1;i<6;i++){
		// 	for(int j=1;j<i;j++){
		// 	System.out.print("*");
			
		// 	}System.out.println();
		// }
	

/*    1
      12
     123
    1234
   12345*/
 // -03
		// for(int i=1;i<6;i++){
		// 	for(int j=4;j>=i;j--){
		// 	System.out.print(" ");
		// 	}
		// for(int k=1;k<i;k++){
		// System.out.print(k);
		// }System.out.println();
		// }	
	
		/*1
      1 2
     1 2 3
    1 2 3 4
   1 2 3 4 5*/
// 04
		// for(int i=1;i<6;i++){
		// 	for(int j=4;j>=i;j--){
		// 	System.out.print(" ");
		// 	}
		// for(int k=1;k<i;k++){
		// System.out.print(" "+k);
		// }System.out.println();
		// }	

/*      *
        * *
       * * *    */
	  // -05
		// for(int i=1;i<6;i++){
		// 	for(int j=4;j>=i;j--){
		// 	System.out.print(" ");
		// 	}
		// for(int k=1;k<i;k++){
		// System.out.print(" *");
		// }System.out.println();
		// }	
	
		/*A
  AB 
  ABC
  ABCD*/
// 06
		// for(int i=65;i<70;i++){
		// 	for(char j=65;j<=i;j++){
		// 	System.out.print(j);
		// 	}System.out.println();
		// }
	
	/*
abcde
abcd
abc
ab
a*/
// 07
		// for(int i=70;i>65;i--){
		// 	for(char j=65;j<=i;j++){
		// 	System.out.print(j);
		// 	}System.out.println();
		// }
	
/*
   1 
  121
 12321
1234321
*/// 08
		// int k; 
        // for (int i = 1; i <= 5; i++) { 
        //     for (int j = 5; j > i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (k = 1; k <= (2 * i - 1); k++) {
        //         System.out.print(k);
        //     }
        //     System.out.println();
        // }
	

// 9
// A
// AB
// ABC
// ABCD
// ABCDE
	// for(int i=65;i<71;i++){
	// 	for(char j=65;j<i;j++){
	// 	System.out.print(j);
	// 	}System.out.println();
	// }			
	
	


// 10
		// for(int i=7;i>=1;i--){
		// 	for(int j=1;j<i;j++){
		// 		System.out.print(j);
		// 	}System.out.println();
		// }	

 // 11
	// for(int i=1;i<5;i++){
	// for(int j=1;j<=i;j++){
	// 	System.out.print(" ");
	// 	System.out.print(j);
		
	// }System.out.println();
	// }
	
	
	
	/*
    1
   121
  12321
 1234321 
*/
	// 12
	// int value=1,i,j,k;
	// for(i=1;i<5;i++){
	// 	for(j=4;j>=i;j--){
	// 		System.out.print("_");}
	//     	for(k=1;k<i;k++){
	//  		System.out.print(k);
	//   	}
	//  	for(int l=i;l>=1;l--){
	//  	 	System.out.print(l);
	//  	 	}System.out.println();
	 	
	// 	}
	

	// 13
	// int b= 5;
	// int p;
	// for(int i = 1 ; i<=b;i++){  // row
	// 	for(int j = b;j>=i;j--){
	// 	   System.out.print(" ");
	// 	}
	 
	// 		 p = 1;
	// 	for(int k = 1; k<=i;k++){
	// 	   System.out.print(p + "  ");
	// 	   p = p*(i-k)/k;
	// 	}
	// 	System.out.println();
	//  }
	
	
	
	
	/*  ******
     *    *
     *    *
     *    *
     ******/
   // 14
		// int i,j;
		// for(i=1;i<=6;i++){
		// 	for (j=1;j<=6;j++){
		// 	if((j==1 || j==6) || (i ==1 || i == 6)){
		// 	System.out.print(" ");
		// 	}else{
		// 		System.out.print(" ");
		// 	}
		// 	}System.out.println();
		// }
	
	// 15
	// 	for(int i=1;i<6;i++){
	// 		for(int j=1;j<=6;j++){
	// 			if((i==1&&j==2)||(i==2&&j==4||j==2||j==5)||(i==4&&j==1||j==2||j==4)||(i==5&&j==4)){
	// 			System.out.print(" ");
	// 			}
	// 			else{
	// 			System.out.print("*");
	// 			}
	// }System.out.println();
	// }

	/*
		5
		45
		345
		2345
		12345 */
		// 16

		// int i,j;
		// for(i=5;i>=1;i--){
		// 	for(j=i;j<=5;j++){
		// 	System.out.print(j);
			
		// 	}
		// 	System.out.println();
		// }
	
		// 17.  120Triangle pattern

		for(int i  = 1;i<6;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(" ");
			}

			for(int k = 1;k<=i;k++){
				System.out.print("*");
			}

			System.out.println();
		}


	}
}



















