package FirstTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentArray {
    private List<Student> students;

    public StudentArray() {
        this.students = new ArrayList<>();
    }

    public StudentArray(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    public Student findStudentById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // a)
    public List<Student> getStudentsByFaculty(String faculty) {
        return students.stream()
                .filter(student -> student.getFaculty().equalsIgnoreCase(faculty))
                .collect(Collectors.toList());
    }

    // b)
    public void printStudentsByFacultyAndCourse() {
        students.stream()
                .collect(Collectors.groupingBy(Student::getFaculty))
                .forEach((faculty, facultyStudents) -> {
                    System.out.println("\nФакультет: " + faculty);
                    facultyStudents.stream()
                            .collect(Collectors.groupingBy(Student::getCourse))
                            .forEach((course, courseStudents) -> {
                                System.out.println("  Курс " + course + ":");
                                courseStudents.forEach(student ->
                                        System.out.println("    - " + student.getFullName()));
                            });
                });
    }

    // c)
    public List<Student> getStudentsBornAfterYear(int year) {
        return students.stream()
                .filter(student -> student.getBirthYear() > year)
                .collect(Collectors.toList());
    }

    // d)
    public List<Student> getStudentsByGroup(String group) {
        return students.stream()
                .filter(student -> student.getGroup().equalsIgnoreCase(group))
                .collect(Collectors.toList());
    }

    public void printAllStudents() {
        System.out.println("Все студенты:");
        students.forEach(System.out::println);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void initializeWithTestData() {
        students.clear();

        students.add(new Student(1, "Иванов", "Иван", "Иванович",
                LocalDate.of(2000, 5, 15), "Пушкина", "+79123456789",
                "ФКН", 3, "1"));

        students.add(new Student(2, "Петрова", "Мария", "Сергеевна",
                LocalDate.of(2001, 8, 22), "Лермонтова", "+79234567890",
                "ПММ", 3, "1"));

        students.add(new Student(3, "Сидоров", "Алексей", "Петрович",
                LocalDate.of(1999, 3, 10), "Гоголя", "+79345678901",
                "ПММ", 4, "2"));

        students.add(new Student(4, "Козлова", "Елена", "Владимировна",
                LocalDate.of(2002, 11, 5), "Толстого", "+79456789012",
                "ФИЗ-ФАК", 2, "3"));

        students.add(new Student(5, "Николаев", "Дмитрий", "Александрович",
                LocalDate.of(2000, 7, 30), "Чехова", "+79567890123",
                "МАТ-ФАК", 3, "2"));

        students.add(new Student(6, "Фролова", "Ольга", "Игоревна",
                LocalDate.of(2001, 12, 18), "Достоевского", "+79678901234",
                "МАТ-ФАК", 4, "2"));

        students.add(new Student(7, "Григорьев", "Сергей", "Викторович",
                LocalDate.of(2003, 2, 14), "Есенина", "+79789012345",
                "ПММ", 1, "3"));

        students.add(new Student(8, "Белова", "Анна", "Дмитриевна",
                LocalDate.of(2000, 9, 9), "Некрасова", "+79890123456",
                "ФКН", 2, "3"));
    }
}
