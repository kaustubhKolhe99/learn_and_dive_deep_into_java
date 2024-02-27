import java.io.*;
import java.util.List;

public class BufferInputAndOutputStream {
    static String filepath ="D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src\\BufferInputoutputstream.txt";

    public static void main(String[] args) throws IOException {
        String word = "Hello java";
        byte[] bytes = word.getBytes();

        try (FileOutputStream fos = new FileOutputStream(filepath);
             BufferedOutputStream bos = new BufferedOutputStream(fos) ){
            bos.write(bytes);



        }
        try (FileInputStream fis = new FileInputStream(filepath);
             BufferedInputStream bis = new BufferedInputStream(fis)){
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());

            //System.out.println(new String(bis.readAllBytes()));

            bis.mark(200);
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            bis.reset();
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());

        }
    }
}
class bufferReaderWriter{
    static String filepath ="D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src\\brw.txt";

    public static void main(String[] args) throws IOException {
        String word = "hello java";
        char[] chars = word.toCharArray();
//        try(FileWriter fw = new FileWriter(filepath);
//        BufferedWriter bw = new BufferedWriter(fw)){
//            bw.write(word);
//            bw.newLine();
//            bw.write(word);
//        }
        try( FileReader fr = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fr)){
            List<String> list;
//            list = br.lines().filter(l-> l.contains("3")).toList();
////            System.out.println(list);
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            br.mark(200);
//            System.out.println(br.readLine());
//            br.reset();
//            System.out.println(br.readLine());
                String line;
                while ((line =br.readLine())!= null){
                    System.out.println(line);
                }
        }


    }
}
