package School_System;

public class Subject {
    private String subName;
    private Person teacher;
    private Student[] students;
    private int count = 0;

    public Subject(String subName) {
        this.subName = subName;
        this.students = new Student[10];
    }

    public void setTeacher(Person t) {
        this.teacher = t;
    }

    public void addStudent(Student s) throws TooManyStudentsException {
        if (count >= students.length) {
            throw new TooManyStudentsException("Too many students!");
        }
        students[count++] = s;
    }

    @Override
    public String toString() {

        // Join stduent names
        StringBuilder sb = new StringBuilder();
        for (int i  = 0; i < count; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(students[i].getName());
        }

        return subName + ", " + "teacher: " + teacher.getName() + ", students: " + sb.toString();
    }
}
