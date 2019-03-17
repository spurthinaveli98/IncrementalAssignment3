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

    public void javaProgramming(Java java) {
        java.compileJava();
        java.executeJava();
    }
    public void cProgramming(C c) {
        c.compileC();
        c.executeC();
    }
    public void pythonProgramming(Python python) {
        python.compilePython();
        python.executePython();
    }
    public void programmingLanguages(Languages languages) {
        languages.print(); }

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

    public static void main(String[] args) {
        ThreeInterfaces threeInterfaces = new ThreeInterfaces();
        threeInterfaces.javaProgramming(threeInterfaces);
        threeInterfaces.cProgramming(threeInterfaces);
        threeInterfaces.pythonProgramming(threeInterfaces);
        threeInterfaces.programmingLanguages(threeInterfaces);
    }
}

/*
*-:Output:-
Java program is compiled
Java program is executed
C program is compiled
C program is executed
Python program is compiled
Python program is executed
Print languages
 */