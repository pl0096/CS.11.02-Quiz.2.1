//Ensure that you read all instructions carefully.
//
//        You will write each of the four methods below.
//
//        All four methods will be inside the Main class (provided).
//
//        For each method that you write, call your method inside the main method by storing the returned value into a variable and then printing out the contents of that variable.
//
//        Declare all methods as static.
//
//        Once you have finished, commit and push your code to Github, inspect your repository to see that your code was successfully pushed, and submit the link to your Github repository on Schoology.
//
//        Good luck, have fun!

public class Main {

    public static void main(String[] args) {
        int resultOne = add(3,5);
        String resultTwo = greeting("Toby Fox");
        int resultThree = add(1,5,6,7);
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
        printMe("14jb ");

    }
// 1. Write a method called add. This method will have two parameters called numOne and numTwo, both of type int. This method will add the two numbers together and return the result (an integer). Call this method inside the main method and store the result in a variable called resultOne. Print this variable using the println statement.
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }

//  2. Write a method called greeting. This method will have one parameter called name of type String. This method will return a string of the format “Bonjour, [name]!”. Call this method inside the main method and store the result in a variable called resultTwo. Print this variable using the println statement.
    public static String greeting(String name){
        return "Bonjour " + name + "!";
    }

//  3. Write a method called add. This method will have four parameters called numOne, numTwo, numThree, and numFour. This method will add the four numbers together and return the result. However, it will not add the numbers together like numOne + numTwo + numThree + numFour, but instead it will call the add method that you created in question 1 thrice to compute the sum of the four numbers and return that result (an integer). Call this method inside the main method and store the result in a variable called resultThree. Print this variable using the println statement.
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        return add(add(numOne, numTwo), add(numThree, numFour));
    }

//  4. Write a method called printMe. This method will have one parameter called toBePrinted. This method will simply print the content that was passed to the method call (i.e. print whatever value toBePrinted was initialized to when printMe was called). Call this method inside the main method.
    public static void printMe(String toBePrinted){
        System.out.println(toBePrinted);
    }
}
