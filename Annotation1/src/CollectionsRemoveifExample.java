/* Lambda program 4 */

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class Employee2 {
    private String name;
    private int age;
    private Double salary;
    public Employee2(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String toString()
    {
        return "Employee2 Name: " + this.name + ", Age: " + this.age + ", Salary: " + this.salary;
    }
    public boolean getAge() { return this.age > 30; }
}
public class CollectionsRemoveifExample {
    static List<Employee2> employee2List = new ArrayList<>();

    public static void main(String[] args) {
        employee2List.add(new Employee2("John", 25,7000));
        employee2List.add(new Employee2("Mary", 45,10000));
        employee2List.add(new Employee2("Peter", 65,8000));
        employee2List.add(new Employee2("Jorge", 22,12000));
        employee2List.add(new Employee2("Julie", 29,9000));

        for (Iterator empIterator = employee2List.iterator();
        empIterator.hasNext(); ){
            Employee2 emp = (Employee2) empIterator.next();
            {
                if (emp.getAge()) {
                    empIterator.remove();
                }
            }
            System.out.println("Employee2 below the age of 30");
            employee2List.forEach(System.out::println);
        }

    }
}
