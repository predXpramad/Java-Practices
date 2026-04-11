// package Record Class;

class Alien{
    // State -> Holds some data, int x
    private final int id;
    private final String name;
    public Alien(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Alien [id=" + id + ", name=" + name + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alien other = (Alien) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    // without this we get wrong answer
    
    
}

public class WithoutRecordClassEX {
    public static void main(String[] args) {
        Alien a1 = new Alien(1,"Rahul");
        Alien a2 = new Alien(1,"Rahul");
        System.out.println(a1);
        System.out.println(a1.equals(a2));
    }
    
}
