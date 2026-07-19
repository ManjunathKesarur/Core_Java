class loopesh{
    public static void guru(String x){
        if(x=="male"){
            System.out.println("the user is:\n"+x);
        }
        else if(x=="female"){
            System.out.println("the user is:\n"+x);
        }
        else{
            System.out.println("He/She is definetly OTHERS :\n"+x);
        }

    }
}
class loop1{
    public static void main(String[] args) {
        loopesh.guru("male");
}}