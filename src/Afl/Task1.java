package Afl;

public class Task1 {
    public static void main (String[]args){
        //1. Create a two-string variable, concatenate the two variables and print out the result.

        String name;
        String message;
        name= "AFL" ;
        message = "hello ";
        System.out.println(message + name);

        //concatenated into a variable
        String concatMessage;
        concatMessage = message + name;
        System.out.println(concatMessage);

    }
}
