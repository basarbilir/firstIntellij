public class Cat extends Animal{
    private String name;
    private String owner;

    public  Cat (String name) {
        super(name);
    }

    public  Cat (String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    //public Cat (String name, String owner) {
    //    super(name, owner);
    //}
    @Override
    public String shout() {
        return "miaww miaww";
    }

    public String callOwner() {
        return "love me my dear owner";
    }

    public String shoutOwnName() {
        return this.name;
    }

    public String callOwnerName() {
        return this.owner;
    }
}
