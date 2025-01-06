interface calculator{
    void  sum(int x , int y);
    int multiply(int x , int y);
}
class Equation implements calculator{
    public void sum(int x , int y) {
        System.out.println(x+y);
    }
    public int multiply(int x ,int y ){
        return x*y;
    }
}

class Demo{
    public  static  void main(String args[]){
        calculator obj  = new Equation();
        obj.sum(10,22);
        System.out.println(obj.multiply(5,6));
    }
}