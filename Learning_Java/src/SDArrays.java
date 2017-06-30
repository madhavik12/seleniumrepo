import java.io.DataInputStream;
import java.io.IOException;


public class SDArrays {

	public static void main(String[] args) throws IOException{
int arr[]=new int[4];
DataInputStream d=new DataInputStream(System.in);
System.out.println("Enter array elements");
for(int i=0;i<arr.length;i++)
{
	arr[i]=Integer.parseInt(d.readLine());
	
}
System.out.println("array elements are:");
for(int i=0;i<arr.length;i++)
{
System.out.println(+arr[i]);
}


	}

}
