package org.example;

import java.util.ArrayList;

public class BubbleSort implements SortServiceLib{

    private int changeCnt = 0;

    @Override
    public void sort(ArrayList<Integer> arr) {
        changeCnt = 0;
        // 외곽 루프: 배열의 끝부터 차례로 정렬된 원소가 쌓임
        for (int i = 0; i < arr.size() - 1; i++) {
            // 내부 루프: 인접한 두 요소를 비교하며 큰 값을 뒤로 보냄
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    changeCnt++;
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public int getChangeCnt() {
        return changeCnt;
    }
}
