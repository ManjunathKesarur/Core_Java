class mm{
    public static void main(String[] args) {
        String s="my name is manjunath";
        String arr[]=s.split(" ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(rev (arr[i])+" ");
        }
    }
    public static String rev(String s){
        String res=" ";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
}