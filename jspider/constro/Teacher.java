class Teacher {
    int tid;
    String tname;
    String subject;

    Teacher(int tid, String tname, String subject) {
        this.tid = tid;
        this.tname = tname;
        this.subject = subject;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher(201, "Anita", "Maths");
        System.out.println(t1.tid);
        System.out.println(t1.tname);
        System.out.println(t1.subject);
    }
}