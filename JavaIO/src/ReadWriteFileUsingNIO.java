import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileUsingNIO {
    static String str = "Hello Java\n";
    static byte[] bytes = "some bytes\n".getBytes();
    static List<String> list = new ArrayList<>(){{
        add("List item 1");
        add("List item 2");
    }};

    public static void main(String[] args) throws IOException {
        Path path = Path.of("D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src\\myFolder" , "myFile.txt");
        Files.write(path , bytes, StandardOpenOption.APPEND);
        Files.write(path,list, StandardOpenOption.APPEND);
        Files.writeString(path , str , StandardOpenOption.APPEND);


        try (OutputStream outputStream = Files.newOutputStream(path, StandardOpenOption.APPEND)) {
              outputStream.write(6);

        }
        try (BufferedWriter bw = Files.newBufferedWriter(path ,StandardOpenOption.APPEND )){
            bw.write("hello java Again");


        }
        //reading data
        String s = Files.readString(path);
        System.out.println(Files.readAllLines(path));
//        System.out.println(s);
        byte[] bytes1 = Files.readAllBytes(path);

        InputStream in = Files.newInputStream(path);
        BufferedReader br = Files.newBufferedReader(path);

    }
}
