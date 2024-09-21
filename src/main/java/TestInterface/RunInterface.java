package TestInterface;

public class RunInterface {
    public static void main(String[] args) {
        RBI obj = new HDFC();
        obj.audit();
        obj.deposit();
        obj.loan();
    

        HDFC objHdfc = new HDFC();
        objHdfc.audit();
        objHdfc.deposit();
        objHdfc.loan();
        objHdfc.mutualFunds();
        objHdfc.pensionPlan();
        objHdfc.insurance();

        objHdfc.coopAgriLoan();
        objHdfc.coopRecurringDep();
    }

}
