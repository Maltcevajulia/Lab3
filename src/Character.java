public abstract class Character implements HumanInterface {
    String name;
    String status;

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }
    public abstract void sayPhrase();

}