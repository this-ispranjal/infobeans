/**
 * Demo
 */
 interface PaymentGateway {
    void processpayment(double amount);
}
class Creditcard implements PaymentGateway
{
   public  void processpayment( double amount)
    {
        System.out.println("amount payment by credit card");
    }
}
class UpiPayment implements PaymentGateway
{
    public void processpayment(double amount)
    {
        System.out.println("amount payment by UPI");
    }
}
class Driver
{
    public static void main(String[] args) {
        
       UpiPayment p=new UpiPayment();
       p.processpayment(1000.999);
       Creditcard p1=new Creditcard();
       p1.processpayment(200000.9999);
    }
}
