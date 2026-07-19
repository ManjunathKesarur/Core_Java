class prododd{
    public static void nn(int start, int end){
        int sum=1;
        for(int i=start; i<=end; i++){
            if(i%2==1){
            sum=sum*i;
        }}
        System.out.println(sum);
    }
    public static void main(String[] args) {
        nn(1,6);
    }
}