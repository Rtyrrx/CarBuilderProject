public class Main {
    public static void main(String[] args) {
        Car sportsCar = Car.Builder.sportsCar();
        Car familyCar = Car.Builder.familyCar();

        System.out.println(sportsCar);
        System.out.println(familyCar);
    }
}
