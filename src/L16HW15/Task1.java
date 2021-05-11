package L16HW15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Task1 {
    //Task 1
    //c. two instances of Comparator<Person> interface using lambda expressions: first one for
   //comparing by name, second one – by age;
    //
    //d. Then sort them using these comparators;
    //
    //e. Use forEach method for printing information about all the persons. Use the method
    //
    //reference;
    public static void main(String[] args) {
        Person person1=new Person("Ivan",25);
        Person person2=new Person("Ann",27);
        Person person3=new Person("Kate",40);
        Person person4=new Person("David",30);
        //Task 1 //b. an array of Persons;
        Person[] arr= {person1,person2,person3};

        Comparator<Person> nameComparator = (o1, o2) -> {return o1.getName().compareTo(o2.getName());};
        Comparator<Person> ageComparator = (o1, o2) -> {return o1.getAge().compareTo(o2.getAge());};

        System.out.println(arr.length);
        System.out.println("=================");
        Arrays.stream(arr).sorted(nameComparator).forEach(System.out::println);
        System.out.println("=================");
        Arrays.stream(arr).sorted(ageComparator).forEach(System.out::println);
    }

}
