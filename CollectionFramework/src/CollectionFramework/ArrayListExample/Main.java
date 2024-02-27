package CollectionFramework.ArrayListExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {

    static Comparator<Employee> salaryComparator =  (s1, s2) -> Double.compare(s1.salary(), s2.salary());
    public static void main(String[] args) {
        List<Employee> list = getEmployeeList();
        list.sort(Comparator.naturalOrder()); //this sorts by the order of id because in the Employee.java the compareto() method is overridden that way
        list.sort(salaryComparator);
        list.forEach(System.out::println);

        Employee employee = list.get(2);
        System.out.println(employee);
        maxSalary(list,"male");
        maxSalary(list,"female");




    }
    public static void maxSalary(List<Employee> list , String gender){
        double maxSalary = 0;
        for (Employee emp: list) {
            if ((emp.gender().equals(gender)) && (emp.salary()>maxSalary)){
                maxSalary =emp.salary();
            }

        }
        System.out.println("Max salary for " + gender + " is: $" + maxSalary );
    }
    public static List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Brian Jackson" , "male", 50000, "Data coordinator" ));
        employees.add(new Employee(8,"Jack Sparrow", "male", 84567, "Project manager" ));
        employees.add(new Employee(4,"Anna Daniel" , "female", 84535, "Chief Design Engineer" ));
        employees.add(new Employee(9,"Walt Whitman" , "male", 45876, "Programmer" ));
        employees.add(new Employee(7,"Fyodor Dostoevsky" , "male", 94562, "Senior Developer" ));
        employees.add(new Employee(6,"Olivia Chales" , "female", 145987, "Does Nothing" ));
        return employees;
    }
}
