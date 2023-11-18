public class Employee {

    private String name ;
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    private double salary ;
    public String getSalary(){
        // you can validate user and limit accessibility
        return "$" + salary;
    }
    public void setSalary(double salary){
        if (salary<0){
            System.out.println("invalid number");
            return;
        }
        this.salary= salary;
    }

}
