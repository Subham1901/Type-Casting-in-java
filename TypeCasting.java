public class TypeCasting{
	public static void main(String[] args){
	byte x=4;
	int y=x;//widening Casting(Automatically)
	System.out.println(y);
	double Mydouble=6.3134;
	int Myint= (int) Mydouble;//Narrowing Casting(Manually)
	System.out.println(Myint);
		
	}
}