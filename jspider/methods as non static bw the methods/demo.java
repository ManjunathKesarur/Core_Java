class mns1{
    double a=3.33;
    String x="xaiver@123";
    void mul(){
        double b=5.65;
        double h=9.55;
        double result=0.5*b*h;
        System.out.println(result);
    }}
class demo{
    static String x = "manjunath :)";
    public static void main(String[] args){
        new mns1().mul();
        System.out.println("the username is:"+new mns1().x);
        System.out.println(x);
    }
}