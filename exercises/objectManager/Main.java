package exercises.objectManager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Jan", "Nowak", 25);

        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("oosFile.txt"));
            oos.writeObject(person);

            ois = new ObjectInputStream(new FileInputStream("oosFile.txt"));

            Person o = (Person) ois.readObject();
            System.out.println(o);
        } finally {
            if (oos != null)
                oos.close();
            if (ois != null)
                ois.close();
        }
    }
}
