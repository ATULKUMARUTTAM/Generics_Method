public class Student {
    private int age;
    private String Name;


    public Student(int age, String name) {
        this.age = age;
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", Name='" + Name + '\'' +
                '}';
    }
}
