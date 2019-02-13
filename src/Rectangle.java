

public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle( int height) {
        super(height);
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public Integer getWidth() {
        return this.width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }


    @Override
    public int calculateArea() {
        return this.width*this.height;
    }
}

