// package inheritance;

public class Demo {
    public static void main(String[] args) {
        VeryAdvCalc cal;
        cal = new VeryAdvCalc();

        int r1 = cal.add(5,6);
        int r2 = cal.sub(5,6);
        int r3 = cal.multi(5,6);
        int r4 = cal.div(10,2);
        int r5 = (int) cal.pow(5,2);
        
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
    
}
