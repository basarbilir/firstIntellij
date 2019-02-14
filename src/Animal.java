public abstract class Animal {
    private String name;
    private String owner;

    public Animal () {};

    public Animal (String name) {
        this.name = name;
    }

    public Animal (String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    abstract public String shout ();
}
