package InheritanceConcept;

public class TestInheritance {
    public static void main(String[] args) {

        HDFCChild chilObj = new HDFCChild();


        System.out.println(RBIParent.staticInstance);
        System.out.println(chilObj.nonStaticInstance);

        RBIParent.staticmethod();
        chilObj.nonstaticHDFCmethod();
        chilObj.mutualFunds();
    }
}
