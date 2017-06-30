
public class JavaFunctions {
int p;
int q;
	public static void main(String[] args) {
		JavaFunctions ob=new JavaFunctions();
		ob.p=10;
		ob.q=15;
System.out.println("Before swap:"+ob.p+"  "+ob.q);
ob.swapval(10,15);
System.out.println("After swap:"+ob.p+"  "+ob.q);
ob.swapref(ob);
System.out.println("After swap:"+ob.p+"  "+ob.q);





	}
public void swapval(int a,int b)
{
	int temp=a;
	a=b;
	b=temp;
	
}
public void swapref(JavaFunctions obj)
{
	int t=obj.p;
	obj.p=obj.q;
	obj.q=t;
}
}
