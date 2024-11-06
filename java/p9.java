class test{
    public static void main(String args[]){
        int a , b ,k , lcm;
        int hcf = 1;
        a = 4;
        b = 16;
        int product = a *b ;

        if(a>b ){
            k = a ;
        }else{
            k = b ;
        }
        for (int i = 1 ; i<=k;i++){
            if(a%i==0&&b%i==0){
               hcf = i;
            }

        }
        System.out.println(hcf);

        
        // by using the maths formula 
        // Product = lcm * hcf;


        lcm = product/ hcf;

        System.out.println("The lcm of  a and b --> "+  lcm);
        System.out.println("The hcf of  a and b --> "+  hcf);
        System.out.println("The product of a and b is --> " + product);


    }
}