package HW9;

public class Task1 {
    //Create class Worker with next fields: String name, int age, String position, int salary. Give some default values
    // to these fields and add constructor which add new values to them.
    // Add getters and setters. Use all of methods in main in other class.
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        System.out.println("age" + worker1.getAge());
        System.out.println("name" + worker1.getName());
        System.out.println("name" + worker1.getPosition());
        System.out.println("name" + worker1.getSalary());
        //System.out.println(worker1);
        worker1.setAge(28);
        worker1.setName("Hellen");
        worker1.setPosition("QA");
        worker1.setSalary(2500);
        //System.out.println(worker1);

    }

}
