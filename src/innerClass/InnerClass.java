package innerClass;

public class InnerClass {
    public static void main(String args[]) {
        University university=new University();
        College college= new College();
        College.CollegeDataBase collegeDataBase=college.new CollegeDataBase(university);
    }
}

class University {
    class UniversityDataBase {
        UniversityDataBase(String str) {
            System.out.println("String in UniversityDataBase:"+str);
        }
    }
}

class College {
    class CollegeDataBase extends University.UniversityDataBase {
        CollegeDataBase(University university) {
            university.super("hello");
            System.out.println("Im in CollegeDataBase");
        }
    }
}

/*
-:Output:-
String in UniversityDataBase:hello
Im in CollegeDataBase
 */