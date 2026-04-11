import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// Method 1 where we extend the class that we use sort. we need to implement Comparable
class Students implements Comparable<Student>{
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
        
    }
}
public class sorting1 {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student("Thanu",20));
        studs.add(new Student("Prasad",23));
        studs.add(new Student("krish",19));
        studs.add(new Student("Fiaz",16));

        for(Student s:studs)
            System.out.println(s);

        Collections.sort(studs);

        for(Student s:studs)
            System.out.println(s);
    }
}
