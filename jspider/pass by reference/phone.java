class phone{
    public static void main(String[] args) {
        factory ref1=new factory();
        System.out.println("Give me Phone:");
        showroom.salesman(ref1);
    }
}
class showroom{
    public static void salesman(factory one){
        distributor.distu(one);
    }
}
class distributor{
    public static void distu(factory two){
        two.iphone();
    }
}
class factory{
    public void iphone(){
        System.out.println(" Got the Iphone 17 pro Max ");
    }
}