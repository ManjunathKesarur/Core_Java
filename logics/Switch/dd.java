class dd{
    public static void ma(String x) {
    switch(x){
        case "male": System.out.println("male candident");
        break;
        case "female":System.out.println("female candident");
        break;
        case"other" : System.out.println("Others candident");
        break;    
    }

    }
    public static void main(String[] args) {
        ma("female");
    }
}