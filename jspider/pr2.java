class kol{
int e=(int)2.0;
}
class lol extends kol{
void pop(){
    System.out.println("dwdwdddwdwdwddwdwdddd");
}
}
class pr2{
    public static void main(String[] args) {
        kol pl=new lol();
        System.out.println(pl.e);

        lol p=(lol)pl;
        p.pop();
    }
}

