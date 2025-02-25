package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double x1 = this.x;
        double y1 = this.y;


//        double value=Math.sqrt((x*this.y - x*this.x) * (x*this.y - x*this.x) +

//                (y*this.y - y*this.x) * (y*this.y - y*-this.x));


        return Math.sqrt(((x1 - 0) * (x1 - 0)) + ((y1 - 0) * (y1 - 0)));
    }

    public double distance(int x, int y) {
        double x1 = this.x;

        double y1 = this.y;

        double x2 = x;

        double y2 = y;

//        double value=Math.sqrt((x*this.y - x*this.x) * (x*this.y - x*this.x) +

//                (y*this.y - y*this.x) * (y*this.y - y*this.x));


        //d(A,B)=SQRT(xB-xA)*(xB-xA)+(yB-yA)*(yB-yA)

        return Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
    }


    public double distance(Point point) {
        double x1 = this.x;

        double y1 = this.y;

        double x2 = point.x;

        double y2 = point.y;

//        double value=Math.sqrt((x*this.y - x*this.x) * (x*this.y - x*this.x) +

//                (y*this.y - y*this.x) * (y*this.y - y*this.x));

        return Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
    }

}
