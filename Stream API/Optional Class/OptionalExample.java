// package Optional Class;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Naveen", "Mohan","Ram","Thanu","Kishor");
        // String name = names.stream()
        //                     .filter(str -> str.contains('x'))
        //                     .findFirst(); 
        //                     //Retruns optinal string to avoid null pointer exception
        //                     // So We change reference type to optional

        Optional<String> name = names.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst(); //gives optional
                            
        System.out.println(name.orElse("Not Found"));
        
        String name1 = names.stream()
                            .filter(str -> str.contains("ha"))
                            .findFirst() //gives optional
                            .orElse("Not Found");
                            
        System.out.println(name1);

        
    }
    
    
}
