package Misc.MergeSort;

import java.util.*;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    private final List<Integer> array;
    public static final ExecutorService executor = Executors.newCachedThreadPool();

    public Sorter(List<Integer> array) {
        this.array = array;
    }

    @Override
    public List<Integer> call() throws ExecutionException, InterruptedException {
        if (array.size() <= 1) {
            return array;
        }
        int mid = array.size() / 2;

        List<Integer> leftArray = array.subList(0, mid);
        List<Integer> rightArray = array.subList(mid, array.size());

        Future<List<Integer>> leftSorter = executor.submit(new Sorter(leftArray));
        Future<List<Integer>> rightSorter = executor.submit(new Sorter(rightArray));

        List<Integer> leftSortedArray = leftSorter.get();
        List<Integer> rightSortedArray = rightSorter.get();

        return merge(leftSortedArray, rightSortedArray);
    }

    private List<Integer> merge(List<Integer> leftArray, List<Integer> rightArray) {
        List<Integer> sortedArray = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftArray.size() && rightIndex < rightArray.size()) {
            if (leftArray.get(leftIndex) < rightArray.get(rightIndex)) {
                sortedArray.add(leftArray.get(leftIndex));
                leftIndex++;
            } else {
                sortedArray.add(rightArray.get(rightIndex));
                rightIndex++;
            }
        }

        while (leftIndex < leftArray.size()) {
            sortedArray.add(leftArray.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex < rightArray.size()) {
            sortedArray.add(rightArray.get(rightIndex));
            rightIndex++;
        }

        return sortedArray;
    }

    public static void printArray(List<Integer> array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> array = new ArrayList<>(Arrays.asList(12, 11, 13, 5, 6, 7));
        System.out.println("Original Array:");
        printArray(array);

        Future<List<Integer>> task = executor.submit(new Sorter(array));
        List<Integer> sortedArray = task.get();
        array.clear();
        array.addAll(sortedArray);

        System.out.println("Sorted Array:");
        printArray(array);

        executor.shutdown();
    }
}
