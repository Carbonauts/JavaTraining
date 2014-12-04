/**
 * In this program we're going to learn what variables are, what they do, and
 * how to use them.
 */
public class Variables
{
    /* 
     * Inside the class, we can have two types of 'things', METHODS and FIELDS.
     * A method is also known as a function, and is a block of code that has
     * actions to run.  Methods are DO-ERS.  A field is a variable, or a piece
     * of computer memory that has a NAME and a VALUE.
     */
     
    /**
     * Let's make our first variable.  When DECLARING a variable, you must give
     * it a type, a name, and eventually, a value.  This variable will be named
     * "words", have a type of "String" (a text value), and hold a value of
     * "Hello, World!".
     */
    static String words = "Hello, World!";
    
    /**
     * The MAIN function is an example of a METHOD.  It has a name, a type (void),
     * and a block { } that it executes (its "action").
     */
    public static void main(String[] args)
    {
        /*
         * Here, we're going to use the System.out.println() method again.  This
         * is a method that is provided by Java itself, but later I'll show you
         * how you can make your own methods that do what you want.  For now,
         * just know that System.out.println() will print anything you put in
         * the parentheses to the screen.  Right now, we're going to print out
         * the value of the "words" variable.
         */
        System.out.println(words);
         
        /*
         * Notice that when we referenced 'words', we did NOT use any type of
         * quotation marks.  Double-quotes "" are only used to represent hard-
         * coded text values like a String (hence, when we declared 'words', we
         * used quotes when setting the value).
         *
         * Variables are not definite.  After you give them a value, you can go
         * back and change it.  This allows them to 'vary' (get it? like
         * VARYables).  Every time you give a variable a new value, it is called
         * DEFINING the variable.  This is different than DECLARING because you
         * are not creating a brand-new variable, but rather giving an existing
         * variable a new value.  A variable can be re-defined like so...
         */
        words = "Goodbye, World! :(";
          
        /*
         * Now, if we print out the contents of 'words', we'll see something
         * different than our last print...
         */
        System.out.println(words);
        
        //Neat trick, use empty parenthesis to print a blank line!
        System.out.println();
        
        /*
         * So, now we know all about Strings, but there are several other types
         * of variables as well.  These include, but are not limited to...
         *
         *      int
         *                  A typical integer, positive or negative whole numbers.
         *      long
         *                  Similar to an integer (whole numbers only), but
         *                  has more memory for longer numbers (sometime used
         *                  for keeping time).
         *      double
         *                  Another type of number value, but instead holds
         *                  decimal values as well.
         *      boolean
         *                  Not a number value at all, but what's called a 
         *                  'binary' value.  A boolean variable can only ever
         *                  be one of two possible values, true or false.
         *      char
         *                  A char (character) is similar to a String (as in it 
         *                  holds text), but it only holds one character wheras 
         *                  a String can hold entire words or sentences.  
         *                  Sometimes chars are useful because they take less 
         *                  memory than Strings.
         *      String
         *                  Yes, we've already seen Strings but I'm including
         *                  it anyway.  If you notice, String is uppercase even
         *                  though the others are lowercase.  This is because
         *                  the other variables are what are called 'primitive'
         *                  types.  String is actually a type of 'object',
         *                  though we'll cover what that means later.  Just know
         *                  that String always needs to be uppercase.
         *
         * Below are examples of how to declare AND define each of these types
         * of variables.
         */
         
        int integer = 12;           //small number with no decimal
        long time = 24000;          //large number with no decimal
        double change = 17.84;      //number WITH a decimal
        boolean isAwesome = true;   //value can be true or false ONLY
        char letter = 'A';          //one character, must have single quotes ''
        
        /*
         * Here's some neat tricks I'll use to print each value.  The first trick
         * is that using print rather than println will not start a new line.
         *
         * P.S. The ! is just for enthusiasm, it's not necessary in order to 
         * run the program :P
         */
        
        System.out.print("Integer: ");
        System.out.print(integer);
        System.out.println("!");
        
        /*
         * The second trick is that you can do what's called 'concatenating',
         * where you link several things together with + signs.
         */
        
        System.out.println("Long: " + time + "!");
        
        System.out.println("Double: " + change + "!");
        
        System.out.println("Boolean: " + isAwesome + "!");
        
        System.out.println("Character: " + letter + "!");
        
        /*
         * Notice that every time we DECLARE a variable, we need the TYPE
         * and the NAME.  When we DEFINE a variable, we need only the NAME
         * and the VALUE.  You can also declare a variable WITHOUT defining it,
         * which means that we've allocated (saved) enough memory for that
         * variable, but we haven't yet put a value into it.  Here is an example
         * of declaring a variable without defining it, and defining it later.
         */
        
        String thingsToSay; //Declares a new variable without a value.
        
        /*
         * Now, what would happen if we tried to print 'thingsToSay' right now?
         * Well, we've only DECLARED that variable, but we haven't filled it with
         * any value, so if we tried to, say, print it
         *
         *      System.out.println(thingsToSay);
         * 
         * then the compiler will give an error saying that the variable might
         * not be initialized.  A variable can exist without a value no problem,
         * but you can't try to retrieve a value from it until you've filled it.
         */
        
        thingsToSay = "I'm defining a variable!"; //Defines an existing variable
        
        System.out.println(thingsToSay);
    }
}