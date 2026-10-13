import java.io.InputStream;
import java.util.Scanner;

public class MadLib{



    public static void main(String[] args){
       madlibs();
      
    }

    public static void madlibs() {
        Scanner input = new Scanner(System.in);
        String ogPrompt = "where's";
       
        System.out.print("Enter a name: ");
        String name = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

         System.out.print("Enter a plural noun: ");
        String pluralNoun = input.nextLine();

        System.out.print("Enter a verb ending in -ing: ");
        String verbIng = input.nextLine();

        System.out.print("Enter a place: ");
        String place = input.nextLine();

        System.out.print("Enter a food: ");
        String food = input.nextLine();

        System.out.print("Enter a number: ");
        String number = input.nextLine();

         System.out.print("Enter an animal: ");
        String animal = input.nextLine();
//making sure there is a uppeer case and lower case 
        String fixedName = name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase();
// turing name into the first three letters plus inator 
             String nickname = name.substring(0, 3) + "-inator";
    
            int mid = place.length() / 2;
        String firstHalf = place.substring(0, mid);
        String secondHalf = place.substring(mid);

        System.out.println();
        System.out.println("your story");
        System.out.println("tell "+ fixedName +" that his "+ food+ " is in the " + place+ " can we get to business, in the " + adjective +" "+ place + " you got the money "+animal+"? "+ verbIng +" under the table. "+ pluralNoun + " need to go becuase he's been waiting for "+ number +" minutes and " + nickname + " doesn't like waiting "); 







        

        
        

    }    
}
