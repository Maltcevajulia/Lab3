public class Rivale extends Human {
    private String phrase = "Очень неожиданно...";
    public Rivale(String name, String status) {
        super(name, status);
    }
    public String getPhrase() {
        return phrase;
    }
    public void goTo() {
        System.out.println("Появился" + " " + name + ", " + status);
    }

    public void sayPhrase() {
        System.out.println(name + "поздоровался");
    }
}