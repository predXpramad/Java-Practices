
public class foreach {
    public static void main(String[] args) {
        // int nums [] = new int [4];
        // nums[0] = 5;
        // nums[1] = 6;
        // nums[2] = 8;
        // nums[3] = 1;

        // // Syntax of for each is `for(type value: from)`
        // for(int n: nums)
        // {
        //     System.out.println(n);
        // }
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
        stud_rec[1] = s2;
        stud_rec[2] = s3;

        // Syntax of for each is `for(type var_name: from)` or also called as enhanced for loop
        for(Student_record stud: stud_rec)
        {
            System.out.println(stud.name + ":" + stud.marks);
        }
    }
}

class Student_record{
    int rollno;
    String name;
    int marks;
}