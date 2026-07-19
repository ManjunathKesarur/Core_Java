class prod1to6{
    public static void nn(int start,int end){
        int prod=1;
        for(int i=start;i<=end;i++){
            prod=prod*i;
        }
        System.out.println(prod);
    }
    public static void main(String[] args) {
        nn(1,6);
    }
}