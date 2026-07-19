class bankcustomer {
    public static void main(String[] args) {
        Bank ref = new Bank();
        System.out.println("Apply for loan:");
        Branch.manager(ref);
    }
}

class Branch {
    public static void manager(Bank loan) {
        Officer.verify(loan);
    }
}

class Officer {
    public static void verify(Bank approve) {
        approve.loan();
    }
}

class Bank {
    public void loan() {
        System.out.println(" Loan approved  buddy");
    }
}