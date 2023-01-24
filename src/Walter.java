public class Walter extends Human {
    private String phrase = "-Он-то?";

    public Walter(String name, String status) {
        super(name, status);
    }

    public String getPhrase() {
        return phrase;
    }

    public void goTo() {
        System.out.println("Вошел" + " " + getName() + " " + status);
    }


    static class Wife {
        static String name;
        static String status;
        private String phrase = "-Да что уж говорить про Готье...";

        public Wife(String name, String status) {
            this.name = name;
            this.status = status;
        }

        public String getPhrase() {
            return phrase;
        }

        public static void followWalter() {
            System.out.println("Следом вошла"+ " " + name + ", " + status);
        }

        public String getName() {
            return name;
        }
    }
}
