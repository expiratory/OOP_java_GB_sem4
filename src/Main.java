import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<String> myBox = new Box<>("Hi");
        myBox.showType();
        System.out.println(myBox.getObj());

        Box<Integer> integerBox = new Box<>(1);
        Box<Integer> anotherIntegerBox = new Box<>(2);
        int sum = integerBox.getObj() + anotherIntegerBox.getObj();
        System.out.println(sum);

        Arrays<Double> test = new Arrays<>(1.0,2.0,3.0,4.0);
        System.out.println(test.avg());
        Arrays<Integer> test1 = new Arrays<>(1,2,3,4);
        System.out.println(test.sameAvg(test1));
    }
}
