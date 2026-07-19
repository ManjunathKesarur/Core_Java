class oddback{
    public static void nn(int start, int end){
        for(int i=end; i>=start; i--){
            if(i%2==1){
            System.out.println(i);
        }}
        
    }
    public static void main(String[] args) {
        nn(1,6);
    }
}