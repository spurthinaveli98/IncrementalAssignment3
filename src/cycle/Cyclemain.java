package cycle;

class Cycle
{

}

class Unicycle extends Cycle
{
    void balance()
    {
       System.out.println("this is unicycle");
    }
}

class Bicycle extends Cycle
{
    void balance()
    {
        System.out.println("this is bicycle");
    }

}

class Tricycle extends Cycle
{

}

public  class Cyclemain
{
    public static void main(String args[])
    {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Cycle[] c = new Cycle[3];

        //upcasting
        c[0] = (Cycle) unicycle;
        c[1] = (Cycle) bicycle;
        c[2]= (Cycle) tricycle;
        //    c[0].balance();
        //    c[1].balance();
        //    c[2].balance();
        //No balance method in class Cycle.

        //downcasting
        Unicycle unicycle1 = (Unicycle) c[0];
        Bicycle bicycle1 = (Bicycle) c[1];
        Tricycle tricycle1 = (Tricycle) c[2];

        unicycle1.balance();
        bicycle1.balance();
        //   tricycle1.balance();
        //No balance method in class Tricycle

    }
}