package ru.netology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        for (int positive : intList) {
            if (positive > 0 && positive % 2 == 0) {
                pos.add(positive);
            }
        }
        Collections.sort(pos);
        System.out.println(pos);
    }
}
