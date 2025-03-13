package task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TooManyListenersException;
import java.util.stream.Collectors;

public class Subject {
    private String name;
    private Person teacher;
    private Set<Student> students;
    private static final int MAX_STUDENTS = 30;
    
    public Subject(String name) {
        this.name = name;
        this.students = new HashSet<>();
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) throws TooManyStudentsException {
        if (students.size() >= 10) {
            throw new TooManyStudentsException("Too many students!");
        }
        students.add(student);
    }

    @Override
    public String toString() {
        String studentNames = students.stream()
            .map(Student::getName)
            .reduce((a, b) -> a + ", " + b)
            .orElse("None");

        return name + ", teacher: " + (teacher != null ? teacher.getName() : "None") + ", students: " + studentNames;
    }
}
