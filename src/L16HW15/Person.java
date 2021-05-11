package L16HW15;
// Task1 //1. Create:a. a Person class with name and age fields;
public class Person {
String name;
Integer age;
Person (String name, int age){
    this.name=name;
    this.age=age;
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
