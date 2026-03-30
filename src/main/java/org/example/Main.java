package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Profiler profiler = new Profiler();


        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,2,4,1,3,9));
        profiler.setData(input);

        // 선택 정렬
        System.out.println("selection sort 테스트");
        profiler.setLib(new SelectionSort());
        profiler.runLib();
        profiler.showResult();

        // 버블 정렬
        System.out.println("bubble sort 테스트");
        profiler.setLib(new BubbleSort());
        profiler.runLib();
        profiler.showResult();

    }
}