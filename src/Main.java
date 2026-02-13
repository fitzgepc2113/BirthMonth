import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int birthMonth = 0;

        System.out.print("Enter your birth month [1-12]: ");




            birthMonth = input.nextInt();
            input.nextLine();

            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
                System.out.println("Run the program again!");
                System.exit(0);

            }


    }
}



