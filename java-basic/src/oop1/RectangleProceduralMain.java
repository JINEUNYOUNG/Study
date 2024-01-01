package oop1;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 8;
        rectangle.height = 8;

        int area = rectangle.caculateArea();
        System.out.println(area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println(perimeter);

        boolean sqaure = rectangle.isSquare();
        System.out.println(sqaure);
    }
}
