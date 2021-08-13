public class StringMethods {
    public static void main(String[] args) {
      String str = "Hello";
      String s = new String("Hello");
              /*We placed "Hello" inside of the parentheses that follow .equals.  
                In essence, you could read that line of code as, "Run the equals method on our str variable and compare it against the new value 'Hello'".*/
      System.out.println(str.equals(s));
   
      //use the length() method
      System.out.println(str.length());
   
      //use the indexOf() method / works as an index 0 first 
      System.out.println(str.indexOf('H'));
    }
   }