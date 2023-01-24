public class Girl extends Human {
    private String phrase = "-Ой, а кто это?";
    private int confidence = 1;

    public Girl(String name, String status) {
        super(name, status);
    }
    public String getPhrase() {
        return phrase;
    }

    public void goTo(String name) {
        System.out.println("Зашла" + " " + getName() +" " + status);
    }

    public void sayPhrase() {
        System.out.println("-Здравствуйте, кузина - сказала девочка");
    }


    }

