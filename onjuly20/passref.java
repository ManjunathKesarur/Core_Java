class shoe{
void rawmaterial(){
    System.out.println("Raw material");
}
}
class nike {
static void AirJorden(shoe e){
e.rawmaterial();
}
}
class passref{
    public static void main(String[] args) {
        
        shoe s=new shoe();
        nike.AirJorden(s);
         nike.AirJorden(s);
    }
}