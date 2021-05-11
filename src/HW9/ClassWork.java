package HW9;

public class ClassWork {
    public static void main(String[] args) {
        TestClass main1 = new TestClass();
        Student student = new Student();
        student.setAge(35);
        student.setName("Ivan");
        System.out.println(student);
        System.out.println("age" + student.getAge());
        System.out.println("name" + student.getName());

        System.out.println("====================");
        Student student2 = new Student(24, "Marry");
        System.out.println("age" + student2.getAge());
        System.out.println("name" + student2.getName());
        System.out.println(student2);
        student2.setAge(28);
        student2.setName("MARRY");
        System.out.println(student2);

        Student.pos="head";
    }


}
