class pr4{
    public static void main(String[] args) {
        mm("Mnjunath");
    }
    public static void mm(String s){
           String res="";
        for(int i=s.length()-1;i>=0;i--){
             res+=s.charAt(i);
        }
            System.out.println(res);

    }
}