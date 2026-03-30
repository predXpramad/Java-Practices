
public class students {
    public static void main(String[] args) {
        Student_record s1 = new Student_record(); //Crating variable name s1 which reference for a object
        s1.rollno = 1;  // Assiging values
        s1.name = "Mohit";
        s1.marks = 57;
        Student_record s2 = new Student_record();
        s2.rollno = 2;
        s2.name = "Ranveer";
        s2.marks = 70;
        Student_record s3 = new Student_record();
        s3.rollno = 5;
        s3.name = "Virat";
        s3.marks = 30;

        Student_record stud_rec [] = new Student_record [3]; // We are not creating object here, 
        // just creating array to store the object values
        stud_rec[0] = s1; // Assiging the values to array
        stud_rec[1] = s1;
        stud_rec[2] = s2;

        for(int i = 0; i<stud_rec.length; i++)
        {
            System.out.println(stud_rec[i] + " "); //Prints only address of the value
            System.out.println("Name: " + stud_rec[i].name + " ");
            System.out.println("Roll No.: " + stud_rec[i].rollno + " ");
            System.out.println("Marks :" + stud_rec[i].marks + " ");
        }

    }
}

class Student_record{
    int rollno;
    String name;
    int marks;
}