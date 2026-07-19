class Laptop {
    String company;
    int ram;
    double cost;

    Laptop(String company, int ram, double cost) {
        this.company = company;
        this.ram = ram;
        this.cost = cost;
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP", 16, 75000);
        System.out.println(l1.company);
        System.out.println(l1.ram);
        System.out.println(l1.cost);
    }
}