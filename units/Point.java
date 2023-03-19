package units;

public class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected int getPointX() {return x;}

    protected int getPointY() {return y;}

    protected boolean isLeft(Point opponent) {
        return x < opponent.x;
    }

    protected double getDistance(Point opponent) {
        return Math.sqrt(Math.pow(this.x - opponent.x, 2) + Math.pow(this.y - opponent.y, 2));
    }

    public Point chooseWay(Point opponent) {
        return new Point(x - opponent.x, y - opponent.y);
    }
}
