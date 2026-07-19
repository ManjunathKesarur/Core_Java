class Mobile {
    String brand;
    String model;
    int price;

    Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "Galaxy S21", 60000);
        System.out.println(m1.brand);
        System.out.println(m1.model);
        System.out.println(m1.price);
    }
}