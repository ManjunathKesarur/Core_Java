package serious;
class fatheru{
	fatheru(int a){
		System.out.println("parashuram");
	}
}
class mother extends fatheru{
	mother(String b){
		super(67);
		System.out.println("Laxmi Kesarur");
	}
}
class brother extends mother{
	brother(int a,String b){
		super("manju");
		System.out.println("Shashidhar");
	}
}
class sister extends brother{
	sister(String a,int b){
		super(23,"hjhfdf");
		System.out.println("Anjali");
	}
}
public class mm2 {

	public static void main(String[] args) {
			new sister("anju",98);

	}

}
