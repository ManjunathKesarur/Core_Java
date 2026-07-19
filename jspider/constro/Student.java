class Student{
    int id;
    String sname;
    char sec;
     Student(int id, String sname, char sec) {
        this.id=id;
        this.sname=sname;
        this.sec=sec;
    }
    public static void main(String[]args){
        Student std1=new Student(80,"pandu",'c');
        System.out.println(std1.id);
        System.out.println(std1.sname);
        System.out.println(std1.sec);


    }
    
}