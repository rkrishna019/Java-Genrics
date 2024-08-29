package org.example;

public class BoundedMethods {



    static <E extends Number> void Show(E... list) { // This method will only accept number type
        for (E x : list) {
            System.out.println(x);
        }
    }

    public static void main(String args[]) {

//        Show("Hii", "Hello", "Hey!!"); This line will give error
        Show(10, 20, 30);

    }
}
