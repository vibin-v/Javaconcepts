package TestAbstarction;

public class RunAbstraction {

    public static void main(String[] args) {
        RBI obj = new HDFC();
        obj.deposit();
        obj.loan();
        obj.audit();
    }

}
