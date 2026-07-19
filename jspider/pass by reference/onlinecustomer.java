class onlinecustomer {
    public static void main(String[] args) {
        Warehouse ref = new Warehouse();
        System.out.println("Order my product:");
        Amazon.customerService(ref);
    }
}

class Amazon {
    public static void customerService(Warehouse pack) {
        DeliveryAgent.ship(pack);
    }
}

class DeliveryAgent {
    public static void ship(Warehouse pack) {
        pack.laptop();
    }
}

class Warehouse {
    public void laptop() {
        System.out.println(" Laptop delivered securly");
    }
}