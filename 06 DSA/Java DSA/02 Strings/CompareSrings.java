// package 02 Strings;

public class CompareSrings {
    public static void CompareStr(String str1, String str2){
        if(str1 == str2)
            System.out.println("Same string");
        else
            System.out.println("Different string");

        // Second Method
        if(str1.equals(str2))
            System.out.println("Same string");
        else
            System.out.println("Different string");
    }
    
    public static void main(String[] args) {
        String s1 = "Many";
        String s2 = "Many";
        CompareStr(s1,s2);
    }
}
