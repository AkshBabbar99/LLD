package Misc.Streams_Lambdas;

import java.util.*;

public class LambdaClient {
    public static void main(String[] args) {
        //With functional interfaces, we can use lambda expressions to create instances of the interface
        // rather than creating a class that implements the interface.
        Runnable task = () -> System.out.println("Running Lambda task");

        Thread t = new Thread(task);
        t.start();

        List<Integer> list = Arrays.asList(31, 22, 13, 46, 5);
        list.sort((a, b) -> {
            if (a % 2 == b % 2) {
                return b - a;
            }
            else if (a % 2 == 0) {
                return -1;
            } else {
                return 1;
            }
        });
        System.out.println(list.toString());
    }
}
