package org.example;

public class GenricMethod {

//    static <E> void Show(E [] list){
      static <E> void Show(E...list){
        for(E x:list){
            System.out.println(x);
        }
    }
    public static void main(String args[]){
//        Show(new String[] {"Hii", "Hello", "Hey!!"});
//        Show(new Integer[] {10,20,30});
        Show( "Hii", "Hello", "Hey!!");
        Show(10,20,30);

   }
}
