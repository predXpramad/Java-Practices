import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Student{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    

}

// Method 2 of sorting using comparator
public class sorting2 {
    public static void main(String[] args) {
        Comparator<Student> comp = (i,j) -> i.age > j.age? 1:-1;
        
        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(51,"Manoj"));
        studs.add(new Student(49, "Krish"));
        studs.add(new Student(39,"Vishnu"));

        for(Student s:studs)
            System.out.println(s);

        System.out.println();
        Collections.sort(studs,comp);

        for(Student s:studs)
            System.out.println(s);
    }
}
