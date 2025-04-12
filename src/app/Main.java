package app;

public class Main {


    public static double convFahrToCel(double fahr){
        return (fahr - 32) / 1.8;
    }
    public static void main(String[] args) {
        System.out.println("This is a temperature converting app.\nVersion 1.0");
        double fahr = 75;
        double celsius = convFahrToCel(fahr);
        System.out.printf("The result is: %.2f celsius degrees", celsius);
    }
}
