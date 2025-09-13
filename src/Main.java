public class Main {
    public static void main(String[] args) {
        Car newCar = new Car.Builder()
                .setBrand("Toyota")
                .setModel("Corolla")
                .setYear(2020)
                .setMileage(999)
                .build();
        System.out.println(newCar + "\n");

        Car anotherCar = new Car.Builder()
                .setBrand("Mercedes")
                .setModel("W1400 S600")
                .setYear(1995)
                .setMileage(50000)
                .build();
        System.out.println(anotherCar);
    }
}