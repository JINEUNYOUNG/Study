package oop1;

public class Rectangle {
    int width;
    int height;

    int caculateArea(){
        return width * height;
    }

    int calculatePerimeter(){
        return 2 * (width + height);
    }

    boolean isSquare(){
        return width == height;
    }

}
