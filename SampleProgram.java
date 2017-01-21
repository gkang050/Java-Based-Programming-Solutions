/*

Sample Program: To print a line.
 
Points to notice: 
 * All code resides within class. Program is same as the class name as per convention and Java is case-sensitive.
 * Else tehre will bee compilation error.This convention makes it easier to organize programs.
 * Compiler needs that source file uses .java extension
 * Running program from CMD terminal:
   a) First set javac  ( java compiler) path variable which resides in bin folder of JDK
   b) In cmd, route to path where file is saved and then, compile the code by typing >javac SampleProgram.java 
   c) This creates the file SampleProgram.class which has its bytecode version. To actually run it, type on terminal > java SampleProgram
**/
public class SampleProgram {
    
    public static void main(String args[])
    {
        System.out.println("Hello! This is a sample program.");
    }
    
}
