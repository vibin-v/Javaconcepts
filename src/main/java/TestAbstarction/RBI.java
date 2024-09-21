package TestAbstarction;

abstract class RBI {
    
    abstract void loan();
    abstract void deposit();

    public void audit()
    {
        System.out.println("Hi RBI Audit");
    }

}
