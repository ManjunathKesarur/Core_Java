class coriorcustomer {
    public static void main(String[] args) {
        Parcel ref = new Parcel();
        System.out.println("Send a parcel:");
        Office.accept(ref);
    }
}

class Office {
    public static void accept(Parcel pack) {
        Courier.deliver(pack);
    }
}

class Courier {
    public static void deliver(Parcel item) {
        item.ship();
    }
}

class Parcel {
    public void ship() {
        System.out.println(" parcel delivered  ");
    }
}