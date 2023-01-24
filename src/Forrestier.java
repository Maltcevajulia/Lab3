public class Forrestier extends Human{
    private String gender = "мужчина";
    private String phrase = "-Да неужели!";

    public Forrestier(String name, String status) {
        super(name, status);
    }
    public String getPhrase() {
        return phrase;
    }
    public void beLate(boolean parameter) {
        if (parameter) {
            System.out.println(getName() + " извинился за опоздание");
        }
    }
}
