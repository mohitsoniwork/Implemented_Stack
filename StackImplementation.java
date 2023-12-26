import java.io.*;
import java.util.*;




public class StackImplementation {
    public static void main(String[] args) {
        Console con = System.console();
        Object name;
        Stack1 mystack = new Stack1();

        System.out.println("Enter values");

        try {
            // Assuming you know the number of names you want to input
            int numberOfNames = 10;

            for (int i = 0; i < numberOfNames; i++) {
                name = con.readLine();
                mystack.push1(name);
            }

            System.out.println("Names in reverse");

            for (int i = 0; i < numberOfNames; i++) {
                System.out.println(mystack.pop1());
            }

            System.out.println("Is the stack displayed in reverse");
            System.out.println(mystack.empty1());

        } catch (UnderFlowException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
