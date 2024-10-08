import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String partyAF = "";

        System.out.println("enter your political party    [R,D,I]");
        partyAF = console.nextLine();

        if(partyAF.equalsIgnoreCase("R")) {
            System.out.println("you are a republican");

        } else if (partyAF.equalsIgnoreCase("D")) {
            System.out.printf("you are a democrat");
        } else if (partyAF.equalsIgnoreCase("I")) {
            System.out.printf("you are an independant");
        } else
            System.out.printf("you didnt pick the right option");

    }
}