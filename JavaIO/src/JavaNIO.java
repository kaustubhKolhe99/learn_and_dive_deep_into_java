import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class JavaNIO {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("D","programming","Java","learn_and_dive_deep_into_java",
//                "JavaIO","src", "javaNIOPackage"); // os independent file path //get creates path relatively
        Path path = Paths.get("D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src\\javaNIOPackage");

        if(Files.notExists(path)){
            Files.createDirectories(path);
        }

        Path path1 = FileSystems.getDefault().getPath(""); // same path as above

        Path filepath = Paths.get( path.toString(),"javanio.txt");
        if (Files.notExists(filepath)){
            Files.createFile(filepath);

        }



    }
}
class TempFiles{
    public static void main(String[] args) throws IOException{
        Path path = Files.createTempFile("myApp" , null);
        System.out.println(path.toAbsolutePath().toString());
        path.toFile().deleteOnExit();
//        File file = new File("");
//        file.toPath();
    }
}
