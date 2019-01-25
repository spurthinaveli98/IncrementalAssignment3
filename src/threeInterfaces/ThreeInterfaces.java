package threeInterfaces;

interface Java {
    void compileJava();
    void executeJava();
}

interface C {
    void compileC();
    void executeC();
}

interface Python {
    void compilePython();
    void executePython();
}

interface Languages extends Java, C, Python {
    void print();
}

class ConcreteClass{


}

class ThreeInterfaces extends ConcreteClass implements Languages {

    public void compileJava() {
        System.out.println("Java program is compiled");
    }
    public void executeJava() {
        System.out.println("Java program is executed");
    }
    public void compileC() {
        System.out.println("C program is compiled");
    }
    public void executeC() {
        System.out.println("C program is executed");
    }
    public void compilePython() {
        System.out.println("Python program is compiled");
    }
    public void executePython() {
        System.out.println("Python program is executed");
    }
    public void print() {
        System.out.println("Print languages");
    }


    public void javaProgramming(Java obj1) {
        obj1.compileJava();
        obj1.executeJava();
    }
    public void cProgramming(C obj2) {
        obj2.compileC();
        obj2.executeC();
    }
    public void pythonProgramming(Python obj3) {
        obj3.compilePython();
        obj3.executePython();
    }
    public void programmingLanguages(Languages obj4) {
        obj4.print(); }
    public static void main(String[] args) {
        ThreeInterfaces obj = new ThreeInterfaces();
        obj.javaProgramming(obj);
        obj.cProgramming(obj);
        obj.pythonProgramming(obj);
        obj.programmingLanguages(obj);
    }
}
