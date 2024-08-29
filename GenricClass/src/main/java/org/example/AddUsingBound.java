

public class AddUsingBound <T > {

    public <T extends Number> void add(T a, T b) {

        System.out.println("Sum of the number is " + (a.intValue()+b.intValue()));
    }
    public static void main(String args[]){

        AddUsingBound<Integer> aub = new AddUsingBound<>();
        aub.add(10,20);

        AddUsingBound<Integer> aub1 = new AddUsingBound<>();
        aub.add(15.9f,25.5f);
    }
}
