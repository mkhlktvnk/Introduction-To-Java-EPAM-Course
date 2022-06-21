package com.company;

import java.util.ArrayList;

public class Main {
    public static long findMaxDistanceBetweenPoints(ArrayList<Point> points) {
        long maxDistance = points.get(0).distanceBetween(points.get(1));
        for (Point point : points) {
            for (Point next : points) {
                long distance = point.distanceBetween(next);
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
            }
        }
        return maxDistance;
    }

    public static ArrayList<Point> findPointsWithMaxDistance(ArrayList<Point> points) {
        ArrayList<Point> pointsWithMaxDistance = new ArrayList<>();
        long maxDistance = findMaxDistanceBetweenPoints(points);
        for (Point point : points) {
            for (Point next : points) {
                if (point.distanceBetween(next) == maxDistance
                        && !pointsWithMaxDistance.contains(next)
                        && !pointsWithMaxDistance.contains(point)) {
                    pointsWithMaxDistance.add(point);
                    pointsWithMaxDistance.add(next);
                }
            }
        }
        return pointsWithMaxDistance;
    }

    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>() {{
            add(new Point(1, 2));
            add(new Point(3, 4));
            add(new Point(-10, 12));
            add(new Point(-1000, 213));
            add(new Point(-321, 325));
            add(new Point(0, 0));
            add(new Point(5, 4));
        }};
        System.out.println(findPointsWithMaxDistance(points));
    }
}
