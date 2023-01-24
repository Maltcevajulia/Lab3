public class Dyurua extends Human {
    private String phrase = "-Как замечательно!";
    private Feelings feelings;
    public Dyurua(String name, String status) {
        super(name, status);
    }

    public String getPhrase() {
        return phrase;
    }

    public void setFeelings(Feelings feelings) {
        this.feelings = feelings;
    }

    public void bowDown() {
        System.out.println(getName() + " " + "поклонился");
    }

    public void beAfraid() {


        setFeelings(Feelings.EMBARRASED);

        System.out.println(getName()+ " " + Feelings.EMBARRASED + ", ведь он" + " " + Feelings.BEAFRAID);
        }
    }