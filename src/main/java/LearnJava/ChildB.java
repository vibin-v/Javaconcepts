package LearnJava;

public class ChildB extends ParentA {
    int dob=2000;

    public ChildB()
    {
        super();
        System.out.println("Child B Class");
    }

    public ChildB(int y)
    {
        this();
        System.out.println("Child B-Y Class");
    }

    public void calculateAge()
    {
        //super.calculateAge();
        this.calculateAgeafter10();
        System.out.println("calculateAge-Child B Class");
    }

    public void calculateAgeafter10()
    {
        System.out.println("calculateAge after 10 years-Child B Class");
    }


}
