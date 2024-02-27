import java.nio.file.Path;
import java.nio.file.Paths;

public class PathOperations {

}
class NormalizeExample {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\kaust\\Desktop\\..\\.\\Desktop");
        Path path1 = Path.of("C:\\Users\\kaust\\Desktop\\.\\.\\.\\.\\");
        Path path2 = Path.of("C:\\Users\\kaust\\Desktop");

        System.out.println(path.normalize());
        System.out.println(path1.normalize());
        System.out.println(path2.normalize());

    }

}
class JoiningPath{
    public static void main(String[] args) {
        Path path = Paths.get("D:\\programming\\Java\\learn_and_dive_deep_into_java" +
                "\\JavaIO\\src\\iterateFolder");
        Path resolve = path.resolve("folder2\\anotherFolder2\\text2.txt");

        System.out.println(resolve);



        Path path1 = Paths.get("folder2\\anotherFolder2\\text2.txt");
        resolve = path.resolve(path1);
        System.out.println(resolve);
    }
}

class CompareExample{
    public static void main(String[] args) {
         Path path1 = Path.of("D:\\programming\\Java\\learn_and_dive_deep_into_java" +
                 "\\JavaIO\\src\\iterateFolder");
         Path path2 = Path.of("D:\\programming\\Java\\learn_and_dive_deep_into_java" +
                 "\\JavaIO\\src\\iterateFolder");
         Path path3 = Path.of("D:\\programming\\Java\\learn_and_dive_deep_into_java" +
                 "\\JavaIO\\src\\iterateFolder\\folder2\\anotherFolder2\\text2.txt");

         Path path4 = path3.subpath(6,9);


        System.out.println(path4);
        System.out.println(path1.equals(path2));
        System.out.println(path3.startsWith(path3));
        System.out.println(path3.endsWith(path4));
    }
}
class RelativizingExample{
    public static void main(String[] args) {
        Path p1 = Paths.get("D:\\programming\\Java\\learn_and_dive_deep_into_java\\" +
                "JavaIO\\src\\newFolder");
        Path p2 = Paths.get("D:\\programming\\Java\\learn_and_dive_deep_into_java\\" +
                "JavaIO\\src\\newFolder\\folder1");

        Path relative1 = p1.relativize(p2);
        System.out.println(relative1);

        relative1 = p2.relativize(p1);
        System.out.println(relative1);

        Path p3 = Paths.get("D:\\programming\\Java\\learn_and_dive_deep_into_java\\" +
                "JavaIO\\src\\iterateFolder\\folder2\\anotherFolder");
        Path p4 = Paths.get("D:\\programming\\Java\\learn_and_dive_deep_into_java\\" +
                "JavaIO\\src\\iterateFolder\\folder2\\anotherFolder2");
        System.out.println(p3.relativize(p4)); // returns the path to go from p3 to p4

    }
}