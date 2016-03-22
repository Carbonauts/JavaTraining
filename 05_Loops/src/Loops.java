/**
 * In typical program execution, the computer runs each line of code one after
 * the next.  However, some pieces of code need to run more than once depending
 * on the state of the program.  To do this, programmers make use of loops,
 * which are blocks of code that run until a certain number of iterations have
 * been executed or until a certain condition is met.
 */
public class Loops
{
    public static void main(String[] args)
    {
        /*
         * If we know beforehand exactly how many times we want a particular
         * piece of code to run, we can use a FOR loop.  A simple for loop looks
         * something like this:
         */
         for(int i = 0; i < 10; i++)
         {
             System.out.print("Hi! ");
         }
         
         /*
          * In the parentheses are three important segments separated by
          * semicolons.  The first segment is an initilization that runs once
          * when the loop is first launched.  It is most commonly used in the
          * way shown above in which an integer "i" is initialized to a starting
          * value, commonly 0.  The second segment is the conditional evaluation,
          * and determines whether the loop should repeat or finish.  In this
          * case, it checks "is i less than 10?" if so, it continues looping.
          * Otherwise, the loop exits.  The last segment is an action that is
          * executed after each iteration of the loop IF the loop is going to
          * continue.  In this case, after each iteration, "i" is incremented.
          * This effectively steps up "i" as the iteration counter.
          * 
          *     for(INITIALIZE; CONDITION; DO) { }
          */
          
          
    }
}