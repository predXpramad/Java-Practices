import java.util.Map;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> keyValue = new HashMap<>();
        keyValue.put("Naveen", 561);
        keyValue.put("Naveen1", 516);
        keyValue.put("Manoj", 562);

        keyValue.put("Harsh",542);

        System.out.println(keyValue.get("Harsh"));
        System.out.println(keyValue.get("Manoj"));
        System.out.println(keyValue.values());



        // Print both key and values
        for(String k: keyValue.keySet()){
            System.out.println(k + " : " + keyValue.get(k));
        }
    }
}
