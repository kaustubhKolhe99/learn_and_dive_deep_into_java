import java.io.File;
import java.util.Arrays;

public class iterateThroughFile {
    public static void main(String[] args) {

        File dir = new File("D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src" +
                "\\iterateFolder");
        String[] list = dir.list();
        System.out.println(Arrays.toString(list));
        File dir2 = new File("D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src" +
                "\\iterateFolder\\folder2\\anotherFolder");
        File[] filelist = dir2.listFiles(((dir1, name) -> name.contains("txt")));

        for (File file: filelist) {
            System.out.println(file.getName());

        }
        traverseDir(dir);


    }
    static void traverseDir(File dir){
        File[] list = dir.listFiles();
        for(File file: list){
            if(file.isDirectory()){
                System.out.println("Directory: "+file.getName());
                traverseDir(file);
            }else
                System.out.println("file found:"+file.getName());
        }
    }
}
