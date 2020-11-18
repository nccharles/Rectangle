package models;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {
    private int height;
    private int width;
    private static ArrayList<Rectangle> mInstances = new ArrayList<>();
    private Boolean shape;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        this.shape = isRectSquare();
        this.mInstances.add(this);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public static ArrayList<Rectangle> getAll() {
        return mInstances;
    }
    public static List<Rectangle> all() {
        return mInstances;
    }
    public boolean getShape(){
        return shape;
    }
    public int area(){
        return width*height;
    }
    public boolean isRectSquare(){
        if (height == width){
            return true;
        }
        else {
            return false;
        }
    }

}