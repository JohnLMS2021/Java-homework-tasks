import java.util.EmptyStackException;

public class Homework5 {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
                empCorp[0] = new Employee("Grubyj Ivan", "Dispatch", "grubyjivan@gmail.com", "17792734188",10000,25);
                empCorp[1] = new Employee("Mihail Vladov", "Co-owner", "mikevladov@gmail.com", "13252403233",50000,36);
                empCorp[2] = new Employee("Vainberg Roman", "Co-owner", "vainberg.roman@gmail.com", "17792164600",50000,40);
                empCorp[3] = new Employee("Xenia Tarnavscaia", "FinancialDirector", "tarnavscaia@gmail.com", "37379761296",35000,35);
                empCorp[4] = new Employee("Evgheniy Riko", "Supervisior", "rikoevg@gmail.com", "14405307500",20000,43);
    for (Employee employee : empCorp)
        if (employee.getAge()>40)
        System.out.println(employee);
    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
    this.name = name;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
            return (name+ "\n-"
                    +position+ "\n-"
                    +email+ "\n-"
                    +phone+ "\n-"
                    +salary+ "\n-"
                    +age);
    }
}
