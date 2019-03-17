package cycle;

public  class CycleMain
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
        Unicycle downCastingUnicycle = (Unicycle) c[0];
        Bicycle downCastingBicycle = (Bicycle) c[1];
        Tricycle downCastingTricycle = (Tricycle) c[2];

        downCastingUnicycle.balance();
        downCastingBicycle.balance();
        //   downCastingTricycle.balance();
        //No balance method in class Tricycle

    }
}

class Cycle {
}

class Unicycle extends Cycle {
    void balance() {
        System.out.println("This is unicycle");
    }
}

class Bicycle extends Cycle {
    void balance() {
        System.out.println("This is bicycle");
    }
}

class Tricycle extends Cycle {
}

/*
*-:Output:-
This is unicycle
This is bicycle
 */