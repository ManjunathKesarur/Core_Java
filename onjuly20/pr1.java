class pr1{
    static {
        System.out.println("hi");
    }

    static {
        System.out.println("popl");
    }

    {
        System.out.println("non static ");
    }
    public static void main(String[] args) {
        new pr2().o(10);

    System.out.println("hello");  

    new pr1();  
    }
}

class pr2{
   void o(int a){
        System.out.println(a+a+"non");
    }
}