interface main{
    void sia();
   public static void rama(){
        System.out.println("Rama ji");
    }
}
class mino implements main{
   public void sia(){
        System.out.println("Sita Ma");
    }
    public void ravan(){
        System.out.println("Evil");
    }
}
class crazy{
    public static void main(String[] args) {
        ///upcasting 
        main mm = new mino();
        mm.sia();
        main.rama();
    mino mi=(mino)mm;
    mi.ravan();

    }
}