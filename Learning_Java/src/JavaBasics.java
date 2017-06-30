
public class JavaBasics {
int A;
static int B=50;
String Name;

public JavaBasics()
{
	A=5;
	Name="siri";
}
/*public JavaBasics(int x,String y)
{
	A=x;
	Name=y;
}*/
public JavaBasics(int A,String Name)
{
	this.A=A;
	this.Name=Name;
	
}
	public static void main(String[] args) {
		
		JavaBasics obj1=new JavaBasics();
		JavaBasics obj2=new JavaBasics(12,"Harshu");
		JavaBasics obj3=new JavaBasics(25,"Pandu");

		System.out.println(obj1.A);
		System.out.println(JavaBasics.B);
        System.out.println(obj1.Name);
		System.out.println(obj2.A);
		System.out.println(obj2.Name);
		System.out.println(JavaBasics.B);
		System.out.println(obj3.A);
		System.out.println(obj3.Name);
		System.out.println(JavaBasics.B);



		

	}

}
