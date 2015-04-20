import java.io.*;
class Employee implements java.io.Serializable
{
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
   }
}
public class SerializeDemo{
   public static void main(String [] args){
      Employee e = new Employee();
      e.name = "Andrew O'Neill";
      e.address = "123 Fake Street, FakeTown";
      e.SSN = 11111111;
      e.number = 1234;
      try{
         FileOutputStream fileOut =
         new FileOutputStream("tmp/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      }catch(IOException i){
          i.printStackTrace();
      }
   }
}
