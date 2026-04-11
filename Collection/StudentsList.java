// package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
    
}

public class StudentsList {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Manoj", 5));
        studs.add(new Student("Kumar", 7));
        studs.add(new Student("Ajay", 3));
        studs.add(new Student("Prasad", 6));
        for(Student st: studs){
            System.out.println(st);
        }

        System.out.println();
        System.out.println();
        //Tradional sort sort below won't work
        // Collections.sort(studs); //not works

        // So we custom sort, using comparator
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j){
                if(i.age > j.age){
                    return 1; //Swaps
                }
                return -1;
            }
        };

        //pass the 'com' to Collections.sort(studs,) as additinal parameter
        Collections.sort(studs,com);
        for(Student st: studs){
            System.out.println(st);
        }
    }
}
