 public class Employee {
    private int age;
    private String Name;


    public Employee(int age, String name) {
        this.age = age;
        Name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", Name='" + Name + '\'' +
                '}';
    }
}
