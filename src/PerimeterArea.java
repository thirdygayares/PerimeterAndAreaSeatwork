public class PerimeterArea {
    int length;
    int width;
    public PerimeterArea(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return width * length;
    }

    public int getPerimeter() {
        return 2*(width + length);
    }

}
