// Import the ArrayList CLASS
// (from the java.util PACKAGE)
import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      // DECLARE an ArrayList object
      // Type <> is required, each ArrayList can hold one type of object
      ArrayList<String> buzzwords; 

      // DECLARE & CREATE an ArrayList
      // by calling the CONSTRUCTOR method
      ArrayList<String> shoppingList = new ArrayList<String>();

      // ArrayList can ONLY store OBJECTS!! 
      // so for int and double (primitive types)
      // you must use their WRAPPER CLASSES
      // Integer ad Double "wrap" primitives into OBJECTS
      // objects have methods, primitives don't 
      ArrayList<Integer> ages = new ArrayList<Integer>();
      ArrayList<Double> testScore = new ArrayList<Double>();
      // Java will handle the "wrapping" for you, 
      // this is called AUTOBOXING

      // Use the .add( obj ) METHOD to populate/fi;; list
      testScore.add(40.00);
      System.out.println(testScore); // prints [40.0]

      // 7.2 ArrayList METHODS
      // after "new", make call to the CONSTRUCTOR
      ArrayList<String> toBuy = new ArrayList<String>();

      // .add(object) appends object to END OF LIST
      toBuy.add("Dog Food");
      toBuy.add("Pasta");
      toBuy.add("Shrimp");
      toBuy.add("Celery");
      System.out.println("SHOPPING LIST: ");
      System.out.println(toBuy);

      //.size() returns int -> number of items 
      System.out.println(toBuy.size() + " things left to buy!");

      // .add(int index, obj) -> "INSERT" at index
      toBuy.add(3, "Broccoli");
      System.out.println(toBuy);
      // ALSO shifts over elements from that index on 

      // .get(int index) returns an object of the same type as the list holds
      // like array[int index]
      int lastIndex = toBuy.size() - 1;
      String lastElement = toBuy.get(lastIndex);
      System.out.println(lastElement);
      System.out.println(toBuy.get(2));

   }
}
