class rev{
    public static void main(String[] args) {
        String s="mama";
        String r=" ";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        if(r.equals(r)){
            System.out.println("pal");
        }
        else{
            System.out.println("not");
        }
    }
}