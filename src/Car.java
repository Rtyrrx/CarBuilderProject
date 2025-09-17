public class Car {
    private final int seats;
    private final String engine;
    private final String brand;
    private final String color;
    private final boolean hasGPS;
    private final boolean hasTripComputer;

    private Car(Builder builder) {
        this.seats = builder.seats;
        this.engine = builder.engine;
        this.brand = builder.brand;
        this.color = builder.color;
        this.hasGPS = builder.hasGPS;
        this.hasTripComputer = builder.hasTripComputer;
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    public boolean hasTripComputer() {
        return hasTripComputer;
    }

    @Override
    public String toString() {
        return "Car {" +
                "Seats=" + seats +
                ", Engine='" + engine + '\'' +
                ", Brand='" + brand + '\'' +
                ", Color='" + color + '\'' +
                ", GPS=" + hasGPS +
                ", TripComputer=" + hasTripComputer +
                '}';
    }

    public static class Builder {
        private int seats;
        private String engine;
        private String brand = "Generic";
        private String color = "Black";
        private boolean hasGPS;
        private boolean hasTripComputer;

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder enableGPS() {
            this.hasGPS = true;
            return this;
        }

        public Builder enableTripComputer() {
            this.hasTripComputer = true;
            return this;
        }

        public static Car sportsCar() {
            return new Builder()
                    .setSeats(2)
                    .setEngine("V8 Turbo")
                    .setBrand("Ferrari")
                    .setColor("Red")
                    .enableGPS()
                    .enableTripComputer()
                    .build();
        }

        public static Car familyCar() {
            return new Builder()
                    .setSeats(5)
                    .setEngine("V6")
                    .setBrand("Toyota")
                    .setColor("Blue")
                    .enableGPS()
                    .build();
        }

        public Car build() {
            // validateCarConfiguration();
            return new Car(this);
        }

        // private void validateCarConfiguration() {
        // if (seats <= 0) {
        // throw new IllegalArgumentException("Car must have at least one seat");
        // }
        // if (engine == null || engine.isEmpty()) {
        // throw new IllegalArgumentException("Engine type must be specified");
        // }
        // }
    }
}
