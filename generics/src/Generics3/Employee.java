package Generics3;

public class Employee implements Comparable<Employee> {
    int yearsOfExperience;

    @Override
    public int compareTo(Employee o) {
        if (this.yearsOfExperience==o.yearsOfExperience)
            return 0;
        else if (this.yearsOfExperience>o.yearsOfExperience) {
            return 1;

        }else
            return -1;
/*
        return Integer.compare(this.yearsOfExperience,o.yearsOfExperience); // this Integer.compare() will do same thing as above code, this is a standard function

 */
    }
}
