//DEFINITIONS ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//#1: Methods
    //A method is a block of code where work gets done
    //A method is a block of code which only runs when it is called.
    //Methods are used to perform certain actions, and they are also known as functions.
    //You can pass data, known as parameters, into a method.
    //a method can take zero or more inputs, and it can return zero or one inputs
    //methods can only be used if an object of the class is created and then that object can use the classes methods unless you create a static method(#6)
//#2: Functions vs methods
    //Function — a set of instructions that perform a task. Method — a set of instructions that are associated with an object/class
//#3: Methods return values
    //Void: means that this method does not have a return value. Which means it is not outputting a value(printing out something doesn't count as returning something because you aren't getting any value back)the prints out is displaying something on the screen, but it's not actually returning anything to the caller of the method
    //Or it can be any of the data types; String, class, array etc.
//#4: Naming conventions for methods
    //Ideally java methods should have a verb in them because methods do something when called on
    //Methods should be written in camelcase, it is not required but is convectional
    //Method names can start with an underscore but is not recommended
    //Method names cannot start with numbers or symbols other than underscores
    //Method names can have numbers in the middle and at the end of method names, but it's rare that you'll even need to do that
    //Method name has to be followed by a parentheses. The parenthesis tells Java that this will be a method
//#5: parameters
    //Information can be passed to methods as parameter. Parameters act as variables inside the method.
    //Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.
//#6: Static method
    //A static method is a method that belongs to a class rather than an instance of a class (object). This means you can call a static method without creating an object of the class. Static methods are sometimes called class methods.
//#7: Static Variable
    //is a variable which belongs to the class and initialized only once at the start of the execution. It is a variable which belongs to the class and not to object(instance)
//#8: Static Initializers
    //is a field that lets you create complex data
//ENDING FOR DEFINITIONS----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


public class Person {

//STATIC VARIABLE/FIELDS-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private String middleName ="Selvi";
    //this is a static variable(#7) which can be used in anywhere because it can exist prior to the existence of an object or a class instance. You can see this in method main and test
    //none static variable like the one above can only exist after the object or intense of class has been created
    //all class instances us the same static method which means they get one copy of the PI variable to share amongst all of them
    //however the none static members variables belong to their own instance of the Person class so each object has its own middle name variable
    public double PI = 3.14;

//ENDING FOR STATIC VARIABLE-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//STATIC INITIALIZER------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //if you wanted to have a big set of data but you cant fit it in one line you can create a static initializer(#8)
    //here we initialize the array, and then we assigned variables to it in the static initializer(#8)
    public static int[] nums = initNums();

    //when java sees the static initializer it will run the block of code like it's a method. it will do this as soon as you declare the class that its in
    //ANATOMY OF A STATIC INITIALIZER
        //A static initialization block starts with the static keyword and has braces, { }.
        //inside the braces you put the data that you need
    static {
        nums = new int[5];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 7;
        nums[4] = 1;
    }
    //another way you can create a static initializer is by putting in a traditional method
    //this one is more obvious on how it works
    public static int[] initNums() {
        int[] nums = new int[5];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 7;
        nums[4] = 1;
    }
//ENDING FOR STATIC INITIALIZER------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//METHODS------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //ANATOMY OF A METHOD
        //first comes the access modifiers
        //then next bit is declaring what kind of data this method can output(#3)
        //the last bit is the name of the method with periphrasis at the end
        //in the parenthesis is where you can insert parameters(#5)
        //inside the method you make it do something
    public void sayHello(){
        System.out.println("Hello");
    }
    public void saySomething(String message){
        System.out.println(message);
    }
    //this method uses a char return value(#3) which means the function will return a character to the caller when it is finished
    public char getMiddleInitial(){
        return middleName.charAt(0);
    }


//PARAMETERS---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //here is an example of how to use parameters
    // first you have to declare what kind of data type the parameters is
    // then the name of parameter (#5)
    public int add(int num1, int num2){
        return num1 + num2;
    }
//ENDING FOR PARAMETERS---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//MULTIPLE VALUES---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //this methods will show how to take any number of inputs(parameters) if you don't know how many inputs you will receive
    //another example of this is in the main method (String[] args)
    //1)there is two ways you can do this the first way you create an array and then the name of the parameter
    public void test(String[] words){
        //do something clever with words
    }

//VARARGS---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //2) the second way is to use the varargs(variable number of arguments) technic.
    //this method is a lot simpler the then example above
    //ANATOMY OF VARARGS
    //first you make a method
    //then you create a varargs in the parameter
    //first you set the data type you want with three dots which will indicate it will be a vararg
    //then name you should name the vararg
    public void test2(String... words){
        //do something clever with words
    }


    //here is an example with more than just the varargs in the parameter
    //for this to work the vararg has to be the last parameter
    public void test3(int num1, int num2, String... words){
        //do something clever with words
        System.out.println(words[0]);
    }

//ENDING FOR VARARGS-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//ENDING FOR MULTIPLE VALUES-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//STATIC METHOD(#6)
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //in java the default starting point has to be a method that is public and static
    //one reason for making a method static is so that you can use it as the entry point or starting of a program.So you cannot run the program if you don't have a static method like main
    //another case where you can sue static methods is called unity class. Which is a class that has a lot of useful methods in them that help to get things done.
    //there are others way to use static methods that I might see later on
  //the main method is here so that it can run the program. Usually its placed in a class of its own but for the simplicity its here
    public static void main(String[] args){
        //creating an object of a person my using the person blueprint
        Person p1 = new Person();
        //then telling the object I created to use one of its methods
        p1.sayHello();
        p1.saySomething("My groovy message");
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(5,3));
        //1)ORIGINAL WAY: this is how you can on method that doesn't know how many inputs it will receive
        //here you have to create a new string object with square brackets and state the variable you want inputted with parenthesis
        p1.test(new String[] {"one", "two", "three"});
        //2)VARARGS: this is how you can on method that doesn't know how many inputs it will receive
        //this way you have to call on the method and state the variables you want to input in parentheses
        p1.test2("one", "two", "three");
        //here is an example with more than just the varargs in the parameter
        //for this to work the vararg has to be the last argument
        //java will understand that the last arguments is the vararg and the first two are num1 and num2
        p1.test3(5,2, "one", "two", "three");
        System.out.println(Person.PI);

    }
//ENDING FOR STATIC METHODS-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//ENDING FOR METHODS-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}
