class test {
    public static void main(String args[]){
        int n ,l ,t,s, f,r;

        n = 2345;
        l = n%10;
        t = (n/10) % 10;
        s = (n/100) % 10;
        f = (n/1000);

        r = (l*1000+t*100+s*10+f);
        System.out.println(r);
        
    }
}