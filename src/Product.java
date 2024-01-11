public class Product {
   private static int nextId = 0;

   private String type;
   private int id;

   public Product(String foodType) {
      type = foodType;
      id = nextId;

      nextId += 5;
   }

   public void print() {
      System.out.println(type + ": " + id);
   }

   public static int getNextId(){
      return nextId;
   }
}