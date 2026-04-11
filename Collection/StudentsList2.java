// package Collection;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }



    public int compareTo(Student that) {
	    if(this.age > that.age){
			return 1; //Swaps
		}
        else{return -1;}
		
    }
    
    
}

public class StudentsList2 {
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
        
        //No need to pass comp
        Collections.sort(studs);
        for(Student st: studs){
            System.out.println(st);
        }
    }
}