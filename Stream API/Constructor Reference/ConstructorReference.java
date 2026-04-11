// package Stream API.Constructor Reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Students [name=" + name + ", age=" + age + "]";
    }
    
}

public class ConstructorReference {
   public static void main(String[] args) {
        List<String> names = Arrays.asList("Naveen","Rahul","Kishor","Manvith");
        List<Student> students = new ArrayList<>();
        // for(String name: names){
        //     students.add(new Student(name));
        // }
        // students.forEach(System.out::println);

        //Using StreamAPI
        students = names.stream()
                        .map(name->new Student(name))
                        .toList();
        students.forEach(System.out::println);
        System.out.println();

        //Constructor reference
        students = names.stream()
                        .map(Student::new) //For ever name create new object of Student Constructor
                        .toList();
        students.forEach(System.out::println);
   } 
}
