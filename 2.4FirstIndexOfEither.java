public class Main {
  public static void main(String[] args) {
    // test the method here
    int index = firstIndexOfEither("Hello World", "or", "ello");
    System.out.println(index);
  }
// explain that I changed the return type from String to int
  public static int firstIndexOfEither(String one, String two, String three) {
    // break up the search into two parts
    int a = one.indexOf(two, 0);
    int b = one.indexOf(three, 0);
    
    // check to see which one comes first 
      // the smaller number (explain index )
    if(a < b) {
      return a;
    }
    else {
      return b;
    }
  }
}