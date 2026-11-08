package StackDemo;
import java.util.Arrays;
public class main {
    static void main() {
            ArrayStack<String> names = new ArrayStack<>();
            names.push("Ali");
            names.push("Ahmed");
            names.push("Hawa");

            String removed = names.pop();
            System.out.println("removed: " + removed);
            names.displayElements();

            System.out.println("size: " + names.size());
            System.out.println("isEmpty: " + names.isEmpty());

            System.out.println("top element: " + names.peek());
        }
    }

