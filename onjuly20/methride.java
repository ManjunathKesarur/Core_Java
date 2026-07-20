class par{

    void add(){
        System.out.println("add initial method");
    }
}

class main extends par{

void add(){
    System.out.println("second method");

   super.add();;
}

}



class methride extends main{
    public static void main(String[] args) {
      main m=  new main();
      m.add();
      m.add();
    }
}