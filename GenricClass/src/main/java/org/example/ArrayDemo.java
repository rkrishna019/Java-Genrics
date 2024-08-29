package org.example;

@SuppressWarnings("Unchecked")
 class Demo<T> {

    T arr[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        arr[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }

    }
}
 public class ArrayDemo{
    public static void main(String[] args){

        Demo<Integer> arr1 = new Demo<>();
        arr1.append(10);
        arr1.append(20);

        arr1.display();

        Demo<String> arr2 = new Demo<>();
        arr2.append("Hello");
        arr2.append("World");

        arr2.display();
    }
}

