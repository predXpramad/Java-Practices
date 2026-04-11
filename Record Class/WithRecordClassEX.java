// package Record Class;


// Without record, it would be around 40 lines of code
record Alien(int id, String name){//State descriptions int id and string name
    //Compact Canonical Constructor
    public Alien{
        if(id == 0)
            throw new IllegalArgumentException("ID cannot be negative");
        
    }
}
// types are final => immutable data
// Cannot be inherited, but can implemet


public class WithRecordClassEX {
        public static void main(String[] args) {
            Alien a1 = new Alien(1,"Rahul");
            Alien a2 = new Alien(1,"Rahul");
            // Alien a3 = new Alien(0,"Rahul");
            System.out.println(a1);
            System.out.println(a1.equals(a2));
            System.err.println(a1.name());
        }
}
