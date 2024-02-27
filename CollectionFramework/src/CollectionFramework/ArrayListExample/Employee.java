package CollectionFramework.ArrayListExample;
public record Employee (int id,
                        String name ,
                        String gender ,
                        double salary,
                        String jobTitle
                        ) implements Comparable<Employee>{


    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id , o.id);
    }
}
