/*
If Employee is an entity class having salary and name attributes then write a program to insert Employee objects in a
treeset where custom order is in their salary descending order, if salary is same then sorting should be done by name
 */


import java.util.*;

 class Employee  {
    String name;
    Integer salary;
    public Employee() {
    }
    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

//    public int compareTo(Employee o) {
//        if(o.salary.equals(this.salary))
//        {
//            return (this.name.compareTo(o.name));
//        }
//        return  (o.salary.compareTo(this.salary));
//    }
}
class mySalaryComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2) {
        if(Integer.compare(e1.salary, e2.salary) ==0)
        {
            return e1.name.compareTo(e2.name);
        }
        return e2.salary - e1.salary;
    }
}

 class Question6 {
    public static void main(String[] args) {
        Employee e1 = new Employee("ankit", 23);
        Employee e2 = new Employee("sonu", 15);
        Employee e3 = new Employee("pooja", 23);
        Employee e4 = new Employee("ganesh", 56);

        Set<Employee> st = new TreeSet<>(new mySalaryComparator());

        st.add(e1);
        st.add(e2);
        st.add(e3);
        st.add(e4);

        for(Employee e: st) {
            System.out.println(e.getName() + "   " +e.getSalary());
        }

    }
}
