import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class IO3 {
    static String filepath ="D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src\\file.txt";
    public static void main(String[] args) throws IOException {
        String word = "java";
        byte[] bytes = word.getBytes();
        try (ByteArrayInputStream bias = new ByteArrayInputStream(bytes)){
            System.out.println(bias.available());
//            System.out.println((char) bias.read());
//            System.out.println((char) bias.read());
            for (int i = 0; i < bytes.length; i++) {
                System.out.println((char) bias.read());

            }
        }


    }



}
class second {
    public static void main(String[] args) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            System.out.println(baos.size());
            baos.write('a');
            baos.write('b');
            System.out.println(baos.size());
            System.out.println(baos);


        }

    }

}
class third{
    static String filepath ="D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src\\file.txt";

    public static void main(String[] args) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()){
            FileOutputStream fos = new FileOutputStream(filepath);
            baos.write('a');
            baos.write('b');
            baos.write('c');
            baos.write('d');
            baos.writeTo(fos);
            baos.flush();


        }


    }
}
