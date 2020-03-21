package kr.gracelove.modern.ch02;

public enum Color {
    RED("red"), GREEN("green");

    private String colorName;

    Color(String color) {
        this.colorName = color;
    }

    public String getColorName() {
        return colorName;
    }
}