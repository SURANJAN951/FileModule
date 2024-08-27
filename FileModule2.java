import java.io.File;
import java.io.IOException;

public class FileModule2 {
    public static void main(String[] args) throws IOException {
        File dir2 = new File("PwJava");
        dir2.mkdir();
        System.out.println("file is refering to directory PWJava: "+ dir2.isDirectory());

        File file = new File(dir2,"pwsills.txt");//this will not create any files but
        //will check is file "pwskills.txt" available in "dir2" directory,if it is available the it will
        //start pointing to that directory if not then will point java object of that directory.

        file.createNewFile();
        System.out.println("file is refering to PwSkills.txt "+ file.isFile());
    }
}
