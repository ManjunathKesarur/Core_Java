class patient{
    public static void main(String[] args) {
        factory medicine=new factory();
        System.out.println("Give me medicine:");
        pharmacy.pharmu(medicine);
    }
}
class pharmacy{
    public static void pharmu(factory med1){
        distributor.distu(med1);
    }
}
class distributor{
    public static void distu(factory med2){
        med2.drug();
    }
}
class factory{
    public void drug(){
        System.out.println(" Got the Dolo 650 ");
    }
}