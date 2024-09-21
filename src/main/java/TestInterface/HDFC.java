package TestInterface;

public class HDFC implements CooperativeBank 
{

    @Override
    public void loan() {
       System.out.println("loan");
    }

    @Override
    public void deposit() {
        System.out.println("deposit");
    }

    @Override
    public void audit() {
        System.out.println("audit");
    }

    @Override
    public void insurance() {
        System.out.println("insurance");
    }

    @Override
    public void pensionPlan() {
        System.out.println("pensionPlan");
    }

    @Override
    public void coopRecurringDep() {
        System.out.println("coopRecurringDep");
    }
    
    @Override
    public void coopAgriLoan() {
        System.out.println("coopAgriLoan");
    }

    public void mutualFunds()
    {
        System.out.println("HDFC mutualFunds");
    }

}
