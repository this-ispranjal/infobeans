
import java.util.Scanner;

class pay {

    Scanner sc = new Scanner(System.in);
    int emplyNo, basicSalry;
    double HRA, DA, TA, PF, Loan, netSum;
    String employName;

    void getdata(int emplyNo, String employName) {
        System.out.println("Entre ____ the following");
        basicSalry = sc.nextInt();

    }

    void HRA() {
        HRA = 40 * basicSalry / 100;
        System.out.println(" Hra is  " + " " + HRA);
        // return HRA;
    }

    void f2() {
        DA = 20 * basicSalry / 100;
        System.out.println(" DA is  " + " " + DA);

        // return DA;
    }

    void f3() {
        TA = 10 * basicSalry / 100;
        System.out.println(" TA is  " + " " + TA);

        // return TA;
    }

    void f4() {
        PF = 12.5 * basicSalry / 100;
        System.out.println(" PF is  " + " " + PF);

        // return PF;
    }

    void f5() {
        Loan = 2 * basicSalry / 100;
        System.out.println(" Loan is  " + " " + Loan);

        // return Loan;
    }

    void putData() {
        HRA();
        f2();
        f3();
        f4();
        f5();

        netSum = HRA + DA + TA - (PF + Loan) + basicSalry;
        System.out.println("Salary ---> " + " " + netSum);

        // return netSum;
    }

    // void printResult() {
    // }
    public static void main(String args[]) {
        pay e = new pay();
        e.getdata(234, "pranjal");
        // e.Process();
        // e.printResult();
        e.putData();

    }
}
