public class Marel extends Human {
    private String phrase = "-В самом деле?";

    public Marel(String name, String status) {
        super(name, status);
    }
    public String getPhrase() {
        return phrase;
    }
    public void sayPhrase(){
        System.out.println("-Здравствуй, Мадлена!");
    }
    public void goTo(){
        System.out.println(name + "шла");
    }
}

