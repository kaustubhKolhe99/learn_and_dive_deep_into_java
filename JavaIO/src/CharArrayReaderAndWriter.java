import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayReaderAndWriter {
    static String filepath ="D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src\\charArray.txt";
    public static void main(String[] args) throws IOException {
        String word ="java";
        char[] chars = word.toCharArray();
        try(CharArrayReader car = new CharArrayReader(chars)){
            int i ;
            while ((i=car.read())!= -1){
                System.out.println((char) i);
            }
        }
        try (CharArrayWriter caw = new CharArrayWriter();
             FileWriter fw = new FileWriter(filepath)){
            caw.write("hello java");
            System.out.println(caw);
            caw.writeTo(fw);




        }

    }
}
