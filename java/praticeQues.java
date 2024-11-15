class test {
    public static void main(String args[]){
     
      // 1. 
      double a, b,c;
      a = 3.0/0;
      b = 0/4.0;
      c=0/0.0;
                            // outputs
    System.out.println(a); // Infinity 
      System.out.println(b); // 0.0
      System.out.println(c); // NaN

      // 2.
       int x,y;
      x = 5;
      {
    int y = 6;
    System.out.print(x + " " + y);
      }
      System.out.println(x + " " + y);

      // Output --> varible y not found 

      // 3. 
    }    
}
