class test{
    public static void main(String args[]){

        1.
        for(int i = 1; i<=3;i++){
            for(int j = 1 ;j<=5;j++){
                System.out.print(j+4);
            }
            System.out.println();
        }

        //2. 
        // for(int i = 1; i<=3;i++){
        //     for(int j = 1 ;j<=5;j++){
        //         System.out.print(9-j);
        //     }
        //     System.out.println();
        // }


        3. 
        for(int i = 1 ;i<=5;i++){
                for(char a ='A'; a<='E';a++){
                    System.out.print(a);
                }
                System.out.println();
         }

        // 4. 
        // not getting


        // 5.

        // for(int i = 1; i<=4;i++){
        //     for(int j = 1 ;j<=4;j++){
        //         System.out.print(j*2);
        //     }
        //     System.out.println();
        // }


        // 6. 

        for(int i = 1; i<=5;i++){
            for(int j = 1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 7. 
        // for(char i = 'A'; i<='E';i++){
        //     for(char j = 'A' ;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // 8.

        //  for(char i = 'A'; i<='E';i++){
        //     for(char j = 'A' ;j<=i;j++){
        //         System.out.print("A");
        //     }
        //     System.out.println();
        // }


        // 9. 
        //  done in while board


        // 10. 

        //  for(int i = 1; i<=5;i++){
        //     for(int j = 5 ;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // 12. 

        // for(int i = 1; i<=5;i++){
        //     for(int j = 1 ;j<=(5-i+1);j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        //  11 .

        // for(int i = 5; i>=(5-i+1);i--){
        //     for(int j = 5 ;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }



    //    // 13. 
    //     for(int  i = 1; i<=5;i++){
    //         for(char j = 'A' ;j;j--){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }


    for(int i = 1; i<=5;i++){
        for(int j = 5 ;j>=1;j--){
           if(j>=(4-i+1) && j<=4){
            System.out.print("*");
        }
           else{
            System.out.print(" ");

           }
        }
        System.out.println();
    }
    }
} 
