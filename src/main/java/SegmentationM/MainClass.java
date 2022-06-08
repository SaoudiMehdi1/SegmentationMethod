package SegmentationM;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("One element " + Segmentation(list, 1));
        System.out.println("Two elements " + Segmentation(list, 2));
        System.out.println("Three elements " + Segmentation(list, 3));
        System.out.println("Four elements " + Segmentation(list, 4));

    }

    //Segmentation using Java 8 (Collectors.groupingBy)
    public static ArrayList<List<Integer>> Segmentation(List<Integer> al, int size){
        Collection mp= al.stream()
                .collect(Collectors.groupingBy(t -> (t-1)/size))
                .values();
        ArrayList<List<Integer>> toList = new ArrayList<List<Integer>>(mp);
        return toList;
    }

}
