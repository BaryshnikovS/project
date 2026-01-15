package FirstTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private String group;

    public Student() {
    }

    public Student(int id, String lastName, String firstName, String middleName,
                   LocalDate birthDate, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(int id, String lastName, String firstName, String middleName,
                   LocalDate birthDate, String address, String phone,
                   String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return String.format("Student{id=%d, lastName='%s', firstName='%s', middleName='%s', " +
                        "birthDate=%s, address='%s', phone='%s', faculty='%s', course=%d, group='%s'}",
                id, lastName, firstName, middleName,
                birthDate.format(formatter),
                address, phone, faculty, course, group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + middleName;
    }

    public int getBirthYear() {
        return birthDate.getYear();
    }
}
