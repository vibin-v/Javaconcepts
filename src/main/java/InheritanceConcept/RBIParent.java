package InheritanceConcept;

public class RBIParent {
    int nonStaticInstance = 500;
    static int staticInstance= 1000;

    public void nonStaticmethod()
    {
        System.out.println("Hiii... From nonStatic parent..");
    }

    public static void staticmethod()
    {
        System.out.println("Hiii... From Static parent...!!");
    }
}
