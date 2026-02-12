package week03;

import week03.geometry.Segment;

public class Lecture {
    public static void main(String[] args) {
        Segment s = new Segment(3.14f, 1.1f, 2.0f, 3.0f);
        System.out.println("x1(p1_x) = " + s.getP1().getX());
        System.out.println("y2(p2_y) = " + s.getP2().getY());
    }
}


