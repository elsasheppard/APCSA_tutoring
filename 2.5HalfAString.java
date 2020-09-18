public class Main {
  public static void main(String[] args) {
    // test the method here
    String half1 = firstHalfOfString("balloona");
    System.out.println(half1);
    String half2 = secondHalfOfString("balloona");
    System.out.println(half2);  
  }

  // write firstHalfOfString here
  public static String firstHalfOfString(String half1) {
    int length = half1.length(); // length = 8
    int halfLength = length/2; // halfLength = 4 
    // mention how int truncates instead of rounding

    half1 = half1.substring(0, halfLength); // returnString = "ball"
    // 1st param inclusive
    // 2nd param inclusive

    return half1;
  }

  // write secondHalfOfString here
  public static String secondHalfOfString(String half2) {
    int length = half2.length(); // length = 8
    int halfLength = length/2; // halfLength = 4 
    // mention how int truncates instead of rounding

    half2 = half2.substring(halfLength, length); // returnString = "ball"
    // whatever number the 2nd parameter is, that's where it stops before

    return half2;
  }
}