package assignment12;

class Employee{
    int id = 0;
    String name = "Null";
    double salary = 00;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Question9 {
    public static void main(String[] args) {
        Employee employee = new Employee(01,"Vikas",50000);
        System.out.println(employee);


    }
}
/*
Employee{id=1, name='Vikas', salary=50000.0}

Process finished with exit code 0


 */