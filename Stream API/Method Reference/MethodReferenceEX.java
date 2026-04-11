// package Method Reference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEX {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Naveen", "Mohan","Ram","Thanu","Kishor");
        List<String> uNames = names.stream()
                                    .map(name->name.toUpperCase())
                                    .toList();
        System.out.println(uNames);
        System.out.println();

        //or, referening Methods instead like
        List<String> uNames1 = names.stream()
                                    .map(String::toUpperCase) // Type::Method
                                    .toList();
        uNames1.forEach(i -> System.out.println(i)); //one at time
        System.out.println();
        // or
        uNames1.forEach(System.out::println); //{Where method Belongs to}::{method}
    }
}
