class pr{
    public  void send(String a){
        System.out.println("the given value is String "+a);
    }
    public void send(int x){
        System.out.println("the given value is Integer "+x);
    }
}
class pr1{
     public static void main(String[] args) {
       pr s1= new pr();
        s1.send(99);
        s1.send("manjunath");
            mr x=new mr();
           int v =x.mm();
        System.out.println(v);
    }
}
class mr{
        public int mm(){
            int x=646;
            int y=445;
            return x+y;
        }
}