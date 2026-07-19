class BankAccount {
    int accNo;
    String holderName;
    double balance;

    BankAccount(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(12345, "Suresh", 25000);
        System.out.println(a1.accNo);
        System.out.println(a1.holderName);
        System.out.println(a1.balance);
    }
}