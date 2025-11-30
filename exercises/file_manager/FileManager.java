package exercises.file_manager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("file.txt");
            fos = new FileOutputStream("fosFile.txt");
            int c;

            while ((c = fis.read()) != -1) {
                System.out.print((char)c);
                fos.write(c);
                fos.write((int)'-');
            }
        } finally {
            if(fis != null)
                fis.close();
            if(fis != null)
                fos.close();
        }
    }
}
