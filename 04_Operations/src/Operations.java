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
         *      2. Multiplication * Division / and Modulo %
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
        
        
        /*
         * Ok, it should be easy to pick up on how to do the rest of the classic
         * math operations, but there's one that will be new to most of you that
         * I'm going to talk to you about, which is the Modulo % operator.  The
         * Modulo is much like division, except instead of returning the
         * quotient, it returns the remainder.  Below is a table of examples:
         *
         *      |    A    |    B    |    A / B    |    A % B    |
         *      +---------+---------+-------------+-------------+
         *      |    7    |    3    |    2.33     |      1      |
         *      +---------+---------+-------------+-------------+
         *      |    10   |    6    |    1.66     |      4      |
         *      +---------+---------+-------------+-------------+
         *      |    4    |    2    |    2.0      |      0      |
         *      +---------+---------+-------------+-------------+
         *      |    9    |    4    |    2.25     |      1      |
         *      +---------+---------+-------------+-------------+
         *
         * One common use of the modulo operator is to test if a number is even
         * or odd.  Speaking in terms of remainder, if a number is divided by 2
         * then the remainder MUST be either 0 or 1.  If it's 0, then there's no
         * remainder and the number is divisible by 2, meaning that it must be
         * even.  If it returns 1, then dividing by 2 produced a remainder, which
         * does not happen with even numbers, so it must be odd.
         *
         *      |    A    |    2    |    A / 2    |    A % 2    |
         *      +---------+---------+-------------+-------------+
         *      |    4    |    2    |    2        |      0      |
         *      +---------+---------+-------------+-------------+
         *      |    7    |    2    |    3.5      |      1      |
         *      +---------+---------+-------------+-------------+
         *      |    18   |    2    |    9        |      0      |
         *      +---------+---------+-------------+-------------+
         *      |   201   |    2    |    100.5    |      1      |
         *      +---------+---------+-------------+-------------+
         *
         * Below is an example of how to use the modulo in code.
         */
        
        int testNumber = 12;
        int divisibleBy = 4;
        int remainder = testNumber % divisibleBy;
        System.out.println("Remainder is " + remainder);
        
        /*
         * In the above example, we know that if 0 becomes printed, then
         * testNumber is divisible by divisibleBy.
         */
        
        /*
         * It is important to note that connecting terms together with operators
         * can change not only the value of the expression, but the type.  Also
         * note that two combined terms can be considered one expression with
         * its own value, and that that compound expression can become part of
         * a new expression.  Think of it in the same way as basic algebra.
         *
         * Let's look at a typical algebra problem and then relate it to how
         * expressions are evaluated in code.
         * 
         *      (((5 + 7) / 2) - 3) * (8 * (3 - 1)) 
         *      (([ 12  ] / 2) - 3) * (8 * (3 - 1))
         *      ([     6     ] - 3) * (8 * (3 - 1))
         *      [        3        ] * (8 * (3 - 1))
         *      [        3        ] * (8 * [  2  ])
         *      [        3        ] * [    16     ]
         *      [                48               ]
         *
         * Each step along the process of solving this problem, we take an
         * expression of two terms and combine it into one term, which is then
         * used in another operation.  This is the mindset that is needed when
         * using multiple operators in Java, as well as programming in general.
         * I'll refer back to this process in a little bit as we look into
         * boolean operators to show you how this can become more useful.
         */
        
        /*
         * Now for the boolean operators.  Since booleans are simply true/false
         * values, their operators have to do with logic.  Some of the common
         * boolean operators are:
         *
         *      Note: If an operator does not evaluate to true, then it must
         *      be false.
         *
         *      &&      AND ----------------------- True only if both sides are true.
         *      ||      OR ------------------------ True if at least one side is true.
         *      !       NOT ----------------------- Inverts value; Turns True->False or False->True.
         *      ==      EQUAL --------------------- True if both sides are equal.
         *      !=      NOT EQUAL ----------------- True if sides are not equal.
         *      <       LESS THAN ----------------- True if the left side is less than the right.
         *      <=      LESS THAN OR EQUAL TO ----- True if the left side is less than or equal to the right.
         *      >       GREATER THAN -------------- True if the left side is greater than the right.
         *      >=      GREATER THAN OR EQUAL TO -- True if the left side is greater than or equal to the right.
         *
         * Boolean operations can often be phrased as a question.  Imagine
         * that each time you try to solve a boolean expression, you ask a
         * Yes/No question.  If the answer is Yes, then the expression is true,
         * and if it's no, then it's false.  Below are examples of simple 
         * boolean operations.
         *
         *      |   A   |   B   |  Operation  |  Expression  |  Result  |  Explanation  |
         *      +-------+-------+-------------+----------+------------------------------+
         *      | true  | true  |     &&      | true && true |   true   | true and true? Yes.
         *      +-------+-------+-------------+--------------+----------+---------------+
         *      | true  | false |     &&      | true && false|  false   | true and false? No.
         *      +-------+-------+-------------+--------------+----------+---------------+
         *      | false | false |     &&      |false && false|  false   | false and false? No.
         *      +-------+-------+-------------+--------------+----------+---------------+
         *      | true  | false |     ||      | true || false|   true   | true or false? Yes.
         *      +-------+-------+-------------+--------------+----------+---------------+
         *      | true  | true  |     ||      | true || true |   true   | true or true? Yes.
         *      +-------+-------+-------------+--------------+----------+---------------+
         *      | false | false |     ||      |false || false|  false   | false or false? No.
         *      +-------+-------+-------------+--------------+----------+---------------+
         *      | true  |       |     !       |    !true     |  false   | Not true = false.
         *      +-------+-------+-------------+--------------+----------+---------------+
         *      | false |       |     !       |    !false    |  true    | Not false = true.
         *      +-------+-------+-------------+--------------+----------+---------------+
         *
         */
         
        System.out.println("True and true? " + (true && true));
        System.out.println("True and false? " + (true && false));
        System.out.println("False and false? " + (false && false));
        System.out.println("True or true? " + (true || true));
        System.out.println("True or false? " + (true || false));
        System.out.println("False or false? " + (false || false));
        System.out.println("Not true? " + (!true));
        System.out.println("Not false? " + (!false));
         
         /*
         * The above operators, AND && OR || and NOT ! are used for comparing
         * two boolean values only.  Other operators, such as ==, !=, <, <=, >,
         * and >= , COMPARE two values on either side of
         * the operator.  These values do not have to be boolean values (Can you
         * imagine using greater than or equal on a true/false?), although they
         * can be (Yes, you can say true == true).  Comparator operators are
         * typically used to compare two numbers, then they return a boolean
         * result of the outcome.  Again, imagine each comparison as a question.
         *
         *      |  A  |  B  |  Operation  |  Expression  |  Result  |  Explanation  |
         *      +-----+-----+-------------+--------------+----------+---------------+
         *      |  5  |  3  |      >      |    5 > 3     |   true   | Is 5 greater than 3? Yes.
         *      +-----+-----+-------------+--------------+----------+---------------+
         *      |  5  |  5  |      >      |    5 > 5     |   false  | Is 5 greater than 5? No.
         *      +-----+-----+-------------+--------------+----------+---------------+
         *      |  5  |  5  |      >=     |    5 >= 5    |   true   | Is 5 greater than or equal to 5? Yes.
         *      +-----+-----+-------------+--------------+----------+---------------+
         *      |  5  |  3  |      ==     |    5 == 5    |   true   | Is 5 equal to 5? Yes.
         *      +-----+-----+-------------+--------------+----------+---------------+
         *      |  5  |  3  |      !=     |    5 != 5    |   false  | Is 5 not equal to 5? No.
         *      +-----+-----+-------------+--------------+----------+---------------+
         *      |  5  |  5  |      !=     |    5 != 3    |   true   | Is 5 not equal to 3? Yes.
         *      +-----+-----+-------------+--------------+----------+---------------+
         *
         * It might get a little weird to say these out loud, but it may be
         * necessary to understand the outcome of the expression.  Whenever you
         * see a long expression, it may help to think of your own explanations
         * and to chain them together.  Below are coded examples of using
         * comparison operators.
         */
    }
}