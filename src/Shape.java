public abstract class Shape {

    public int basar;
    public int yunus;

    public Shape(){}

    public Shape(int bassar){
        this.basar = basar;
    }

    public Shape(int basar,int yunus){
        this.basar = basar;
        this.yunus = yunus;
    }
    abstract public int calculateArea();

}
