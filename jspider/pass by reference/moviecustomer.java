class moviecustomer{
    public static void main(String[] args) {
        Theatre ref = new Theatre();
        System.out.println("Book movie ticket:");
        App.booking(ref);
    }
}

class App {
    public static void booking(Theatre seat) {
        Counter.issue(seat);
    }
}

class Counter {
    public static void issue(Theatre movie) {
        movie.ticket();
    }
}

class Theatre {
    public void ticket() {
        System.out.println(" Ticket booked and issued ticket ");
    }
}