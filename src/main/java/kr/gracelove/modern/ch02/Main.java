package kr.gracelove.modern.ch02;


import kr.gracelove.modern.ch02.basic.FirstStep;
import kr.gracelove.modern.ch02.parameterization.AppleGreenColorPredicate;
import kr.gracelove.modern.ch02.parameterization.AppleHeavyWeightPredicate;
import kr.gracelove.modern.ch02.parameterization.FourthStep;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED)
        );

        List<Apple> heavyApples = FourthStep.filterApples(inventory, new AppleHeavyWeightPredicate());
        heavyApples.forEach(System.out::println);

        List<Apple> greenApples = FourthStep.filterApples(inventory, new AppleGreenColorPredicate());
        greenApples.forEach(System.out::println);
    }
}
