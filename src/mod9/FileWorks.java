package mod9;

import java.io.File;
import java.io.IOException;

public class FileWorks {
    public static void main(String[] args) throws IOException {
        File fileTester = new File("C:\\Test");
        File dirTester = new File("C:\\Test\\Test1");

        System.out.println(fileTester.canExecute());
        System.out.println(fileTester.getPath());
        System.out.println(fileTester.exists());

//        boolean isCreated = fileTester.createNewFile();
//        boolean isMake = dirTester.mkdir();
//        System.out.println(isCreated);
//        System.out.println(isMake);

        String[] files = fileTester.list();
        for (String fileName : files) {
            System.out.println(fileName);
        }
//        boolean isDel = dirTester.delete();
//        System.out.println(isDel);

    }
}
