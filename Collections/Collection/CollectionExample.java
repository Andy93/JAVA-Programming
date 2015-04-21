import java.util.*;
import java.util.Collection;
public class CollectionExample{
   public static void main(String[] args){
      List a1 = new ArrayList();
      a1.add("Andrew");
      a1.add("Conor");
      a1.add("Dave");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);

	    List v1 = new Vector();
      v1.add("Andrew");
      v1.add("Conor");
      v1.add("Dave");
      System.out.println();
      System.out.println(" Vector Elements");
      System.out.print("\t" + v1);

      List l1 = new LinkedList();
      l1.add("Andrew");
      l1.add("Conor");
      l1.add("Dave");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);

	    TreeSet t1 = new TreeSet();
      t1.add("Andrew");
      t1.add("Conor");
      t1.add("Dave");
      System.out.println();
      System.out.println(" TreeSet Elements");
      System.out.print("\t" + t1);

      Set s1 = new HashSet(); 
      s1.add("Andrew");
      s1.add("Conor");
      s1.add("Dave");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      Map m1 = new HashMap(); 
      m1.put("Andrew", "5");
      m1.put("Conor", "3");
      m1.put("Dave", "44");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
   }
}
