package FirstTask;

public class Main {
    public static void main(String[] args) {
        StudentArray studentArray = new StudentArray();

        studentArray.initializeWithTestData();

        //Задание а
        studentArray.getStudentsByFaculty("ФКН")
                .forEach(System.out::println);
        System.out.println("------------------------------------------------");
        //Задание b
        studentArray.printStudentsByFacultyAndCourse();
        System.out.println("------------------------------------------------");
        //Задание c
        studentArray.getStudentsBornAfterYear(2000)
                .forEach(System.out::println);
        System.out.println("------------------------------------------------");
        //Задание d
        studentArray.getStudentsByGroup("2")
                .forEach(System.out::println);
    }
}
