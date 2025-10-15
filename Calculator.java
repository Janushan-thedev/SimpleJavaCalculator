import java.util.Scanner;
public class Calculator{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("<<<<<<Simple Calculator>>>>>>");

        System.out.print("Enter first number: ");
        double num1=input.nextDouble();

        System.out.print("Enter an operation(+,-,*,/): ");
        char operator=input.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2=input.nextDouble();

        double result;

        switch(operator) {
            case '+':
            result=num1+num2;
            break;

            case '-':
            result=num1-num2;
            break;

            case '*':
            result=num1*num2;
            break;

            case '/':
            if(num2==0){
                System.out.println("ERROR: Cannot divide by zero");
                return;
            }
            result=num1/num2;    
            break;

            default:
            System.out.println("Invalid Operator!");
            return;
        }

        System.out.println("Result: "+result);
    }
}