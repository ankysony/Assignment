
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

        
    }
}
