class d1{
static void mul(){
        int a=50; int b=50; char ex='A';
    switch (ex) {
        case 'A':System.out.println(a+b);
        System.out.println("MMMMMMMMMMMMMMMMMM");
        break;
                case '^':System.out.println(a^b);
        break;
                case '*':System.out.println(a*b);
        break;
                case '-':System.out.println(a-b);
        break;
                case '%':System.out.println(a%b);
        break;
                case 'X':System.out.println(a/b);
        break;
         

        
    }
    System.out.println(ex);
}
public static void main(String[] args) {
    //mul(10,90,'+');
    //mul(20,70,'-');
   // mul(140,40,'^');
        //   mul(10,20,'+');
   // mul(10,20,'+');
       //System.out.println(mul());
       mul();
        System.out.println("<----------------------->");
    
}
}