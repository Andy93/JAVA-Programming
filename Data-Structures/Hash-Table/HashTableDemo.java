import java.util.*;
public class HashTableDemo{
	public static void main(String [] args){
      // Create a hash map
      Hashtable balance = new Hashtable();
      Hashtable balance2 = new Hashtable();
      Enumeration names;
      String str;
      double bal;

      balance.put("Andrew", new Double(16756.40));
      balance.put("Nick", new Double(1234.60));
      balance.put("Dave", new Double(6678.00));
      balance.put("Conor", new Double(-100.90));
      balance.put("Kevin", new Double(-20.00));
      names = balance.keys();
      while(names.hasMoreElements()){
         str = (String) names.nextElement();
         System.out.println(str + ": " +
         balance.get(str));
      }
      System.out.println();
      System.out.println("Balance size: " +
      balance.size());

      bal = ((Double)balance.get("Andrew")).doubleValue();
      balance.put("Andrew", new Double(bal+1000));
      System.out.println("Andrew's new balance: " +
      balance.get("Andrew"));
	    System.out.println();

	    balance2 =(Hashtable)balance.clone();
	    balance.clear();

	    balance2.remove("Dave");

	    names = balance2.keys();
	    while(names.hasMoreElements()){
          str = (String) names.nextElement();
          System.out.println(str + ": " +
          balance2.get(str));
        }
        System.out.println();

        System.out.println("Balance size: " +
        balance.size());
	      System.out.println("Balance2 size: " +
        balance2.size());

   }
}
