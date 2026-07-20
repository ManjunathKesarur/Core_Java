class toStrings{
    int id;
    String name;

    public toStrings(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "the id is : "+this.id+"\n"+"the name is : "+this.name;
    }

    public static void main(String[] args) {
       toStrings s1=new toStrings(90, "jordan");
       System.out.println(s1);

          toStrings s2=new toStrings(902, "kalidas");
       System.out.println(s2);
    }
}