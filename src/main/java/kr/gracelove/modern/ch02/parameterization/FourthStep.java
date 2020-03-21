package kr.gracelove.modern.ch02.parameterization;


import kr.gracelove.modern.ch02.Apple;

import java.util.ArrayList;
import java.util.List;

public class FourthStep {
    public static List<Apple> filterApples(List<Apple> apples, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
