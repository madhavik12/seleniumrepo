import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectionsAPI {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
String x="sampleTest";
System.out.println("start");
Method meth=ReflectionsAPI.class.getMethod(x,String.class);
meth.invoke(meth,"hello");
System.out.println("end");
	}
	public static void sampleTest(String x)
	{
		System.out.println("in sample tst ...."+x);
	}

}
