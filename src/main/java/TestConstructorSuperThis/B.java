package TestConstructorSuperThis;

public class B extends A {

    public B()
    {
        System.out.println("I'm B");
    }

    public B(int age)
    {
        this(89,90);
        System.out.println("I'm B with parameter age");
    }

    public B(int abCount,int cdCount )
    {

        System.out.println("I'm B with parameter ab and cd");
    }
}
