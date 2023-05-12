import java.util.*;
import java.util.stream.Collectors;

class Emp {
    String name;
    int salary;

    public Emp() {
    }

    public Emp(String name,int salary) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}



public class Question20 {
    public static void main(String[] arg) {
        Emp e1 = new Emp("ankit", 23);
        Emp e2 = new Emp("sonu", 15);
        Emp e3 = new Emp("pooja", 23);
        Emp e4 = new Emp("ganesh", 56);

        List<Emp> ll = new ArrayList<>();

        ll.add(e1);
        ll.add(e2);
        ll.add(e3);
        ll.add(e4);


        List<Emp> sortedList = ll.stream()
                .sorted(Comparator.comparingInt(Emp::getSalary))
                .collect(Collectors.toList());

        for(Emp em: sortedList)
        {
            System.out.println(em.name + " " + em.salary);
        }
    }
}
