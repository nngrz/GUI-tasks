package task1;

public class Main {
    public static void main ( String args []) {
        Person p1 = new Person("Jan", 50);
        Student s1 = new Student("Jasiek", 20);
        Person p3 = (Person)s1 ;
        
        p1.sayHelloTo(p3); // Hi Jasiek !
        p3.sayHelloTo(p1); // Hi Jan !
        
        Subject s = new Subject("GUI") ;
        s.setTeacher(p1) ;
        
        try {
            s.addStudent (s1) ;
        } catch (TooManyStudentsException e) {
            e.printStackTrace();
        }

        System.out.println(s); // GUI , teacher : Jan , students : Jasiek
    }
}
