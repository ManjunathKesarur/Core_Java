class Hospital {
    int hid;
    String hname;
    String city;

    Hospital(int hid, String hname, String city) {
        this.hid = hid;
        this.hname = hname;
        this.city = city;
    }

    public static void main(String[] args) {
        Hospital h1 = new Hospital(301, "Apollo", "Bangalore");
        System.out.println(h1.hid);
        System.out.println(h1.hname);
        System.out.println(h1.city);
    }
}