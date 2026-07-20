// abstract class main{
// abstract void add(); 
// void sub(){
//     System.out.println("lets seee");
// }
// }
// class sub extends main{
//    void add (){
//         System.out.println("hi");
//     }
//     void play(){
//         System.out.println("errica");
//     }
// }


// class classtypecast{
//     public static void main(String[] args) {
//         main m =new sub();
// ///upcasting
//         m.add();
//         m.sub();
//         sub am=(sub)m;
//         am.play();

     
//     }
// }

class main{
   void add() {
        System.out.println("hello");
    }
}
class sub extends main{
   void mul (){
        System.out.println("hi");
    }
}


class classtypecast{
    public static void main(String[] args) {
        main m =new sub();
///upcasting
        m.add();

        sub s=(sub)m;
//downcasting
        s.mul();
        s.add();
    }
}