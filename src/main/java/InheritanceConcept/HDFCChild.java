package InheritanceConcept;

public class HDFCChild extends RBIParent{
    
    public void mutualFunds()
    {
        System.out.println("I'm mmutual fund from child bank...");
    }

    public void recurringDep()
    {
        System.out.println("I'm recurringDep from child bank...");
    }

    public void nonstaticHDFCmethod()
    {
        //System.out.println("Hiii... From nonStatic Child bank");
        HDFCChild hdBankObj = new HDFCChild();
        hdBankObj.nonStaticmethod();
    }

}
