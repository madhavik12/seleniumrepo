import java.util.ArrayList;


public class arr_list {

	public static void main(String[] args) {
      ArrayList<String> list=new ArrayList<String>();
      list.add("Sun");
      list.add("Moon");
      list.add("stars");
      System.out.println("length of arraylist is"+list.size());
      System.out.println("The arraylist elements are.....");
      for(int i=0;i<list.size();i++)
    	  System.out.println(list.get(i));
      ArrayList<Integer> list1=new ArrayList<Integer>();
      list1.add(12);
      list1.add(15);
      list1.add(19);
      list1.add(17);

      for(int i=0;i<list1.size();i++)
    	  System.out.println(list1.get(i));
     
	}

}
