package TestAbstarction;

public class HDFC extends RBI{

    public void mutualf()
    {
        System.out.println("heii HDFC mutual fund");
    }

    @Override
    public void loan() {
        System.out.println("heii Loan");
    }

    @Override
    public void deposit() {
        System.out.println("heii Deposit");
    }

}
