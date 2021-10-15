import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class lamda {
    public static void main(String[] args) {

//        System.out.printf(
//                "sum = %d", IntStream.rangeClosed(1,10).sum()
//        );


      IntStream intStream = IntStream.rangeClosed(1, 10);
//       System.out.println(intStream.map((int x) -> {return x * 2;}).sum());
//        System.out.println(intStream.filter(x -> x % 2 == 0).sum());
        System.out.println(intStream.filter(x -> x % 2 == 0).map(x -> x * 3).sum());


//        int total = 0;
//        for (int number = 1; number <= 20; number++){
//            if (number % 2 == 0){
//                total += number;
//            }
//        }
//        System.out.println(total);



//        intStream.forEach(System.out::print);
//        System.out.println(intStream.count());
//        System.out.println(intStream.reduce(0,(x, y) -> x + y * y));




    }
}
