import java.util.Hashtable;


public class hast_table {

	public static void main(String[] args) {
     Hashtable<String,String> table=new Hashtable<String,String>();
     table.put("Name","Harshu");
     table.put("city","london");
     System.out.println(table.size());
     System.out.println(table.get("city"));
     Hashtable<String,String> table1=new Hashtable<String,String>();
     table1.put("age","5");
     table1.put("Zip","e6 1px");
     System.out.println(table1.get("age"));
     System.out.println(table1.get("Zip"));
     Hashtable<String,Hashtable<String,String>> table2=new Hashtable<String,Hashtable<String,String>>();
     table2.put("name",table);
     table2.put("details",table1);

     System.out.println(table2.size());

     System.out.println(table2.get("details").get("Zip"));
     System.out.println(table2.get("name").get("city"));

	}

}
