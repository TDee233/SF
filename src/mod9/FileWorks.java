package mod9;

import java.io.File;
import java.io.IOException;

public class FileWorks {
    public static void main(String[] args) throws IOException {
        File fileTester = new File("C:\\Test","Test.txt");


        System.out.println(fileTester.canExecute());
        System.out.println(fileTester.getPath());
        System.out.println(fileTester.exists());

        boolean isCreated = fileTester.createNewFile();
        System.out.println(isCreated);

    }
}
