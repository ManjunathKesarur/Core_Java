class Customer {
    int cid;
    String cname;
    long phone;

    Customer(int cid, String cname, long phone) {
        this.cid = cid;
        this.cname = cname;
        this.phone = phone;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer(401, "Ramesh", 9876543210L);
        System.out.println(c1.cid);
        System.out.println(c1.cname);
        System.out.println(c1.phone);
    }
}