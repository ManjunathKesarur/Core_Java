class sum1to3{
    public static void nn(int start,int end){
        int sum=0;
        for(int i=start ; i<=end/2 ;i++){
            sum=sum+i;
        }
          System.out.println(sum);
    }
    public static void main(String[] args){

        nn(1,6);
    }
}