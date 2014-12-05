/**
 * In programming, the computer reads code from top to bottom and executes each
 * line of code in order.  This means that if you don't change the code between
 * each execution, then it will produce the same output every time it's run,
 * essentially turning the computer into a glorified calculator.  We don't want
 * that, instead what we want is for the computer to take different actions
 * based on certain condtions, whether that's user input or random chance.
 * If statements allow computers to decide what to do.  Here's how they work.
 */
public class Conditions
{
    public static void main(String[] args)
    {
        /*
         * An if statement has two major components: an evaluation and an action.
         * Before we talk about each, let's take a look at what an if statement
         * looks like.
         *
         *      if(condition)
         *      {
         *          action;
         *      }
         *
         * In an if statement, the computer can do one of two things.  It can
         * either run the action inside its { braces } or it can skip it.  The
         * way it chooses is based on the condition inside of the ( parentheses ).
         * If you recall, boolean values can have a value of true or false.  If
         * statements require that the condition in the ( parentheses ) is a
         * boolean TYPE.  If the VALUE of the condition evaluates to true, then
         * the action runs.  If the value of the condition evaluates to false,
         * then the action is skipped and does not run. Let's look at an example.
         */
        
        if(true)
        {
            System.out.println("The action gets run!");
        }
        
        /*
         * That example is fairly straightforward.  Since the condition is always
         * true, the action will always run.  However, the condition may also
         * be a boolean VARIABLE.  When the if statement runs, it retrieves the
         * value from the variable and compares it to be true or false.
         * Example time!
         */
        
        boolean isProgrammingAwesome = true;
        
        if(isProgrammingAwesome)
        {
            System.out.println("Programming is awesome!");
        }
        
        /*
         * Let's get fancier.  What if you want one action to run if the condition
         * is true, but a different action if the condition is false?  Well, if
         * statements can have an ELSE statement attached to them that contains
         * its own block that will only ever run if the condition is false.
         */
        
        boolean wantToDoHomework = false;
        
        if(wantToDoHomework)
        {
            System.out.println("What a poster child! :)");
        }
        else
        {
            System.out.println("What a rebel! :o");
        }
        
        /*
         * Ok, now we know how to choose between two choices, but what if we're
         * dealing with a more complicated problem that needs the comuter to 
         * choose one of three or more options?  Well, the condition inside of
         * an if statement simply needs to evaluate to a boolean value, but it
         * doesn't have to come from a VARIABLE.  Just like in math, booleans
         * can have expressions.  Boolean expressions typically check if two
         * values are equal or not equal, greater than or less than, etc.
         * We can use expressions like this to create scenarios in which there
         * are more than two possible outcomes, and we can use another type of
         * if block, the ELSE IF.  The else/if statement must be located directly
         * below an if statement, and it will only run if the original if 
         * statement's condition comes up false AND the else/if statement is true.
         *
         * Below is an example where we use the equality, less-than, and greater-
         * than operators (which we'll cover in greater detail in the next
         * lesson) in an else/if statement.
         */
        
        int johnnyAllowance = 5;
        int billyAllowance = 6;
        
        if(johnnyAllowance > billyAllowance)
        {
            System.out.println("Johnny's allowance is greater than Billy's!");
        }
        else if(johnnyAllowance < billyAllowance)
        {
            System.out.println("Billy's allowance is greater than Johnny's!");
        }
        else
        {
            System.out.println("Johnny and Billy have the same allowance!");
        }
        
        /*
         * Notice that the else/if statement has its own conditional statement.
         * This is because the else/if has it's own triggers that it needs to run
         * but only in the case that the first if statement does not.  Think of
         * it this way:
         *
         *      IF Johnny's allowance is greater than Billy's allowance
         *          
         *          //Do some action
         *
         *      OTHERWISE, IF Johnny's allowance is less than Billy's allowance
         *
         *          //Do another action
         *
         *      OTHERWISE,
         *
         *          //Do the last action
         *
         * If/Else if/Else statements can be stacked like this and have an
         * INFINITE number of else/if statements.  The only requirement is that
         * the first else/if statement must come AFTER an if statement, and the
         * else statement must come AFTER all other statements.
         *
         * Let's imagine a situation in which you want the computer to do 
         * something different under each of 5 different circumstances.  To
         * symbolize this, we're simply going to use an integer that will be any
         * value between 1 and 5.
         */
        
        int circumstance = 2;
        
        if(circumstance == 1)
        {
            System.out.println("Circumstance 1!");
        }
        else if(circumstance == 2)
        {
            System.out.println("Circumstance 2!");
        }
        else if(circumstance == 3)
        {
            System.out.println("Circumstance 3!");
        }
        else if(circumstance == 4)
        {
            System.out.println("Circumstance 4!");
        }
        else if(circumstance == 5)
        {
            System.out.println("Circumstance 5!");
        }
        else
        {
            /*
             * Now, if it happens to be that none of the previous cases have
             * executed, that means that none of their conditions has been true.
             * For this particular example, that means that the variable
             * 'circumstance' was not equal to any number from 1 to 5.  In many
             * cases, an ELSE statement is used to detect if there has been
             * a problem in the code, such as when an improper option is chosen.
             * It's useful to print an error so that it's easy to see that 
             * something fell through.
             */
            
            System.out.println("Circumstance was not 1-5! Something went wrong!");
        }
    }
}