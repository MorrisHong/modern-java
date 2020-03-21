package kr.gracelove.modern.ch02.parameterization;


import kr.gracelove.modern.ch02.Apple;

import static kr.gracelove.modern.ch02.Color.GREEN;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
