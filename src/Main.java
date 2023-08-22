import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 0 for Normal mode OR 1 for Opposite mode :");
        int mode=scanner.nextInt();
        boolean isOppositeMode=(mode==1);
        SpecialCalculator specialCalculator=new SpecialCalculator(isOppositeMode);
        System.out.println("Enter the Choice:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction:");
        int choice=scanner.nextInt();
        if (choice==1)
        {
            System.out.println("Enter the First Number:");
            int number1=scanner.nextInt();
            System.out.println("Enter the Second Number:");
            int number2=scanner.nextInt();
            int result=specialCalculator.add(number1,number2);
            System.out.println("Result : "+result);
        }
        else if(choice==2)
        {
            System.out.println("Enter the First Number:");
            int number1=scanner.nextInt();
            System.out.println("Enter the Second Number:");
            int number2=scanner.nextInt();
            int result=specialCalculator.sub(number1,number2);
            System.out.println("Result : "+result);
        }
        else{
            System.out.println("Invalid Operation.");
        }
    }
}
class  SpecialCalculator
{
    boolean isOppositeMode;

    public SpecialCalculator(boolean isOppositeMode) {
        this.isOppositeMode=isOppositeMode;
    }
    public int add(int a,int b)
    {
        return isOppositeMode?a-b:a+b;
    }
    public int sub(int a,int b)
    {
        return isOppositeMode?a+b:a-b;
    }
}