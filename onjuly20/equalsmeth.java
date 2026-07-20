class equalsmeth{
    
        
    int id;
    String name;

    public equalsmeth(int id,String name) {
        this.id=id;
        this.name=name;
    }

     public boolean equals(Object obj){
        equalsmeth s2=(equalsmeth)obj;
        return this.id == s2.id && this.name ==s2.name;

    }

    
    public static void main(String[] args) {
         equalsmeth s1=new equalsmeth(101,"charlie");
    equalsmeth s2=new equalsmeth(101, "charlie");

   
  
     
     if(s1.equals(s2)){
        System.out.println("id is same");
     }else{
        System.out.println("nah baby id is different");
     }
}}
