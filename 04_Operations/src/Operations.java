/**
 * In this lesson, we'll talk about some operators for Numerical and Boolean
 * data types.  You're probably familiar with most of the numerical operations,
 * such as Addition, Subtraction, Multiplication, and Division (+, -, *, / 
 * respectively), but I'll introduce other mathematical operators such as the
 * Modulo (%) as well as Boolean operators such as And, Or, Not, Equals,
 * Greater Than (or equal), and Less Than (or equal) (&&, ||, !, ==, >, >=, <,
 * <=).
 */
public class Operations
{
    public static void main(String[] args)
    {
        /*
         * Let's start with mathematical operations.  These are used exactly how
         * you might imagine: to take two or more numerical values and operate
         * them on one another.  These operations may be chained together, but
         * their precedence takes place in the same way as mathematics:
         * 
         *      1. Parentheses () and Exponent ^
         *      2. Multiplication * Division / and Modulus %
         *      3. Addition + and Subtraction -
         *
         * If you're unsure of what order an expression might execute in, add
         * parentheses for clarity.  Below are examples of using some of these
         * operators.
         */
        
        int savings = 5000;
        int checking = 1000;
        int totalBalance = savings + checking;
        System.out.println("The total balance is " + totalBalance);
        
        
        double bill = 60.00;
        double tipPercent = 0.15;
        double total = bill + (bill * tipPercent);
        System.out.println("The total owed with tip is " + total);
        
        
        
    }
}