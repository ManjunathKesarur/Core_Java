class student{
    int javamock;
    static String iname="jsp";
    public static void main(String[] args) {
        System.out.println("institue name is"+iname);
        student std1=new student();
        std1.javamock=1;
        System.out.println("the manjunath have got : "+std1.javamock);
  student std2=new student();
                std2.javamock=2;
        System.out.println("the sanju have got : "+std2.javamock);

                        std2.javamock=1;
        System.out.println("the sanju have got : "+std2.javamock);
    }
}