import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAndDeserilization {
    static String filepath ="D:\\programming\\Java\\learn_and_dive_deep_into_java\\JavaIO\\src\\employee.ser";
    public static void main(String[] args) throws  Exception{
        serialize();
        deserialize();



    }
    static void serialize() throws Exception{
        Employee employee = new Employee(101 , "John Snow" , "1234");

        try (FileOutputStream fos = new FileOutputStream(filepath);
             ObjectOutputStream out = new ObjectOutputStream(fos)){
            out.writeObject(employee);


        }
    }
    static void deserialize() throws Exception{
        try(FileInputStream fis = new FileInputStream(filepath);
            ObjectInputStream in  = new ObjectInputStream(fis)){
            Employee employee = (Employee) in.readObject();
            System.out.println(employee.id);
            System.out.println(employee.name);
            System.out.println(employee.password);




        }
    }
}
