import java.util.Scanner;

public class VowelScanner {
    public static void main(String[] args) throws Exception {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in a line and hit enter");

        String line = scanner.nextLine();
        
        
        for (int i=0 ; i<line.length(); i++){
            char ch = line.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
               count ++;
            }
         }

         System.out.println("You typed: " + line);
         System.out.println("Number of vowels in the sentence is " + count);

        scanner.close(); 
    }
}
