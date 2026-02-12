import java.util.Scanner;
/*  
* Updated by Jorge Flores (3-16-2025)
* Added input validation using a getNumber() function to prevent crashes,
* Added a repeat loop so the user can perform multiple calculations,
* Included a clean exit prompt for a smoother user experience.
* Cleaned up redundant variable declarations for a more organized structure.
* Fixed switch indentation for clearer, more readable code.
*/ 
public class Calculator{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        boolean running = true;
        double result, num1, num2;
        char operator,userChoice;
        
        System.out.println("<<<<<<Simple Calculator:>>>>>>");
        
        while(running){   
            num1 = getNumber(input, "Enter first number: ");
            System.out.print("Enter an operation(+,-,*,/): ");
            operator = input.next().charAt(0);
            num2 = getNumber(input, "Enter second number: ");
            
            // Added indentation for readability
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
            System.out.print("Continue calculating? (y/n): ");
            
            userChoice = input.next().charAt(0);         
            while(userChoice != 'n' && userChoice != 'y'){
                System.out.print("Error must enter (y/n): ");
                userChoice = input.next().charAt(0);

            }

            if(userChoice == 'n'){
                running = false;
                System.out.println("Program Over");

            } 

        }
    }
    
    // Function to safely get a valid number from user
    public static double getNumber(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            String userInput = input.next();

            try {
                return Double.parseDouble(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}

