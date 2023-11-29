import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class javaFileAttributes {
    public static void main(String[] args) throws IOException {
        Path absPath = Paths.get (  "D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\FileAttributeFolder");
        Path directoryPath = Paths.get ("Folder1");
        Path filePath = Paths.get (  "Folder1", "text. txt");
        System.out.println("directoryPath: " + directoryPath);
        System.out.println("isAbsolute: " + directoryPath.isAbsolute());
        System.out.println("Absolute Path: " + directoryPath. toAbsolutePath());
        System.out.println("URI: " + directoryPath. toUri());
        System.out.println("Name: " + directoryPath.getFileName());
        System.out.println("Parent: " + directoryPath.getParent());
        System.out.println("Root: " + directoryPath.toAbsolutePath().getRoot());
        System.out.println("Exist: " + Files.exists(directoryPath));
        System.out.println("Not Exist: " + Files.notExists(directoryPath));
        System.out.println("Hidden: " + Files.isHidden(directoryPath));
        System.out.println("Is Readable: " + Files.isReadable(filePath));

//        BasicFileAttributes bfa = Files.readAttributes(filePath, BasicFileAttributes)



    }
}
