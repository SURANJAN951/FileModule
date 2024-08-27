import java.io.File;
import java.io.IOException;

public class FileModule {
    public static void main(String[] args) throws IOException {
        //java me file class pehle se defined hai to let's make its object
        File file1 = new File("pw.java"); // agar pehle se pw.java file hai
        //file1 ushi ko reference karega,
        //If the file doesn't already exist, the File object won't create a physical file.Instead, 
        // it will only create a Java File object that represents the name and path of the file.
        System.out.println(file1.exists());//false

        file1.createNewFile();//it will create new file named "pw.java"
        System.out.println(file1.exists());//true

        //now let's create directory
        File dir = new File("PW");//this will also check if PW directory exist
        //then it will point to that directory, if not the it will point to non-existent file.
        System.out.println(dir.exists());//false

        dir.mkdir();// this will create new directory.
        System.out.println(dir.exists());

    }
}
