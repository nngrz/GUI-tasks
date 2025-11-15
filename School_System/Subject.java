package School_System;

public class Subject {
    private String subName;
    private Person teacher;

    public Subject(String subName) {
        this.subName = subName;
    }

    public void setTeacher(Person t) {
        this.teacher = t;
    }

    public String getName() {
        return  subName;
    }

    @Override
    public String toString() {
        return subName + ", " + "teacher: " + teacher.getName() + ", students: " + sb.toString;
    }
}
