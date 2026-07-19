class p1{
    int mockscore;
    public static void main(String[] args) {
        p1 student1= new p1();
        p1 student2= new p1();

        student1.mockscore=1;
        System.out.println("the manju scored : "+student1.mockscore);

        student2.mockscore=1;
        System.out.println("the sanju scored : "+student2.mockscore);

        student1.mockscore=1;
        System.out.println("the manju scored : "+student1.mockscore);

        student2.mockscore=2;
        System.out.println("the sanju scored : "+student2.mockscore);
    }
}