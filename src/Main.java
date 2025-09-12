public class Main {
    public static void main(String[] args) {
        Car sportsCar = new Car.Builder()
                .setSeats(2)
                .setEngine("V8 Turbo")
                .setBrand("Ferrari")
                .setColor("Red")
                .enableGPS()
                .enableTripComputer()
                .build();

        Car familyCar = new Car.Builder()
                .setSeats(5)
                .setEngine("V6")
                .setBrand("Toyota")
                .setColor("Blue")
                .enableGPS()
                .build();

        System.out.println(sportsCar);
        System.out.println(familyCar);
    }
}
