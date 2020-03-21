package kr.gracelove.modern.ch02.basic;

import kr.gracelove.modern.ch02.Apple;
import kr.gracelove.modern.ch02.Color;

import java.util.ArrayList;
import java.util.List;

public class ThirdStep {
    public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weight)) {
                result.add(apple);
            }
        }
        return result;
    }
}
