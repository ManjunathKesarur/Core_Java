class sum4to6{
    public static void mm(int start,int end)
    {
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i>3 && i<=6){
            sum=sum+i;
        }}
        System.out.println(sum);
    }
    public static void main(String[] args) {
        mm(1,6);
    }
}