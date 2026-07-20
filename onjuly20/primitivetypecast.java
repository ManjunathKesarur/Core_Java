class primitivetypecasting{
    public static void main(String[] args) {
        double a=13;  ////---implicitly                                ////example for widding 
        double b= 11.2f;            //implicitly
        double c=(double)10;   ///explicity
        double d=23;
        System.out.println(a+" \n  "+b+" \n   "+c+"   \n     "+d+"   \n  \n ");

        int e=(int)10.51;                //only    //explicity    converting Larger datatype to   Smaller        //narrowing 
        System.out.println(e);




    }
}