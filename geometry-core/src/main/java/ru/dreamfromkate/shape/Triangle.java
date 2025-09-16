package ru.dreamfromkate.shape;

import ru.dreamfromkate.interfase.Shape;

public class Triangle implements Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c){
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Треугольника с такими сторонами не существует!");
        }
        if (a < 0 && b < 0 && c < 0) {
            throw new IllegalArgumentException("Стороны должны быть положительными");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
