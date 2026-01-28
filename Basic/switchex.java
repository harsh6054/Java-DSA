import java.util.*;

public class switchex 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        int a, b;
        System.out.print("Enter Number 1: ");
        a = sc.nextInt();
        System.out.print("Enter Number 2: ");
        b = sc.nextInt();
        do 
        {
            System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
            System.out.print("Enter Your Choice: ");
            ch = sc.nextInt();
            switch (ch) 
            {
                case 1:
                    System.out.println("Addition: " + (a + b));
                    break;

                case 2:
                    System.out.println("Subtraction: " + (a - b));
                    break;

                case 3:
                    System.out.println("Multiplication: " + (a * b));
                    break;

                case 4:
                    if (b != 0)
                    {
                        System.out.println("Division: " + (a / b));
                    }
                    else
                    {
                        System.out.println("Error: Division by zero");
                    }   
                    break;

                case 5:
                    System.out.println("Exited...!");
                    break;

                default:
                    System.out.println("Please Enter Valid Choice..!");
            }

        } while (ch != 5);

        sc.close();
    }
}
