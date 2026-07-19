class sample1{
    int x=10;
}
class demo3 extends sample1{
    int y=323;
        }
class gg extends demo3{
    void mmm(){
        System.out.println("hi baabbaabab");
    }
}
class hhh extends sample1{
    void vbvb(){
    System.out.println("DDWDWDWWDD");         
    }
}
class hirar{
    public static void main(String[] args) {
        gg c=new gg();
        System.out.println(c.y);
        System.out.println(c.x);
        c.mmm();
        System.out.println("------------------\n\n\n");
        hhh p=new hhh();
        System.out.println(p.x);
        p.vbvb();
    }
}