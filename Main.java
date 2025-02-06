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
      toBuy.add("Olive Oil");
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

      // .set(int index, obj) REPLACES element at that index with the new obj
      // returns the replaced element (same type as the list holds)
      String replacedElement = toBuy.set(4, "Garlic");
      System.out.println(toBuy);
      // Often, you won't need to store the return output
      toBuy.set(5, "Parmesan Cheese");
      System.out.println(toBuy);

      //.removes(int index) DELETES element at that index
      // returns the removed object (same type as the list holds)
      String removedElement = toBuy.remove(0);
      System.out.println(toBuy);
      System.out.println("Moved to shopping cart: " + removedElement);
      // ALSO shifts all remaining elements to the left (lower index)
      // Often, you won't need to actually store the removed item
      toBuy.remove(2);
      System.out.println(toBuy);

      // PRACTICE: Translate Array actions to ArrayList actions
      ArrayList<String> toDoList = new ArrayList<String>();
      toDoList.add("Do homework");
      toDoList.add("Help make dinner");
      toDoList.add("Call grandma");
      System.out.println(toDoList);
      toDoList.set(1, "Order pizza");
      System.out.println(toDoList);
      System.out.println(toDoList.size() + " things left to buy!");
      System.out.println("Here's the first thing to do: " + toDoList.get(0));
      toDoList.remove(0);
      System.out.println(toDoList);

      // 7.3 Traversing with Loops
      ArrayList<Integer> bingoNumbers = new ArrayList<Integer>();
      bingoNumbers.add(99);
      bingoNumbers.add(29);
      bingoNumbers.add(77);
      bingoNumbers.add(13);
      // ENHANCED FOR-EACH LOOP
      int total = 0;
      int product = 1;
      for (Integer num : bingoNumbers) {
         total = total + num; // same as total += num
         product *= num;
      }
      System.out.println("Sum of bingo numbers: " + total);
      System.out.println("Product of bingo numbers: " + product);

      // STANDARD FOR LOOP (indexed)
      int sum = 0;
      //DIFFERENT from Arrays:
      // 1. use ArrayList.size() instead of Array.length
      // 2. use ArrayList.get(i) instead of Array[i]
      for (int i=0; i < bingoNumbers.size(); i++) {
         sum = sum + bingoNumbers.get(i);
      }
      System.out.println(sum);

      // WHILE LOOPS (for conditionals, when you don't know exactly how many times to loop)
      ArrayList<String> watchList = new ArrayList<String>();
      watchList.add("The Office");
      watchList.add("A.P. Bio");
      watchList.add("Modern Family");
      watchList.add("Brooklyn 99");
      System.out.println("Current watch list: " + watchList);

      // Example: search and remove
      boolean found = false; // haven't searched yet
      int index = 0; // need index to use list methods
      String watchedShow = "Modern Family";
      // loop while current index is still less than list size 
      while (index < watchList.size()) {
         if (watchedShow.equals(watchList.get(index))) {
            watchList.remove(index);
            found = true;
            index++;
         }
         else {
            index++;
         }
      }
      System.out.println(watchList);
      

   }
}
