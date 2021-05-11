package HW9;

public class Student {
    private int age;
    private String name;
    public static String pos;

    Student() {
        System.out.println("Text");
    }

    Student(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Text2");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("TEXT");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("NAMETEXT");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
