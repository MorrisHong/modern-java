package kr.gracelove.modern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Basic2 {


    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red")
        );

        List<Apple> heavyApples = filterApples(inventory, (apple -> apple.getWeight()>150));
        List<Apple> greenApples = filterApples(inventory, (apple -> "green".equals(apple.getColor())));
        heavyApples.forEach(System.out::println);
        System.out.println("------------------");
        greenApples.forEach(System.out::println);
    }


}
