public class NameGenerator {
    public static void main(String[] args) throws Exception {
     String[] firstNames = {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah", "William"};
     String[] lastNames = {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow", "Tran"};

     for (int a = 0; a < firstNames.length; a++){
         String currentFirstName = firstNames[a];
     for (int b = 0; b < lastNames.length; b++){
         String currentLastName = lastNames[b];

     System.out.println(currentFirstName+" "+currentLastName);
            }
        }
    }
}