package org.example;

import java.util.ArrayList;

public class Profiler {
    private ArrayList<Integer> data;
    private SortServiceLib lib;

    private ArrayList<Integer> sortedData;  // 원본 데이터 유지 위해 추가 필드 선언
    private int changeCnt;                  // runLib에 의한 결과 저장 위한 추가 필드 선언

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    public void setLib(SortServiceLib lib) {
        this.lib = lib;
    }

    public void runLib() {
        this.sortedData = new ArrayList<>(data);
        this.lib.sort(sortedData);
        this.changeCnt = lib.getChangeCnt();
    }

    public void showResult() {
        System.out.println("정렬결과:"+sortedData);
        System.out.println("swap횟수:"+changeCnt+"회");
        System.out.println("----------------------");
    }
}
