package com.example.geometryutils;

public class GeometryUtils {

    public static double convertSquareMetersToSquareFeet(double squareMeters) {
        return squareMeters * 10.7639;
    }

    public static double convertSquareFeetToSquareMeters(double squareFeet) {
        return squareFeet / 10.7639;
    }
}
