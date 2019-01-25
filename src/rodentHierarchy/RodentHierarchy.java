package rodentHierarchy;

public class RodentHierarchy
{
    public static void main(String args[]) {
       Rodent r[]=new Rodent[3];
       r[0]=new Mouse();
        r[0].run();
       r[1]=new Gerbil();
        r[1].run();
       r[2]=new Hamster();
        r[2].run();
    }
}

abstract class Rodent
{
    Rodent()
    {

        System.out.println("Im in class Rodent");
    }
   abstract void run();

}

class Mouse extends Rodent
{

    Mouse()
    {
        System.out.println("Im in class Mouse");
    }
   public void run()
    {
        System.out.println("Mouse is running");
    }
}

class Gerbil extends Rodent
{

    Gerbil()
    {

        System.out.println("Im in class Gerbil");
    }
    public void run()
    {

        System.out.println("Gerbil is running");
    }
}

class Hamster extends Rodent
{

    Hamster()

    {
        System.out.println("Im in class Hamster");
    }
    public void run()
    {

        System.out.println("Hamster is running");
    }
}