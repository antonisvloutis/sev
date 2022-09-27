package gr.aueb.sev.chapter14;

public class StudentEqualDemo {
    private final static Student[] students = new Student[] {
            new Student(1,"Alice","Wonderland"),
            new Student(2,"Bob","Dylan"),
            new Student(3,"Bob","Marley"),
            new Student(4,"Cathrine","D.")
    };
    public static void main(String[] args) {

        /*printStudent(students, new IDEqualChecker() {
            @Override
            public boolean checkEqualId(Student student) {
                return (student.getId()==2) || (student.getId()==3);
            }
        });*/
        printStudent(students, (student -> student.getId()==2));

    }
    public static void printStudent(Student[] students,IDEqualChecker idChecker){
        for (Student student : students){
            if(idChecker.checkEqualId(student)){
                System.out.println(student);
            }
        }
    }
}
