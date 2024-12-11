class test {
    static void copyingArray(){
        int a[] = {1,23,4,89};
        int b[] = new int[a.length];
        for(int i = 0;i<a.length;i++){
            b[i] = a[i];
            System.out.println(b[i]+ " new copyed array is b ");
        }
    }

    static void reverse(){
        int ar[] = {1,23,4,43,2};
        int n = ar.length;
        int start = 0 ;
        // int end = ar.length-1;
        int temp ;


        for(int i = 0; i<n/2;i++){
             temp = ar[i];       // temp = 1,
            ar[i] = ar[n-i-1];   // ai = 
            ar[n-i-1] = temp;

        }


        for(int i = 0;i<5;i++){
            System.out.print(ar[i]+ " , ");
        }


        
        // while(start<end){
        //     temp = ar[start];
        //     ar[start] = ar[end];
        //     ar[end] = temp;
        //     start++;
        //     end--;
        // }
        // System.err.println();
        // System.out.println("helloo");
    }
    
    static void equalElements(){
        // 6. WAP to compare 2 arrays - if elements are same it should print - "success" otherwise "failure" with its failure position

        int a [] = {1,23,4,2,9};
        int b [] = {1,8,6,4,9};
        
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<b.length;j++){


                if(a[i] == b[j]){
                    System.out.println("Success " + i + " " + j);
                }else {
                    // System.out.println("failure");
                }
            }
        }
    }
   
   
    public static void main(String args[]){
        // reverse();
        // copyingArray();
        equalElements();

    }
}