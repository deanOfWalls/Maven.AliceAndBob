import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        String alice = "Alice";
        String bob = "Bob";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        if(name.equals(alice) || name.equals(bob)){
            System.out.println("Hello, " + name + "!");
        }
        else{
            System.out.println("I don't know you," + name + ".");
        }





    }
}
