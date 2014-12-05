Alright, so you've shown an interest in Java and were directed to this site, but
what is everything, how does it work, and what are Java and Cloud9 anyway?

Java is a computer programming language that is used to tell a computer exactly
what to do.  Computers are dumb machines, they know only how to do operations
exactly as they're told.  Programming is the practice of providing precise, 
unquestionable instructions in order to get a computer to behave in a particular 
way.  In programming, instructions are given to the computer one line at a time,
and the computer processes each line in order from top to bottom, executing the
command that each line represents in sequence.

Programmers are people who understand how to use these instructions to do what
they want.  However, when a programmer writes code, the "code" that they write
is known as source code (sometimes represented as "src"), and is a human-
readable representation of the complex operations that computers take.
Computers do not know how to run source code.  In order to execute instructions,
source code is processed through a program called a "compiler", which interprets
the instructions in their human-readable form and transforms them into what's
called "bytecode" or "machine code", which a computer does understand.  This
process is called "compiling", and must be done every time a change is made to
a program's source code.

Programmers typically write their code into specialized software that takes care
of recognizing mistakes and compiling the code for them.  This is similar to how
office workers might use a word processor to type documents, but for code.  
This software is often referred to as an IDE, or "Integrated Development
Environment".  It's an environment (place) where you develop (write) code, that
is integrated (together) with the compiler and other helpful tools.

In this setup, Cloud9 is the IDE that we're using to develop our Java code.  It
provides an easy way to manage project files, present lessons like this one, and
collaborate with teammates.
    
    On the Left, you'll notice a set of toolbars labled "Workspace", "Navigate",
    and "Commands".  We're mostly interested in workspace because that is where
    we'll manage all of our files from.  Imagine this the same way as you might
    imagine using your home computer to navigate to your documents or music
    folders.
    
    On the Right, you'll see another toolbar with "Collaborate", "Outline", and
    "Debugger".  Collaborate offers a chat box amongst all members in the
    workspace, i.e. your teammates, and Outline gives you a visual 
    representation of the layout of your code.  Don't worry with Debugger, 
    that's a complicated tool that we don't necessarily need to use rightn now.
    
    The center of the screen is where you'll spend most of your time on Cloud9.
    This is where you do all of your code writing and editing, and where you run
    your code.  If you haven't changed the layout from the default, then you
    should have a text editor in the top half of the screen and something called
    a "terminal" at the bottom of the screen.  Whenever you edit code, you'll be
    working in the top half of the screen and whenever you run code you'll
    typically see it at the bottom of the screen.  Once you're comfortable, you
    can move tabs around and divide the screen how you like.
    
For the purpose of Team 1829, the Carbonauts, each workspace member will be
given their own project folder.  This is in the form of "Name_Projects".  Inside
of your folder, you have supreme control, and you're allowed to change any code
you want and to make new projects.  Inside of your folder, you should have sub-
folders for projects, each of which will have sub-folders for source (src) code.

Let me explain visually:

    Nick_Projects/
        
        Project1/
            
            bin/
            
            src/
                
                HelloWorld.java
        
        Project2/
            
            ...
    
    You only need to worry yourself about the src/ folder, everything that
    belongs in bin/ is generated when you compile the program (when you hit
    Run).  Every time you make a new project, you MUST make a src/ folder inside
    of it, and all of your code files belong there.  The bin/ folder will be
    created for you the first time you run a project.