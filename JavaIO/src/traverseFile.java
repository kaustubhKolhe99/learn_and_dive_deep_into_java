import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class traverseFile {
    public static void main(String[] args)  throws IOException {
        Path path = Path.of("src\\iterateFolder\\folder2");

        File file  = new File("src\\iterateFolder\\folder2");
        System.out.println(Arrays.toString(file.list()));

        try (Stream<Path> pathStream = Files.list(path)){
            pathStream.forEach(System.out::println);

        }
        try(Stream<Path> paths = Files.walk(path , 3 , FileVisitOption.FOLLOW_LINKS)){ // follow length follows the path for shortcut icon
//            paths.forEach(System.out::println);

            List<Path> pdfs= paths.filter(path1 -> path1.toString().endsWith("pdf")).toList();
            System.out.println(pdfs);

        }


    }
}
class WalkFileTreeExample{
    public static void main(String[] args) throws IOException {
        MyFileVisitor visitor = new MyFileVisitor();
        Path path = Path.of("src","javaNIOPackage");
        Files.walkFileTree(path,visitor);
    }
}
class MyFileVisitor extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("At file "+ file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Before Visiting: " + dir);
        return FileVisitResult.CONTINUE;
    }
}