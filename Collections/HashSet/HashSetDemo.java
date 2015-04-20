import java.util.*;
public class HashSetDemo{
   public static void main(String args[]){
      HashSet hs = new HashSet();
	  if(hs.isEmpty()){
		  System.out.println("Empty");
	  }
	  System.out.println("FILLED");
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
      System.out.println(hs);
	  System.out.println("Size = "+ hs.size());
	  hs.clear();
   }
}
