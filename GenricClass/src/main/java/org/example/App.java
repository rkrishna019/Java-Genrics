package org.example;

/**
 * Hello world!
 *
 */
 class Data<T> {

    private T obj;

    public void setData (T v){
        obj = v;
    }

    public T getData(){
        return obj;
    }
}
class Test
{
    public static void main( String[] args )
    {
        Data<String> d = new Data<>();
        d.setData("Hello");
        System.out.println( d.getData() );

        Data<String> d1 = new Data<>();
        d1.setData("Hello Radha");
        System.out.println( d1.getData() );

        Data<Integer> d3 = new Data<>();
        d3.setData(100);
        System.out.println(d3.getData());
    }
}
