interface remote{
    void on();
    void off();
}
interface Lg extends  remote{
    public void on(){
    System.out.println("Lg tv is On");    
    }
    public void off(){
        System.out.println("Tv turend off");
    }
}
class interfaceu{
    public static void main(String[] args) {
      remote re =  new Lg();
    //   re.on();
      re.off();
    }
}