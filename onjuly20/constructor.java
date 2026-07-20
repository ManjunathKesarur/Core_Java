// class constructor{

//     public constructor() {

//         System.out.println("charlie charlie");
//     }
//      public constructor(int a) {

//         System.out.println("xavir");
//     }

    
// public static void main(String[] args) {
//     constructor cn = new constructor();
// new constructor(0202);
// new constructor();
// new constructor();
// }
// }
class constructor{

    int id;
    String name;

    public constructor(int id,String name) {
        this.id=id;
        this.name=name;
        // System.out.println(id+name);
    }

    
public static void main(String[] args) {

    // new constructor(10, "charlie");
    // new constructor(10, "jordan");

   constructor cn= new constructor(10, "charlie"); 
    System.out.println(cn.id);
     System.out.println(cn.name);

     constructor cnr= new constructor(197, "charlie"); 
       System.out.println(cnr.id);
     System.out.println(cnr.name);
}
}