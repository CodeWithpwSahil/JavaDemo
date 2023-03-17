import java.util.Scanner;
public class Q1

{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a name of 3 words:");
       String name = in.nextLine();
       
       /*
        * Get the last index
        * of space in the string
        */
       int lastSpaceIdx = name.lastIndexOf(' ');
       
       String surname = name.substring(lastSpaceIdx + 1);
       String initialName = name.substring(0, lastSpaceIdx);
       
       System.out.println(surname + " " + initialName);
    }
}