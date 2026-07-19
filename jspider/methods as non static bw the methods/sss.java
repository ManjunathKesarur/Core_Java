class gg{
    double a=9.3;
    String b="Nana Hesaru Manju";
    void manga(){
        System.out.println("Summane Hage");
    }
}
class vari{
    void guru(){
        System.out.println("calling from gg class: "+new gg().b);
    }
}
class sss{
    public static void main(String[] args){
        new vari().guru();
        System.out.println(new gg().b);
    }
}
