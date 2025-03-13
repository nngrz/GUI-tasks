package task1;

import java.util.HashSet;
import java.util.Set;

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
        if (students.size() >= MAX_STUDENTS) {
            throw new TooManyStudentsException("Too many students!");
        }
        students.add(student);
    }

    @Override
    public String toString() {
        // students.stream() converts the students Set<Student> into a Stream<Student>,
        // allowing functional operations.
        String studentNames = students.stream()
            // .map(Student::getName) transforms each Student object into just their name (String), 
            // creating a Stream<String>.
            .map(Student::getName)
            // combines all student names into a single comma-separated string.
            .reduce((a, b) -> a + ", " + b)
            .orElse("No students"); // handle empty case

        return name + ", teacher: " + (teacher != null ? teacher.getName() : "None") + ", students: " + studentNames;
    }
}
