class back6to4{
    public static void mm(int start,int end)
    {
        for(int i=end;i>=start;i--){
            if(i>3 && i<=6){
            System.out.println(i);
        }}
    }
    public static void main(String[] args) {
        mm(1,6);
    }
}