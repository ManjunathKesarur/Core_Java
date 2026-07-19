class Myself {
    public static void main(String[] args) {
        Kitchen ref = new Kitchen();
        System.out.println("I want food:");
        Restaurant.waiter(ref);
    }
}

class Restaurant {
    public static void waiter(Kitchen food) {
        Chef.prepare(food);
    }
}

class Chef {
    public static void prepare(Kitchen item) {
        item.vegbiryani();
    }
}

class Kitchen {
    public void vegbiryani() {
        System.out.println(" Biryani is ready ");
    }
}