class warehouse{
    public void ferrari(){
        System.out.println("YOU GOT THE F! CAR BUDDY");
    }

}
class distributor{
    public static void getcar(warehouse f3) {
        f3.ferrari();
    }

}
class showroom{
    public static void get(warehouse f2){
        distributor.getcar(f2);
    }

}
class pbr{
    public static void main(String[] args) {
        warehouse f1=new warehouse();
        showroom.get(f1);
    }
}