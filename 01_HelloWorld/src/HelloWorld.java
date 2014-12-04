/**
 * This is a comment! All of the text in here will not be interpreted
 * by the computer and is disregarded.  There are several different
 * ways to do comments.  This one starts with a /**, which means that
 * this comment is technically a 'javadoc', so it is used to describe
 * the piece of code directly under it, in this case, "public class
 * HelloWorld".  This type of comment has to be ended with a / after
 * the last *
 */
public class HelloWorld //The name of the class MUST be the same as the name of the file (without the .java)
{
    /*
     * This is the second type of comment, that starts with /* .
     * This is NOT a javadoc, it's only meant to explain your thoughts
     * This comment is similar to the /** in that it has to be ended
     * with a / after the *
     */
     
    /*
     * Ok, now to explain the program.  In every Java program, you
     * need a function that is set up exactly this way.  This is 
     * called the MAIN function, and is where the execution of the
     * program begins.  After the function declaration, a 'block' is
     * opened with a { brace and closed with a } brace.  Everything
     * included inside of that block is part of the MAIN function and
     * will be run in order, top to bottom.
     */
    public static void main(String[] args)
    {
        /*
         * Everything inside of the parenthesis will be printed out to the
         * screen.
         */
        System.out.println("Hello, World!!");
    }
}

/*
 * Also, notice that through the program, each time there is a new opening
 * brace { the text becomes indented.  This is so that it's easy to keep track
 * of which code belongs inside of each block and also when each block ends.
 */