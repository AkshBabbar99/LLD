package Misc.Streams_Lambdas;

import java.util.*;
import java.util.stream.*;

class StreamClient {
    public static void main(String[] args) {

        List<Integer> list = List.of(2, 72, 3, 49, 68, 62, 10, 1, 9, 8, 9, 12, 10, 10);

        Stream<Integer> stream = list.stream();

        //filter all even numbers
        // filter is an intermediate method that returns back a stream object
        // collect is a terminal method that helps close the stream and get back the data
        // multiple intermediate methods can be chained together, but only one terminal method can be invoked on a stream
        // Once you invoke a terminal method, the stream is changed to a closed state and cannot be used again
        List<Integer> l1 = list.stream()
                .filter((x) -> x % 2 == 0)
                .sorted(Integer::compare)
                .map((x) -> x*x)
                .toList();

        System.out.println(l1.toString());

        List<Integer> l2 = list.stream()
                .filter((x) -> x % 2 == 0)
                .sorted(Integer::compare)
                .map((x) -> x*x)
                .distinct()
                .toList();
        System.out.println(l2.toString());


        Optional<Integer> randomNum =
            list.stream()
                .filter(x -> x % 2 == 0)
                .sorted(Integer::compare)
                .map(x -> x*x)
                .distinct()
                .findAny();
        if(randomNum.isEmpty()){
            System.out.println("No even number found");
        }
        Integer randomValue = randomNum.get();

    }
}
