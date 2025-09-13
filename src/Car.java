public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final int mileage;

    private Car(String brand, String model, int year, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public static class Builder {
        private String brand;
        private String model;
        private int year;
        private int mileage;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public Builder setModel(String model) {
            this.model = model;
            return this;
        }
        public Builder setYear(int year) {
            this.year = year;
            return this;
        }
        public Builder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Car build() {
            return new Car(brand, model, year, mileage);
        }
    }
    @Override
    public String toString() {
        return "Your car created: " + "\n" +
               "Brand: " + brand + "\n" +
               "Model: " + model + "\n" +
               "Year: " + year + "\n" +
               "Mileage: " + mileage + "km";
    }
}