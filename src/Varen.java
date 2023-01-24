public class Varen extends Human implements Kissable {
    private String phrase = "-Это точно он!";
    private int attraction;
    public String getPhrase() {
        return phrase;
    }

    public Varen(String name, String status) {
        super(name, status);
    }


    public void enterRoom(){
        System.out.println("За ним вошел" + " " + getName());
    }
    public void bend(){
        System.out.println(name + " " + "нагнулся");
        attraction += (int) Math.ceil(Math.random()*13);
    }


    public void askQuestion(){
        System.out.println(name +" " + "спросил: читали ли гости о процессе Готье?");
    }

    public void kiss(String subject, String object) {
System.out.println(subject + " "+ "поцеловал" + " "+ object);
    }

    @Override
    public void goTo() {
        System.out.println(status + " " + name + " " + "подошел к Форестье");
    }

    @Override
    public void sayPhrase() {
System.out.println("Вы читали о процессе Готье? Занятная история!");
    }

    static class tailCoat{
        private String name;
        private String state;
        public tailCoat(String state, String name){
            this.name = name;
            this.state = state;
        }
        public void shine() {
            System.out.println(name + " " + state);
        }
    }
}
