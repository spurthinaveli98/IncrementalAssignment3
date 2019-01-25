package factory;

public class Factory
{
    public static void main(String arg[])
    {
        Cycle c1= UnicycleFactory.manufacture();
        c1.ride();
        Cycle c2= BicycleFactory.manufacture();
        c2.ride();
        Cycle c3= TricycleFactory.manufacture();
        c3.ride();
    }
}


interface Cycle
{
    void ride();

}
class Unicycle implements Cycle
{
    public void ride()
    {
        System.out.println("Riding Unicycle");
    }
}

class Bicycle implements Cycle
{
    public void ride()
    {
        System.out.println("Riding Bicycle");
    }
}

class Tricycle implements Cycle
{
    public void ride()
    {
        System.out.println("Riding Tricycle");
    }
}

class UnicycleFactory
{
    public static Unicycle manufacture() {
        System.out.println("Unicycle is manufactored here");

        return new Unicycle();
    }
}

class BicycleFactory
{
    public static Bicycle manufacture() {
        System.out.println("Bicycle is manufactored here");

        return new Bicycle();
    }
}

class TricycleFactory {
    public static Tricycle manufacture() {
        System.out.println("Tricycle is manufactored here");

        return new Tricycle();
    }
}
