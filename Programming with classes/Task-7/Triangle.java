public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    private final double ab;
    private final double bc;
    private final double ca;

    public Triangle(Point a, Point b, Point c) throws TriangleDoesNotExistsException {
        checkPoints(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
        this.ab = a.distanceTo(b);
        this.bc = b.distanceTo(c);
        this.ca = c.distanceTo(a);
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public double getPerimeter() {
        return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
    }

    public double getSquare() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }

    public Point getMediansPointOfIntersection() {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(x, y);
    }

    private boolean isTriangleExists(Point a, Point b, Point c) {
        return Math.abs((a.getX() - c.getX()) * (b.getY() - c.getY()) * (b.getX() - c.getX()) * (a.getY() - c.getY())) == 0;
    }

    private void checkPoints(Point a, Point b, Point c) throws TriangleDoesNotExistsException {
        if (!isTriangleExists(a, b, c)) {
            throw new TriangleDoesNotExistsException();
        }
    }
}
