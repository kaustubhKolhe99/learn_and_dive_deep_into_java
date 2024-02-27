import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO2 {

    static String filepath = "D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src\\file.txt";
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try(FileOutputStream fos = new FileOutputStream(filepath , true)) {
            String sent = "Java is awesome";
//        fos.write(65);
//        fos.write(66);
            fos.write(sent.getBytes());
            fos.write(sent.getBytes(), 5, sent.length() - 5);
        }

//        fos.close();
        try (FileInputStream fis = new FileInputStream(filepath)){
            byte[] bytes = fis.readAllBytes();
            String readtext = new String(bytes);
            System.out.println(readtext);

            byte[] bytes1 = new byte[fis.available()];
            int read = fis.read(bytes1);
            System.out.println(read);

            int i;
            while ((i= fis.read()) != 1){
                System.out.println((char) i);


            }
        }



    }
}
