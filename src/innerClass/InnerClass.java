package innerClass;

public class InnerClass
{
    public static void main(String args[])
    {
        Class2 c2= new Class2();
        Class1 c1=new Class1();

        Class2.Inner2 i2=c2.new Inner2(c1);
    }

}
class Class1
{
    class Inner1
    {
        Inner1(String s)
        {
            System.out.println("String in inner1:"+s);
        }
    }
}
class Class2
{
    class Inner2 extends Class1.Inner1
    {
        Inner2(Class1 c1) {
            c1.super("hello");
            System.out.println("im inner2");
        }
    }
}
