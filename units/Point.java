package units;

public class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point targetCoordinate) {
        return Math.sqrt(Math.pow(this.x - targetCoordinate.x, 2) + Math.pow(this.y - targetCoordinate.y, 2)); 
    }
}
