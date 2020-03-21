package kr.gracelove.modern.ch02.basic;

import kr.gracelove.modern.ch02.Apple;

import java.util.ArrayList;
import java.util.List;

import static kr.gracelove.modern.ch02.Color.GREEN;

public class FirstStep {

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
}
