import java.util.ArrayList;

public class Narrator {
    private ArrayList<String> phrases = new ArrayList<>();
    private int numberOfPhrase;

    public void addPhrase(String phrase) {
        phrases.add(numberOfPhrase, phrase);
        numberOfPhrase++;
    }
    public void sayPhrase(int i) {
        int a = (int) Math.ceil(Math.random()*8);
        System.out.println(phrases.get(a));
    }
}
