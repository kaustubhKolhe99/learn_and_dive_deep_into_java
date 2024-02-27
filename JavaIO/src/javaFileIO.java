import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class javaFileIO {
    public static void main(String[] args) throws IOException {
        String parentPath = "D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src\\newFolder";
//        File directory = new File("D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src\\newFolder\\folder1\\folder2\\folder3");
        File directory = new File(parentPath,"\\folder1\\folder2\\folder3");
        directory.mkdirs();
//        System.out.println (directory.mkdirs());
        File file = new File("D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src\\newFolder\\folder1\\folder2\\folder3\\text.txt");
        if (file.createNewFile()){
            System.out.println("file created ");
        }
        System.out.println("file path: " + file.getPath()); // relative path
        System.out.println("absolute path: " + file.getAbsolutePath());
        System.out.println("file exists: " + file.exists());
        System.out.println("is file: " + file.isFile());
        System.out.println("is directory: " + file.isDirectory());
        System.out.println("is hidden: " + file.isHidden());
        System.out.println("last modified in millis: " + file.lastModified());
        ZonedDateTime lastModified = Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault());
        System.out.println("last modified date time: " + lastModified);
        // check permissions
        System.out.println("can read: " + file.canRead());
        System.out.println("can write: " + file.canWrite());
        System.out.println("can execute: " + file.canExecute());
        System.out.println("is directory:" + directory.isDirectory() );
        file.setReadOnly();

        file.setWritable(true);
        try (FileWriter fw = new FileWriter(file)){
            fw.write("java is awesome");


        }

    }
}
