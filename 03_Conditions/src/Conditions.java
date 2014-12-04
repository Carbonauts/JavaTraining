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
    }
}