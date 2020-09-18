public class Main {
  public static void main(String[] args) {
   // test the method here
    int one = extractLastDigit(4571);
    System.out.println(one);
    int fourFiveSeven = truncateLastDigit(4571);
    System.out.println(fourFiveSeven);
  }
  
// write extractLastDigit here
  // public static String extractLastDigit(int one) {
    // String oneString = Integer.toString(one);
    // oneString = oneString.substring(oneString.length() - 1, oneString.length());
    
    // one = Integer.parseInt(oneString);
    // return one;
  // }

  public static int extractLastDigit(int one) {
    // explain how mod works
    one = one % 10;

    return one;
  }

  public static int truncateLastDigit(int one) {
    // explain how truncation works
    one = one / 10;

    return one;
  }
}