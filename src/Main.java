
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the postfix expression : "); //get expression from the user
        String expression = sc.next(); //storing in String variable

        char[] char1 = expression.toCharArray(); //convert the string variable to the char array

        Stack stack = new Stack(char1.length); // create a new stack object

        int tempCount = 1; //get a variable tempcount
        for (char c : char1) { //Traversing the char1 array
            if (Character.isLetter(c)) {
                stack.push(String.valueOf(c)); //If the character is an operand push it to the stack
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String tempVariable = "TEMP" + tempCount++;

                switch (c) {
                    case '+':
                        System.out.println("LD "+operand1);
                        System.out.println("AD "+operand2);
                        System.out.println("ST "+tempVariable);
                        break;
                    case '-':
                        System.out.println("LD " +operand1);
                        System.out.println("SB "+operand2);
                        System.out.println("ST "+tempVariable);
                        break;
                    case '*':
                        System.out.println("LD "+operand1);
                        System.out.println("ML "+operand2);
                        System.out.println("ST "+tempVariable);
                        break;
                    case '/':
                        System.out.println("LD "+operand1);
                        System.out.println("DV "+operand2);
                        System.out.println("ST "+tempVariable);
                        break;

                }
                stack.push(tempVariable); // store the answer
            }
        }

    }
}