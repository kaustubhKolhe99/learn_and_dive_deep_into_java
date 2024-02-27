import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopyOperations {
    public static void main(String[] args) throws IOException {
//        Path srcPath = Path.of("src/FileAttributeFolder/Folder1/text.txt");
//        Path desPath = Path.of("src/copied_files/file2.txt");
//        Files.copy(srcPath , desPath , StandardCopyOption.REPLACE_EXISTING); //copy method does not create new directory
//
//        Files.delete(desPath);
//        Files.move(srcPath , desPath);
//        Files.copy(desPath , srcPath , StandardCopyOption.REPLACE_EXISTING);

        Path srcDir = Path.of("src/copied_files");
        Path desDir = Path.of("src/abcdirectory");
        Files.copy(srcDir , desDir); //does not work copies folder empty




    }
}
