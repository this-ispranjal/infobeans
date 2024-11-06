class test{
    public static void main(String args[]){
        int amount = 7745;

        int thousand = amount/2000;
        amount %= 2000;

        int Fivehundred = amount/500;
        amount%= 500;

        int twohundred = amount / 200;
        amount%= 200;

        int hundred = amount / 100;
        amount%= 100;

        int Fifty = amount / 50;
        amount%= 50;

        int Twienty = amount / 20;
        amount %= 20;

        int ten = amount / 10;
        amount %=10;

        int five = amount / 5;
        amount%= 5;

        int two = amount / 2;
        amount%=2;

        int one = amount;

        int total= thousand+Fivehundred+twohundred+hundred+Fifty+Twienty+ten+five+two+one;


        

        System.out.println(total + " Notes are require");



        System.out.println("Total notes: " + total);
        System.out.println("Notes used:");
        System.out.println("2000s: " + thousand);
        System.out.println("500s: " + Fivehundred);
        System.out.println("100s: " + twohundred);
        System.out.println("100s: " + hundred);
        System.out.println("50s: " + Fifty);
        System.out.println("20s: " + Twienty);
        System.out.println("10s: " + ten);
        System.out.println("5s: " + five);
        System.out.println("2s: " + two);
        System.out.println("1s: " + one);

    }
}