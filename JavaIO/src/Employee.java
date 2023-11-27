import java.io.Serializable;

//public record Employee(int id , String name , String password) implements Serializable {

//}
public class Employee implements Serializable {
    int id;
    String name;
    transient String password;
    public Employee(int id , String name , String password){
        this.id = id;
        this.name = name;
        this.password = password;

    }
}