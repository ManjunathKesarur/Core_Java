class Employee{
    int eid;
    String ename;
    char dept;
    Employee(int eid,String ename,char dept){
        this.eid=eid;
        this.ename=ename;
        this.dept=dept;
    } 
    public static void main(String[] args) {
        Employee Employee1=new Employee(101,"Guru",'A');
        System.out.println(Employee1.eid);
        System.out.println(Employee1.ename);
        System.out.println(Employee1.dept);

        Employee Employee2=new Employee(102,"Varu",'B');
        System.out.println(Employee2.eid);
        System.out.println(Employee2.ename);
        System.out.println(Employee2.dept);
    }
}