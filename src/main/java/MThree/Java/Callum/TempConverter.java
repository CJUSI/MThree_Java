package MThree.Java.Callum;

public class TempConverter {
    public static void main (String[] args) {
        TempConverter tc = new TempConverter();
        System.out.println("32F = " + tc.convF2C(32) + "C");
        System.out.println("42C = " + tc.convC2F(42) + "F");
    }

    private double convF2C (double f){
            return (f-32) *5/9;
    }

    private double convC2F (double c){
        return c * 9/5 + 32;
    }
}