public class Triangle extends Shape{

    private int height;
    private int x;

    public Triangle(int height, int x) {
        this.height = height;
        this.x = x;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int calculateArea() {
        return this.height*this.x/2;
    }
}
