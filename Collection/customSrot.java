// package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class customSrot {
    public static void main(String[] args) {
        //custom logic for sorting using Comparator Interface
        // Implemented sort so that the array is sorted based on 
        // length of string.
        Comparator<String> com = new Comparator<String>() {
            public int compare(String i, String j){
                if(i.length() > j.length()){
                    return 1;
                }
                return -1;
            }
        };

        List <String> str = new ArrayList<>();
        str.add("Manoj");
        str.add("Krist Raj");
        str.add("Manu Kumar");
        str.add("Archana");
        str.add("Amit Kumar");

        Collections.sort(str);
        for(String s: str){
            System.err.println(s);

        }

        System.out.println();
        System.out.println();

        Collections.sort(str,com);
        for(String s: str){
            System.err.println(s);

        }
    }

}
