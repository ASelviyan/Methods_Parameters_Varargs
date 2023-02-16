//DEFINITIONS
//#1: Methods
    //A method is a block of code where work gets done
    //A method is a block of code which only runs when it is called.
    //Methods are used to perform certain actions, and they are also known as functions.
    //You can pass data, known as parameters, into a method.
    //a method can take zero or more inputs, and it can return zero or one inputs
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
public class Person {
    private String middleName ="Selvi";

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

    //here is an example of how to use parameters
    // first you have to declare what kind of data type the parameters is
    // then the name of parameter (#5)
    public int add(int num1, int num2){
        return num1 + num2;
    }

    //this methods will show how to take any number of inputs if you don't know how many inputs you will receive
    //another example of this is in the main method (String[] args)
    //1)there is two ways you can do this the first way you create an array and then the name of the parameter
    public void test(String[] words){
        //do something clever with words
    }
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



    }

}
