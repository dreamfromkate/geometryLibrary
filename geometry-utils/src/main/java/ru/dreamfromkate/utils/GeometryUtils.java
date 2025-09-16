package ru.dreamfromkate.utils;

import ru.dreamfromkate.interfase.Shape;

public final class GeometryUtils {
    private GeometryUtils() {}

    public static int compareByArea(Shape s1, Shape s2) {
        return Double.compare(s1.getArea(), s2.getArea());
    }

    public static int compareByPerimeter(Shape s1, Shape s2) {
        return Double.compare(s1.getPerimeter(), s2.getPerimeter());
    }

    public static double cmToInches(double cm) {
        return cm / 2.54;
    }

    public static double inchesToCm(double inches) {
        return inches * 2.54;
    }
}
