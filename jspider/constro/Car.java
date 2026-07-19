class Car {
    String model;
    String brand;
    int year;

    Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Swift", "Maruti", 2022);
        System.out.println(c1.model);
        System.out.println(c1.brand);
        System.out.println(c1.year);
    }
}